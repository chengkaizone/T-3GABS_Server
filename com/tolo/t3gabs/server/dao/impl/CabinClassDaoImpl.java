package com.tolo.t3gabs.server.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

import com.tolo.t3gabs.common.entities.CabinClass;
import com.tolo.t3gabs.common.util.ConnectionUtil;
import com.tolo.t3gabs.server.dao.CabinClassDao;

public class CabinClassDaoImpl implements CabinClassDao{

	public Map<Integer, CabinClass> getAllCabinClass()throws Exception {
		Connection conn=null;
		Statement stm=null;
		ResultSet rs=null;
		conn=ConnectionUtil.getCurrentConnection();
		stm=conn.createStatement();
		rs=stm.executeQuery("select cabin_class_id,cabin_class_name,cabin_class_char,refund_charge,limit_condition,cabin_discount,plane_cabin_type,mileage_factor from cabin_class;");
		Map<Integer,CabinClass> map=new HashMap<Integer,CabinClass>();
		while(rs.next()){
			CabinClass cab=new CabinClass();
			cab.setId(rs.getInt("cabin_class_id"));
			cab.setName(rs.getString("cabin_class_name"));
			cab.setClassChar(rs.getString("cabin_class_char"));
			cab.setRefundCharge(rs.getDouble("refund_charge"));
			cab.setRefundable(rs.getString("limit_condition").contains("T"));
			cab.setRescheduable(rs.getString("limit_condition").contains("G"));
			cab.setTransferable(rs.getString("limit_condition").contains("Z"));
			cab.setCabinDiscount(rs.getDouble("cabin_discount"));
			cab.setClassType(rs.getString("plane_cabin_type"));
			cab.setMileageFactor(rs.getDouble("mileage_factor"));
			map.put(cab.getId(),cab);
			
		}
		
		return map;
	}

	@Override
	public CabinClass getCabinClassById(int cabinClassId) throws Exception {
		Connection conn=null;
		PreparedStatement pstm=null;
		ResultSet rs=null;
		conn=ConnectionUtil.getCurrentConnection();
		String sql = "select cabin_class_id,cabin_class_name,cabin_class_char,refund_charge,limit_condition,"+
		"cabin_discount,plane_cabin_type,mileage_factor from cabin_class where cabin_class_id=?";
		pstm=conn.prepareStatement(sql);
		pstm.setInt(1, cabinClassId);
		rs=pstm.executeQuery();
		CabinClass cab = null;
		if(rs.next()){
			cab=new CabinClass();
			cab.setId(rs.getInt("cabin_class_id"));
			cab.setName(rs.getString("cabin_class_name"));
			cab.setClassChar(rs.getString("cabin_class_char"));
			cab.setRefundCharge(rs.getDouble("refund_charge"));
			cab.setRefundable(rs.getString("limit_condition").contains("T"));
			cab.setRescheduable(rs.getString("limit_condition").contains("G"));
			cab.setTransferable(rs.getString("limit_condition").contains("Z"));
			cab.setCabinDiscount(rs.getDouble("cabin_discount"));
			cab.setClassType(rs.getString("plane_cabin_type"));
			cab.setMileageFactor(rs.getDouble("mileage_factor"));
		}
		return cab;
	}
	

}
