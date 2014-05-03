package com.tolo.t3gabs.server.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

import com.tolo.t3gabs.common.entities.Airport;
import com.tolo.t3gabs.common.entities.City;
import com.tolo.t3gabs.common.util.ConnectionUtil;
import com.tolo.t3gabs.server.dao.AirportDao;
import com.tolo.t3gabs.server.service.ServerContext;

/**
 * AirportDao的实现类，该类适应Oracle和MySql数据库。
 *
 */
public class AirportDaoImpl implements AirportDao{

	public Map<Integer,Airport> getAllAirports() throws Exception{
		Connection conn=null;
		Statement stm=null;
		ResultSet rs=null;
		conn=ConnectionUtil.getCurrentConnection();
		stm=conn.createStatement();
		rs=stm.executeQuery("select airport_id,airport_name,province_id,city_id,airport_code,departure_routes_num,arrival_routes_num," +
				"airport_grand,departure_flight_num_per_week,arrival_flight_num_per_week " +
				"from airport;");
		Map<Integer,Airport> map=new HashMap<Integer,Airport>();
		while(rs.next()){
			Airport air=new Airport();
			air.setId(rs.getInt("airport_id"));
			air.setName(rs.getString("airport_name"));
			air.setCode(rs.getString("airport_code"));
			air.setGrand(rs.getString("airport_grand"));
			air.setDepartureRoutesNumber(rs.getInt("departure_routes_num"));
			air.setArrivalRoutesNumber(rs.getInt("arrival_routes_num"));
			air.setDepartureFlightNumPerWeek(rs.getInt("departure_flight_num_per_week"));
			air.setArrivalFlightNumPerWeek(rs.getInt("arrival_flight_num_per_week"));
			air.setProvince(ServerContext.getProvinceById(rs.getInt("province_id")));
			City city=ServerContext.getCityById(rs.getInt("city_id"));
			air.setCity(city);
			air.setFullName(city.getName()+"-"+(air.getName()==null?"":air.getName())+"机场");
			map.put(air.getId(),air);
			
		}
		
		return map;
	}
	

}
