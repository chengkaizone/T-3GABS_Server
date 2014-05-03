package com.tolo.t3gabs.server.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

import com.tolo.t3gabs.common.entities.Plane;
import com.tolo.t3gabs.common.util.ConnectionUtil;
import com.tolo.t3gabs.server.dao.PlaneDao;

public class PlaneDaoImpl implements PlaneDao{

	public Map<Integer, Plane> getAllPlanes() throws Exception{
		Connection conn=null;
		Statement stm=null;
		ResultSet rs=null;
		conn=ConnectionUtil.getCurrentConnection();
		stm=conn.createStatement();
		rs=stm.executeQuery("select plane_id,plane_num,plane_model,plane_manufacturer,max_continue_voyage," +
				"f_cabin_seats,c_cabin_seats,y_cabin_seats,seats_img_uri from plane;");
		Map<Integer,Plane> map=new HashMap<Integer,Plane>();
		while(rs.next()){
			Plane pla=new Plane();
			pla.setId(rs.getInt("plane_id"));
			pla.setNumber(rs.getString("plane_num"));
			pla.setModel(rs.getString("plane_model"));
			pla.setManufacturer(rs.getString("plane_manufacturer"));
			pla.setMaxDistance(rs.getInt("max_continue_voyage"));
			pla.setFirstSeats(rs.getInt("f_cabin_seats"));
			pla.setBusinessSeats(rs.getInt("c_cabin_seats"));
			pla.setEconomySeats(rs.getInt("y_cabin_seats"));
			pla.setPicPath(rs.getString("seats_img_uri"));
			
			map.put(pla.getId(),pla);
			
		}
		
		return map;
	}
	

}
