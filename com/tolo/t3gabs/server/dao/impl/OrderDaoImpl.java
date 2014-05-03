package com.tolo.t3gabs.server.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.tolo.t3gabs.common.entities.Order;
import com.tolo.t3gabs.common.entities.User;
import com.tolo.t3gabs.common.util.ConnectionUtil;
import com.tolo.t3gabs.server.dao.CabinClassDao;
import com.tolo.t3gabs.server.dao.ContactDao;
import com.tolo.t3gabs.server.dao.FlightDao;
import com.tolo.t3gabs.server.dao.OrderDao;
import com.tolo.t3gabs.server.dao.PassengerDao;
import com.tolo.t3gabs.server.service.DaoFactory;

public class OrderDaoImpl implements OrderDao{
	
	

	@Override
	public Order getOrder(long OrderId) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public List<Order> getOrders(int userId) throws Exception {
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs=null;
		FlightDao flightDao = DaoFactory.getFlightDao();
		PassengerDao psgDao = DaoFactory.getPassengerDao();
		ContactDao contactDao = DaoFactory.getContactDao();
		CabinClassDao cabinClassDao = DaoFactory.getCabinClassDao();
        //线程单例
		conn = ConnectionUtil.getCurrentConnection();
		pstm = conn.prepareStatement("select order_id,order_money,order_date,order_state,flight_id,"+
				"passenger_id,contact_id,cabin_class_id,ticket_price,seats_order from ticket_order " +
				"where user_id=?");
		pstm.setInt(1, userId);//设置?的值
	    rs=pstm.executeQuery();
	    
	    List<Order> list=new ArrayList<Order>();
	    while(rs.next()){
	    	Order order = new Order();
	    	order.setId(rs.getLong("order_id"));
	    	order.setOrderMoney(rs.getDouble("order_money"));
	    	String strDate = rs.getString("order_date");
	    	System.out.println("getDate:"+strDate);
//	    	System.out.println("getOrders中date参数的时间戳:"+date.getTime());
	    	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	    	Date date = sdf.parse(strDate);
	    	System.out.println(date);
	    	order.setOrderDate(date);
	    	order.setFlight(flightDao.getFlightById(rs.getString("flight_id")));
	    	order.setPassenger(psgDao.getPassenger(rs.getInt("passenger_id")));
	    	order.setContact(contactDao.getContact(rs.getInt("contact_id")));
	    	order.setCabinClass(cabinClassDao.getCabinClassById(rs.getInt("cabin_class_id")));
	    	order.setTicketPrice(rs.getDouble("ticket_price"));
	    	order.setSeatOrder(rs.getInt("seats_order"));
	    	
	    	String orderState = rs.getString("order_state");
	    	System.out.println(orderState);
//	    	order.setState(orderState);
	    	if("E".equals(orderState)){
	    		if(date.getTime()-System.currentTimeMillis()>=30*60*1000){
	    			order.setState("L");
	    			modifyOrder(order.getId(), "L");	//更新订单状态
	    		}else{
	    			order.setState(orderState);
	    		}
	    	}else{
	    		order.setState(orderState);
	    	}
	    	list.add(order);
	    }
		return list;
	}
	

	public Order FindOrder(long orderId) throws Exception {
//		Connection conn=null;
//		PreparedStatement pstm=null;
//		PreparedStatement pstm2=null;
//		ResultSet rs=null;
//		ResultSet rs2=null;
//		
//		conn=ConnectionUtil.getCurrentConnection();
//		
//		pstm2=conn.prepareStatement("select order_item_id,flight_id,passenger_id,cabin_class_id,seats_order,ticket_price,append_tax1,append_tax2,total_price where order_id=? ; ");
//		
//		pstm2.setLong(1, orderId);
//		rs2=pstm2.executeQuery();
//		FlightDao flightDao=DaoFactory.getFlightDao();
//		UserDao userDao=DaoFactory.getUserDao();
//		PassengerDao passDao=DaoFactory.getPassengerDao();
//		
//		List<OrderItem> list=new ArrayList<OrderItem>();
//		while(rs2.next()){
//			OrderItem item=new OrderItem();
//			item.setId(rs2.getLong("order_item_id"));
//			item.setFlight(flightDao.getFlightById(rs.getString("flight_id")));
//			item.setPassenger(passDao.getPassenger(rs.getInt("passenger_id")));
//			item.setCabinClass(ServerContext.getCabinClassById(rs.getInt("cabin_class_id")));
//			item.setSeatsOrder(rs.getInt("seats_order"));
//			item.setTicketPrice(rs.getDouble("ticket_price"));
//			item.setTax1Price(rs.getDouble("append_tax1"));
//			item.setTax2Price(rs.getDouble("append_tax2"));
//			item.setTotalPrice(rs.getDouble("total_price"));
//			list.add(item);
//		}
//		
//		pstm=conn.prepareStatement("select order_id,order_money,order_items_id,order_date,order_state,payment_record from ticket_order where order_id= ?;");
//		pstm.setLong(1, orderId);
//		rs=pstm.executeQuery();
//		if(rs.next()){
//			Order order=new Order();
//			order.setId(rs.getLong("order_id"));
//			order.setUser(userDao.getUserById(rs.getInt("user_id")));
//			order.setOrderDate(rs.getDate("order_date"));
//			order.setOrderMoney(rs.getDouble("order_money"));
//			order.setState(rs.getString("order_state"));
//			order.setPaymentRecord(rs.getString("payment_record"));
//			return order;
//			
//		}
//		
		return null;
	}
/***
 * 增加查询语句
 */
	public List<Order> FindOrder(User user) throws Exception {
//		Connection conn=null;
//		PreparedStatement pstm1=null;
//		PreparedStatement pstm2=null;
//		PreparedStatement pstm3=null;
//		PreparedStatement pstm4=null;
//		PreparedStatement pstm5=null;
//		PreparedStatement pstm6=null;
//		ResultSet rs1=null;
//		ResultSet rs2=null;
//		ResultSet rs3=null;
//		ResultSet rs4=null;
//		ResultSet rs5=null;
//		ResultSet rs6=null;
//		conn=ConnectionUtil.getCurrentConnection();
//	
//		pstm1=conn.prepareStatement("select order_id,order_money,order_items_id,order_date,order_state,payment_record from ticket_order where user_id= ?");
//		pstm1.setLong(1, user.getId());
//		rs1=pstm1.executeQuery();
//		ArrayList<Order> orderList=new ArrayList<Order>();
//		while(rs1.next()){
//			Order order=new Order();
//			order.setId(rs1.getLong("order_id"));
//			order.setUser(user);
//			order.setOrderDate(rs1.getDate("order_date"));
//			order.setOrderMoney(rs1.getDouble("order_money"));
//			order.setState(rs1.getString("order_state"));
//			order.setPaymentRecord(rs1.getString("payment_record"));
//			
//			pstm2=conn.prepareStatement("select order_item_id,flight_id,passenger_id,cabin_class_id,seats_order,ticket_price,append_tax1,append_tax2,total_price from order_item where order_id=? ");
//			
//			pstm2.setLong(1, order.getId());
//			rs2=pstm2.executeQuery();
//			FlightDao flightDao=DaoFactory.getFlightDao();
//			PassengerDao passDao=DaoFactory.getPassengerDao();
//			System.out.println(888888);
//			List<OrderItem> list=new ArrayList<OrderItem>();
//			while(rs2.next()){
//				OrderItem item=new OrderItem();
//				item.setId(rs2.getLong("order_item_id"));
				
//				Flight flight=flightDao.getFlightById(rs2.getString("flight_id"));//航班
//				pstm3=conn.prepareStatement("select route_id from flight where flight_id=?");
//			    pstm3.setString(1,flight.getFlightId());
//			    rs3=pstm3.executeQuery();
//			    Route route=new Route();//航线
//			    pstm4=conn.prepareStatement("select from_airport_id,to_airport_id from route where route_id=?");
//			    pstm4.setInt(1, rs3.getInt(1));
//			    rs4=pstm4.executeQuery();
//			    pstm5=conn.prepareStatement("select airport_name from airport where airport_id=?");
//			    pstm5.setInt(1, rs4.getInt(1));
//			    rs5=pstm5.executeQuery();
//			    Airport from=new Airport();//出发机场
//			    from.setName(rs5.getString(1));
//			    pstm6=conn.prepareStatement("select airport_name from airport where airport_id=?");
//			    pstm6.setInt(1, rs4.getInt(2));
//			    rs6=pstm6.executeQuery();
//			    Airport to=new Airport();//到达机场
//			    to.setName(rs6.getString(1));
//			    route.setFromAirport(from);
//			    route.setToAirport(to);
//			    flight.setRoute(route);
				
//				item.setFlight(flight);
//				System.out.println("passenger_id"+rs2.getInt("passenger_id"));
//				item.setPassenger(passDao.getPassenger(rs2.getInt("passenger_id")));
//				item.setCabinClass(ServerContext.getCabinClassById(rs2.getInt("cabin_class_id")));
//				item.setSeatsOrder(rs2.getInt("seats_order"));
//				item.setTicketPrice(rs2.getDouble("ticket_price"));
//				item.setTax1Price(rs2.getDouble("append_tax1"));
//				item.setTax2Price(rs2.getDouble("append_tax2"));
//				item.setTotalPrice(rs2.getDouble("total_price"));
//				list.add(item);
//				
//			}
//			orderList.add(order);
//		}
		return null;
	}

	/**
	 * 
	 */
	public void modifyOrder(long orderId, String state) throws Exception {
		Connection conn=null;
		PreparedStatement pstm=null;
		conn=ConnectionUtil.getCurrentConnection();
		pstm=conn.prepareStatement("update ticket_order set order_state= ? where order_id= ?");
		pstm.setString(1, state);
		pstm.setLong(2, orderId);
		pstm.executeUpdate();
		
	}
	
/**
 * insert 
 */
	public void insertOrder(Order order) throws Exception{
		Connection conn=null;
		PreparedStatement pstm=null;
		conn=ConnectionUtil.getCurrentConnection();
		String sql="insert into ticket_order(order_id,user_id,order_money,order_date,order_state," +
				"payment_record,flight_id,passenger_id,contact_id,cabin_class_id,seats_order," +
				"ticket_price,append_tax1,append_tax2)values(?,?,?,now(),?,?,?,?,?,?,?,?,?,?)";
		pstm=conn.prepareStatement(sql);
		
		pstm.setLong(1, order.getId());
		pstm.setInt(2, order.getUser().getId());
		pstm.setDouble(3, order.getOrderMoney());
//		System.out.println("系统时间:"+System.currentTimeMillis());
//		System.out.println("系统时间:"+new java.sql.Date(System.currentTimeMillis()));
//		pstm.setDate(4, new java.sql.Date(System.currentTimeMillis()));
		pstm.setString(4, "E");
		pstm.setString(5, order.getPaymentRecord());
		pstm.setString(6, order.getFlight().getFlightId());
		pstm.setInt(7, order.getPassenger().getId());
		pstm.setInt(8, order.getContact().getId());
		pstm.setInt(9, order.getCabinClass().getId());
		pstm.setInt(10, order.getSeatOrder());
		pstm.setDouble(11, order.getTicketPrice());
		pstm.setDouble(12, order.getAppendTax1());
		pstm.setDouble(13, order.getAppendTax2());
		pstm.executeUpdate();
	}



	@Override
	public void deleteOrder(long orderId) throws Exception {
		Connection conn = null;
		PreparedStatement pstm = null;
		conn = ConnectionUtil.getCurrentConnection();
		String sql = "delete from ticket_order where order_id=?";
		pstm = conn.prepareStatement(sql);
		pstm.setLong(1, orderId);
		pstm.execute();
	}
}
