package com.tolo.t3gabs.server.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

import com.tolo.t3gabs.common.entities.Branch;
import com.tolo.t3gabs.common.util.ConnectionUtil;
import com.tolo.t3gabs.server.dao.BranchDao;
import com.tolo.t3gabs.server.service.ServerContext;

public class BranchDaoImpl implements BranchDao{

	public Map<Integer, Branch> getAllBranch() throws Exception{
		Connection conn=null;
		Statement stm=null;
		ResultSet rs=null;
		conn=ConnectionUtil.getCurrentConnection();
		stm=conn.createStatement();
		rs=stm.executeQuery("select branch_id,branch_name,province_id,city_id,branch_telephone1,branch_fax," +
				"branch_address,branch_type,branch_state from branch;");
		Map<Integer,Branch> map=new HashMap<Integer,Branch>();
		while(rs.next()){
			Branch bra=new Branch();
			bra.setId(rs.getInt("branch_id"));
			bra.setName(rs.getString("branch_name"));
			bra.setProvince(ServerContext.getProvinceById(rs.getInt("province_id")));
			bra.setCity(ServerContext.getCityById(rs.getInt("city_id")));
			bra.setTelephone(rs.getString("branch_telephone1"));
			bra.setFax(rs.getString("branch_fax"));
			bra.setAddress(rs.getString("branch_address"));
			bra.setType(rs.getString("branch_type").charAt(0));
			bra.setState(rs.getString("branch_state").charAt(0));
			map.put(bra.getId(),bra);
			
		}
		
		return map;
	}
	

}
