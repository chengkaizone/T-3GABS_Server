package com.tolo.t3gabs.server.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import com.tolo.t3gabs.common.entities.CabinClass;
import com.tolo.t3gabs.common.entities.Flight;
import com.tolo.t3gabs.common.entities.Route;
import com.tolo.t3gabs.common.exceptions.BusinessException;
import com.tolo.t3gabs.common.util.ConnectionUtil;
import com.tolo.t3gabs.common.util.ErrorMessageUtil;
import com.tolo.t3gabs.server.dao.FlightDao;
import com.tolo.t3gabs.server.service.DaoFactory;
import com.tolo.t3gabs.server.service.ServerContext;

public class FlightDaoImplForMySql implements FlightDao{

	@SuppressWarnings("deprecation")
	public List<Flight> searchFlights(String depAirportCode, String arrAirportCode, Date date) throws Exception {
		Connection conn=null;
		PreparedStatement pstm=null;
		ResultSet rs=null;
		conn=ConnectionUtil.getCurrentConnection();

		String sqlStr="SELECT flight_id,flight_num,fl_departure_date,fl_arrival_date,route_id,plane_id," +
				"f_seats_remain,b_seats_remain,e_seats_remain,current_classes,current_discount,current_price," +
				"tax1_price,tax2_price,current_order FROM flight " +
				" WHERE route_id=? AND fl_departure_date LIKE  ?  ";
		
	
		pstm=conn.prepareStatement(sqlStr);
		int month=date.getMonth()+1;
		int day=date.getDate();
		String dateStr=(date.getYear()+1900)+"-"+(month<10?"0"+month:""+month)+"-"+(day<10?"0"+day:""+day);
		Route rou=ServerContext.getRouteByAirportsCode(depAirportCode, arrAirportCode);
		if(rou==null){
			throw new BusinessException(ErrorMessageUtil.getErrorMessage(1013));
		}
		
		int routeId=rou.getId();
		pstm.setInt(1, routeId);
		pstm.setString(2, dateStr+"%");
		rs=pstm.executeQuery();
		System.out.println(dateStr+":"+routeId);
		List<Flight> list=new ArrayList<Flight>();
		
		while(rs.next()){
			
			Flight f=new Flight();
			
			f.setFlightId(rs.getString("flight_id"));
			f.setFlightNum(rs.getString("flight_num"));
			
			java.util.Date depDate = new java.util.Date(rs.getDate("fl_departure_date").getTime());
			String[] ary1 = rs.getString("fl_departure_date").split("[\\s:]");
			depDate.setHours(Integer.parseInt(ary1[1]));
			depDate.setMinutes(Integer.parseInt(ary1[2]));
			f.setDepDate(depDate);
			
			java.util.Date arrDate = new java.util.Date(rs.getDate("fl_arrival_date").getTime());
			String[] ary2 = rs.getString("fl_arrival_date").split("[\\s:]");
			arrDate.setHours(Integer.parseInt(ary2[1]));
			arrDate.setMinutes(Integer.parseInt(ary2[2]));
			f.setArrDate(arrDate);
			
			f.setRoute(ServerContext.getRouteById(rs.getInt("route_id")));
			f.setMinTicketPrice(rs.getDouble("current_price"));
			List<CabinClass> sccList=new ArrayList<CabinClass>();
			String currentClasses=rs.getString("current_classes");
			String[] ccs=currentClasses.split(",");
			for(String str:ccs){
				CabinClass cc=ServerContext.getCabinClassByChar(str);
				if(cc!=null){
					sccList.add(cc);
				}
			}
			f.setSelectableClass(sccList);
			f.setF_seates_remian(rs.getInt("f_seats_remain"));
			f.setC_seats_remain(rs.getInt("b_seats_remain"));
			f.setY_seats_remain(rs.getInt("e_seats_remain"));
			f.setTax1(rs.getDouble("tax1_price"));
			f.setTax2(rs.getDouble("tax2_price"));
			f.setPlane(ServerContext.getPlaneById(rs.getInt("plane_id")));
			
			list.add(f);
			
		}
		return list;
	}

	public Flight getFlightById(String flightId) throws Exception{
		Connection conn=null;
		PreparedStatement pstm=null;
		ResultSet rs=null;
		conn=ConnectionUtil.getCurrentConnection();

		String sqlStr="select flight_id,flight_num,fl_departure_date,fl_arrival_date,route_id,plane_id,f_seats_remain,b_seats_remain,e_seats_remain,current_classes,current_discount,current_price,tax1_price,tax2_price from flight " +
		" where flight_id=? ;";
		
		pstm=conn.prepareStatement(sqlStr);
		pstm.setString(1,flightId);
		rs=pstm.executeQuery();
		if(rs.next()){
			Flight f=new Flight();
			
			f.setFlightId(rs.getString("flight_id"));
			f.setFlightNum(rs.getString("flight_num"));
			f.setDepDate(rs.getDate("fl_departure_date"));
			f.setArrDate(rs.getDate("fl_arrival_date"));
			f.setRoute(ServerContext.getRouteById(rs.getInt("route_id")));
			f.setMinTicketPrice(rs.getDouble("current_price"));
			List<CabinClass> sccList=new ArrayList<CabinClass>();
			String currentClasses=rs.getString("current_classes");
			String[] ccs=currentClasses.split(",");
			for(String str:ccs){
				CabinClass cc=ServerContext.getCabinClassByChar(str);
				if(cc!=null){
					sccList.add(cc);
				}
			}
			f.setSelectableClass(sccList);
			f.setF_seates_remian(rs.getInt("f_seats_remain"));
			f.setC_seats_remain(rs.getInt("b_seats_remain"));
			f.setY_seats_remain(rs.getInt("e_seats_remain"));
			f.setTax1(rs.getDouble("tax1_price"));
			f.setTax2(rs.getDouble("tax2_price"));
			
			return f;
		}else{
			throw new BusinessException(ErrorMessageUtil.getErrorMessage(1009));
		}
	}


	
	public void cancelOrder(String flightId, String cabinType) throws Exception {
		Connection conn=null;
		PreparedStatement pstm=null;
		
		conn=ConnectionUtil.getCurrentConnection();
		
		String cabinName=cabinType+"_seats_remain";
		
		pstm=conn.prepareStatement("update flight set "+cabinName+" = "+cabinName+"+1 where flight_id= ?;");
		pstm.setString(1,flightId);
		int i=pstm.executeUpdate();
		if(i!=1){
			throw new BusinessException(ErrorMessageUtil.getErrorMessage(1009));
		}
	}

	public int orderSeats(String flightId, String cabinType) throws Exception {
		Connection conn=null;
		PreparedStatement pstm=null;
		ResultSet rs=null;
		conn=ConnectionUtil.getCurrentConnection();
		
		String cabinName=cabinType+"_seats_remain";
		int remianSeats=0;
		int seatsOrder=-1;
	
		pstm=conn.prepareStatement("select "+cabinName+" from flight where flight_id= ? ;");
		pstm.setString(1,flightId);
		rs=pstm.executeQuery();
		if(rs.next()){
			remianSeats=rs.getInt(1);
		}else{
			throw new BusinessException(ErrorMessageUtil.getErrorMessage(1009));
		}
		if(remianSeats>0){
			pstm=conn.prepareStatement("update flight set "+cabinName+" = "+cabinName+"-1,current_order=current_order+1 where flight_id= ?;");
			pstm.setString(1,flightId);
			int i=pstm.executeUpdate();
			if(i==1){
				pstm=conn.prepareStatement("select current_order from flight where flight_id=?");
				pstm.setString(1, flightId);
				rs=pstm.executeQuery();
				if(rs.next()){
					seatsOrder=rs.getInt(1);
				}
			}else{
				throw new BusinessException(ErrorMessageUtil.getErrorMessage(1009));
			}
		}else{
			throw new BusinessException(ErrorMessageUtil.getErrorMessage(1010));
		}

		return seatsOrder;
	}

	/**
	 * 
	 */
	@Override
	public void updateFlight(Map<String, Object> data, String where,
			String[] args) throws Exception {
		// TODO Auto-generated method stub
		
	}

	
	@SuppressWarnings("deprecation")
	public static void main(String[] arga) throws Exception{
		
		Date d=new Date();
		d.setMonth(9);
		d.setDate(25);
		d.setYear(2010-1900);
		List<Flight> ff=new FlightDaoImplForMySql().searchFlights("PEK","SHA",d);
		System.out.println(ff);
		
		Flight f=DaoFactory.getFlightDao().getFlightById("N201010251201");
		System.out.println(f);
		
	}
	
	@Override
	public String[] searchFlights(String flight_num) throws Exception {
		String[] s=new String[3];
		Connection conn=null;
		PreparedStatement pstm=null;
		ResultSet rs=null;
		conn=ConnectionUtil.getCurrentConnection();
		String sqlStr="SELECT route_id,fl_departure_date,fl_arrival_date FROM flight WHERE flight_num=? ";
		pstm=conn.prepareStatement(sqlStr);
		pstm.setString(1, flight_num);
		rs=pstm.executeQuery();
		if (rs.next()) {
			System.out.println("查得到的航线id为"+rs.getString("route_id"));
			s[0]=rs.getString("route_id");
			System.out.println("查得到的出发时间为"+rs.getString("fl_departure_date"));
			s[1]=rs.getString("fl_departure_date");
			System.out.println("查得到的到达时间为"+rs.getString("fl_arrival_date"));
			s[2]=rs.getString("fl_arrival_date");
				return s;
			}
		return s;
	}
}
