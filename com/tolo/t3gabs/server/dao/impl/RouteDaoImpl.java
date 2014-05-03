package com.tolo.t3gabs.server.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

import com.tolo.t3gabs.common.entities.Route;
import com.tolo.t3gabs.common.util.ConnectionUtil;
import com.tolo.t3gabs.server.dao.RouteDao;
import com.tolo.t3gabs.server.service.ServerContext;

public class RouteDaoImpl implements RouteDao{

	public Map<Integer, Route> getAllRoutes() throws Exception {
		Connection conn=null;
		Statement stm=null;
		ResultSet rs=null;
		conn=ConnectionUtil.getCurrentConnection();
		stm=conn.createStatement();
		rs=stm.executeQuery("select route_id,from_airport_id,to_airport_id,route_distance,route_base_price,return_route_id,flight_num_per_week from route;");
		Map<Integer,Route> map=new HashMap<Integer,Route>();
		while(rs.next()){
			Route rou=new Route();
			rou.setId(rs.getInt("route_id"));
			rou.setFromAirport(ServerContext.getAirportById(rs.getInt("from_airport_id")));
			rou.setToAirport(ServerContext.getAirportById(rs.getInt("to_airport_id")));
			rou.setDistance(rs.getInt("route_distance"));
			rou.setBaseTicketPrice(rs.getDouble("route_base_price"));
			rou.setFlightNumPerWeek(rs.getInt("flight_num_per_week"));
			map.put(rou.getId(),rou);
			
		}
		
		return map;
	}
	

}
