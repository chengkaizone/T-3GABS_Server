package com.tolo.t3gabs.server.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Statement;
import com.tolo.t3gabs.common.entities.MemberStage;
import com.tolo.t3gabs.common.util.ConnectionUtil;
import com.tolo.t3gabs.server.dao.MemberStageDao;

public class MemberStageDaoImpl implements MemberStageDao {

	public List<MemberStage> getStage(int  membId) throws Exception {
		Connection con=null;
		Statement stat=null;
		ResultSet rs = null;
		String str = "select mileage_type   ,mileage_describe , stage_date from mileage_detail where memb_id=\'"+membId+"\';";
		con=ConnectionUtil.getCurrentConnection();//保证一个线程对应一个连接
		stat=(Statement) con.createStatement();
		rs=stat.executeQuery(str);
		List<MemberStage> msg = new ArrayList<MemberStage>();
		List<String> str1 = new ArrayList<String>();
		while(rs.next()){
			
			 str1.add(rs.getDate("stage_date").toString());
			 str1.add(rs.getString("mileage_type").toString());
			 str1.add(rs.getString("mileage_describe").toString());
			for(int i=0;i<str1.size();i++){
			MemberStage memb=new MemberStage();
			SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
			memb.setStageDate(fmt.parse(str1.get(0)));
			memb.setMileage_type(str1.get(1));
			memb.setMileage_describe(str1.get(2));
			msg.add(memb);
			str1.clear();	
			}
		}
		return msg;
	}
}
