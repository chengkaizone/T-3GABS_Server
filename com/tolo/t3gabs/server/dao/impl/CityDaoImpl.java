package com.tolo.t3gabs.server.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

import com.tolo.t3gabs.common.entities.City;
import com.tolo.t3gabs.common.util.ConnectionUtil;
import com.tolo.t3gabs.server.dao.CityDao;
import com.tolo.t3gabs.server.service.ServerContext;

/**
 * 
 *
 */
public class CityDaoImpl implements CityDao{

	public Map<Integer, City> getAllCities() throws Exception {
		Connection conn=null;
		Statement stm=null;
		ResultSet rs=null;
		conn=ConnectionUtil.getCurrentConnection();
		stm=conn.createStatement();
		rs=stm.executeQuery("select city_id,city_name,province_id,city_spell_name from city;");
		Map<Integer,City> map=new HashMap<Integer,City>();
		while(rs.next()){
			City city=new City();
			city.setId(rs.getInt("city_id"));
			city.setName(rs.getString("city_name"));
			city.setProvince(ServerContext.getProvinceById(rs.getInt("province_id")));
			city.setSpellName(rs.getString("city_spell_name"));
			
			map.put(city.getId(),city);
			
		}
		
		return map;
	}
	
	

}
