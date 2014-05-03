package com.tolo.t3gabs.server.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;

import com.mysql.jdbc.Statement;
import com.tolo.t3gabs.common.entities.Membership;
import com.tolo.t3gabs.common.util.ConnectionUtil;
import com.tolo.t3gabs.server.dao.MembershipDao;

public class MembershipDaoImpl implements MembershipDao{
	public Membership getMembership(int id)throws Exception{
		return null;
		
	}



	@Override
	public Membership getMembership(String membCard, String password)
			throws Exception {
		Connection con=null;
		Statement stat=null;
		ResultSet rs = null;
		String str="select memb_id,memb_card_num,memb_password, memb_lastname_ch,memb_firstname_ch,memb_lastname_sp,memb_firstname_sp, memb_gender,memb_birthday,memb_certif_type,memb_certif_num,memb_telephone1,memb_address,memb_post_code,memb_reg_date,memb_email,memb_rank,memb_account_stage,memb_account_mileage,memb_available_mileage,memb_available_stage from membership where memb_card_num =\'"+membCard+"\' AND memb_password=\'"+password+"\';";
		con=ConnectionUtil.getCurrentConnection();//保证一个线程对应一个连接
		stat=(Statement) con.createStatement();
		rs=stat.executeQuery(str);
		
		if(rs.next()){
			Membership memb = new Membership();
		memb.setMebID(Integer.parseInt(rs.getString("memb_id")));
		memb.setMebCard(rs.getString("memb_card_num"));
		memb.setMebName(rs.getString("memb_lastname_ch")+rs.getString("memb_firstname_ch"));
		memb.setMebCertificateNumber(rs.getString("memb_certif_num"));
		memb.setMembRank(rs.getString("memb_rank"));
		memb.setAccountMileage(rs.getString("memb_account_mileage"));
		memb.setAvailableMileage(rs.getString("memb_available_mileage"));
		return memb;
		}
	return null;
	}

}
