package com.tolo.t3gabs.server.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;


import com.tolo.t3gabs.common.entities.Province;
import com.tolo.t3gabs.common.util.ConnectionUtil;
import com.tolo.t3gabs.server.dao.ProvinceDao;
public class ProvinceDaoImpl implements ProvinceDao{

	public Map<Integer, Province> getAllProvinces() throws Exception{
		Connection conn=null;
		Statement stm=null;
		ResultSet rs=null;
		conn=ConnectionUtil.getCurrentConnection();
		stm=conn.createStatement();
		rs=stm.executeQuery("select province_id,province_name,province_simple_name,province_spell_name from province;");
		Map<Integer,Province> map=new HashMap<Integer,Province>();
		while(rs.next()){
			Province pro=new Province();
			pro.setId(rs.getInt("province_id"));
			pro.setName(rs.getString("province_name"));
			pro.setSimpleName(rs.getString("province_simple_name"));
			pro.setSpellName(rs.getString("province_spell_name"));
			
			map.put(pro.getId(),pro);
			
		}
		
		return map;
	}
	

}
