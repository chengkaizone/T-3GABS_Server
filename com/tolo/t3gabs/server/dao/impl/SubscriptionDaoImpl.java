package com.tolo.t3gabs.server.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

import com.tolo.t3gabs.common.entities.Subscription;
import com.tolo.t3gabs.common.util.ConnectionUtil;
import com.tolo.t3gabs.server.dao.SubscriptionDao;

public class SubscriptionDaoImpl implements SubscriptionDao{

	@Override
	public Map<Integer, Subscription> getAllSubscriptions() throws Exception {
		Connection conn=null;
		Statement stm=null;
		ResultSet rs=null;
		conn=ConnectionUtil.getCurrentConnection();
		stm=conn.createStatement();
		rs=stm.executeQuery("select sub_id,sub_name from subscription;");
		Map<Integer,Subscription> map=new HashMap<Integer,Subscription>();
		while(rs.next()){
			Subscription sub=new Subscription();
			sub.setId(rs.getInt("sub_id"));
			sub.setName(rs.getString("sub_name"));
			map.put(sub.getId(),sub);
		}
		
		return map;
	}

}
