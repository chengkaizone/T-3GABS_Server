package com.tolo.t3gabs.server.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import com.tolo.t3gabs.common.entities.Passenger;
import com.tolo.t3gabs.common.exceptions.BusinessException;
import com.tolo.t3gabs.common.util.ConnectionUtil;
import com.tolo.t3gabs.common.util.ErrorMessageUtil;
import com.tolo.t3gabs.server.dao.PassengerDao;

public class PassengerDaoImpl implements PassengerDao{
	//添加完自动把id值返回,用于给user表关联~
	public int addPassenger(Passenger psg) throws Exception {
		int psg_id = 0;
		Connection conn = null;
		PreparedStatement pstm = null;
		conn = ConnectionUtil.getCurrentConnection();
		String sqlStr = "insert into passenger(psg_name,psg_certif_type,psg_certif_num,psg_type) values(?,?,?,?)";
		pstm = conn.prepareStatement(sqlStr);
		pstm.setString(1, psg.getName());
		pstm.setString(2, psg.getCertificateType());
		pstm.setString(3, psg.getCertificateNumber());
		// 如果身份类型为空的话
		if (psg.getType() == null) {
			// 使用其他证件注册,判定为成人~
			if (!psg.getCertificateType() .equals( "身份证")) {
				pstm.setString(4, "A");
				// 使用身份证注册,先过滤多余字符
			} else {
				String result = psg.getCertificateNumber().replaceAll("[^0-9X]", "");
				Calendar cal = Calendar.getInstance();
				int year = cal.get(Calendar.YEAR);
				if(result.length()==18&& year-Integer.parseInt(result.substring(6, 10))<2){
					pstm.setString(4, "I");
				}else if(result.length()==18&& year-Integer.parseInt(result.substring(6, 10))<12){
					pstm.setString(4, "C");
				}else{
					pstm.setString(4, "A");
				}
			}
		} else{
			pstm.setString(4, psg.getType());
		}

		pstm.execute();
		pstm = conn
				.prepareStatement("select psg_id from passenger where psg_name=?");
		pstm.setString(1, psg.getName());
		ResultSet rs = pstm.executeQuery();
		while (rs.next()) {
			psg_id = rs.getInt("psg_id");
		}
		return psg_id;
	}
	public Passenger getPassenger(int id) throws Exception {
		Connection conn=null;
		PreparedStatement pstm=null;
		ResultSet rs=null;
		conn=ConnectionUtil.getCurrentConnection();

		String sqlStr="select psg_id,psg_name,psg_certif_type,psg_certif_num from passenger where psg_id= ? ;";

		pstm=conn.prepareStatement(sqlStr);
		pstm.setInt(1,id);
		rs=pstm.executeQuery();
		if(rs.next()){
			Passenger pass=new Passenger();
			pass.setId(rs.getInt("psg_id"));
			pass.setName(rs.getString("psg_name"));
			pass.setCertificateType(rs.getString("psg_certif_type"));
			pass.setCertificateNumber(rs.getString("psg_certif_num"));

			return pass;
		}else{
			throw new BusinessException(ErrorMessageUtil.getErrorMessage(1014));
		}
	}
	@Override
	public void deletePassenger(int passengerId,int userId) throws Exception {
		Connection conn=null;
		PreparedStatement pstm=null;
		conn=ConnectionUtil.getCurrentConnection();
		String sqlStr="select user_id,ref_psgs_id from user where user_id = ?";
		pstm=conn.prepareStatement(sqlStr);
		pstm.setInt(1, userId);
		ResultSet rs = pstm.executeQuery();
		String strPsg = "";
		if(rs.next()){
			strPsg = rs.getString("ref_psgs_id");
			String[] psgs = strPsg.split(",");
			strPsg="";
			for (int i = 0; i < psgs.length; i++) {
				if(Integer.parseInt(psgs[i])==passengerId)
					continue;
				strPsg+=psgs[i]+",";
			}
			strPsg = strPsg.substring(0, strPsg.length()-1);
		}
		System.out.println(passengerId);
		System.out.println(strPsg);
		sqlStr = "update user set ref_psgs_id=? where user_id = ?";
		pstm=conn.prepareStatement(sqlStr);
		pstm.setString(1, strPsg);
		pstm.setInt(2, userId);
		pstm.execute();
//		sqlStr="delete from passenger where psg_id=?";
//		pstm=conn.prepareStatement(sqlStr);
//		pstm.setInt(1, passengerId);
//		pstm.execute();
	}

	@Override
	public List<Passenger> searchPassenger(int userId) throws Exception {
		Connection conn=null;
		PreparedStatement pstm=null;
		ResultSet rs=null;
		List<Passenger> list=new ArrayList<Passenger>();
		conn=ConnectionUtil.getCurrentConnection();
		String sqlStr="select * from passenger where memb_id in (select ref_memb_id from user where user_id=?)";
		pstm=conn.prepareStatement(sqlStr);
		pstm.setInt(1, userId);
		rs=pstm.executeQuery();
		while(rs.next()){
			Passenger passenger=new Passenger();
			passenger.setName(rs.getString(2));
			passenger.setId(rs.getInt(1));
			list.add(passenger);
		}
		return list;
	}
	@Override
	public void updatePassenger(Passenger psg) throws Exception {
		Connection conn=null;
		PreparedStatement pstm=null;
		conn=ConnectionUtil.getCurrentConnection();
		String sqlStr="update passenger set psg_name=?,psg_certif_type=?,psg_certif_num=?,psg_type=? where psg_id=?";
		pstm=conn.prepareStatement(sqlStr);
		pstm.setString(1, psg.getName());
		pstm.setString(2, psg.getCertificateType());
		pstm.setString(3, psg.getCertificateNumber());
		pstm.setString(4, psg.getType());
		pstm.setInt(5, psg.getId());
		pstm.execute();
	}
	@Override
	public void setUser(int userId, int psgId) throws Exception {
		Connection conn=null;
		PreparedStatement pstm=null;
		conn=ConnectionUtil.getCurrentConnection();
		String sqlStr="update passenger set ref_user_id = ? where cont_id = ?";
		pstm=conn.prepareStatement(sqlStr);
		pstm.setInt(1, userId);
		pstm.setInt(2, psgId);
		pstm.execute();
	}

	@Override
	public void modifyPassenger(Passenger psg) throws Exception {
		Connection conn = null;
		PreparedStatement pstm = null;
		conn = ConnectionUtil.getCurrentConnection();
		String update = "update passenger set psg_type=\'"+ psg.getCertificateType() 
				+ "\' where psg_name=\'" + psg.getName() + "\'";
		pstm = conn.prepareStatement(update);
		pstm.executeUpdate();
	}
}
