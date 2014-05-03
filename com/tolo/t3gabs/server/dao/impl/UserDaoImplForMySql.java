package com.tolo.t3gabs.server.dao.impl;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.Map;

import com.tolo.t3gabs.common.entities.Passenger;
import com.tolo.t3gabs.common.entities.Subscription;
import com.tolo.t3gabs.common.entities.User;
import com.tolo.t3gabs.common.exceptions.BusinessException;
import com.tolo.t3gabs.common.exceptions.CommonException;
import com.tolo.t3gabs.common.exceptions.SystemException;
import com.tolo.t3gabs.common.util.ConnectionUtil;
import com.tolo.t3gabs.common.util.ErrorMessageUtil;
import com.tolo.t3gabs.server.dao.ContactDao;
import com.tolo.t3gabs.server.dao.PassengerDao;
import com.tolo.t3gabs.server.dao.UserDao;
import com.tolo.t3gabs.server.service.DaoFactory;
public class UserDaoImplForMySql implements UserDao {
	/**
	 * @version 2011-02-14
	 */
	public void addUser(User user) throws CommonException {
		Connection conn = null;
		PreparedStatement pstm = null;
		try {
			conn = ConnectionUtil.getCurrentConnection();
			String sql="insert into user (user_login_name,user_password,user_name,"
				+ "user_state,user_creation_date,user_last_login_time,"
				+ "user_total_login_times,user_total_login_seconds,user_telephone,user_certif_num,user_certif_type)"
				+ "values(?,?,?,?,?,?,?,?,?,?,?)";
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, user.getLoginName());
			pstm.setString(2, user.getPassword());
			pstm.setString(3, user.getName());
			pstm.setString(4, "E");
			pstm.setDate(5, new Date(System.currentTimeMillis()));
			pstm.setDate(6, new Date(System.currentTimeMillis()));
			pstm.setInt(7, 0);
			pstm.setInt(8, 0);
			pstm.setString(9, user.getTelephone());
			pstm.setString(10, user.getCertifyNum());
			pstm.setString(11,user.getCertifyType());
		}  catch (Exception e) {
			throw new  SystemException();
		}
		try {
			pstm.executeUpdate();
		} catch (SQLException e) {
			throw new  BusinessException(ErrorMessageUtil.getErrorMessage(1006));
		}
	}
	public User getUser(String userName, String password) throws Exception {
		Connection conn = null;
		PreparedStatement pstm = null;
		PreparedStatement pstm2 = null;
		ResultSet rs = null;
		ResultSet rs2 = null;
		
		PassengerDao pDao = DaoFactory.getPassengerDao();
		ContactDao cDao = DaoFactory.getContactDao();
		
		
		conn = ConnectionUtil.getCurrentConnection();
		String sql="SELECT user_id,user_login_name,user_name,user_state,user_passenger_type," +
				"user_telephone,user_certif_type,user_certif_num,user_email,user_creation_date," +
				"user_last_login_time,user_total_login_times,user_total_login_seconds,ref_psgs_id," +
				"ref_contacts_id,user_subscriptions_id,ref_memb_id FROM user where user_login_name=? AND user_password=?";
		pstm=conn.prepareStatement(sql);
		pstm.setString(1, userName);
		pstm.setString(2, password);
		rs=pstm.executeQuery();
		if (rs.next()) {
			if (rs.getString("user_state").equals("D")) {
				throw new BusinessException(ErrorMessageUtil.getErrorMessage(1005));
			}
			User user = new User();
			user.setId(rs.getInt("user_id"));
			user.setLoginName(rs.getString("user_login_name"));
			user.setName(rs.getString("user_name"));
			user.setState(rs.getString("user_state"));
			user.setRegisteTime(rs.getDate("user_creation_date"));
			user.setLastLoginTime(rs.getDate("user_last_login_time"));
			user.setTelephone(rs.getString("user_telephone"));
			user.setCertifyNum(rs.getString("user_certif_num"));
			user.setCertifyType(rs.getString("user_certif_type"));
			//为user添加联系人关联
			String strContacts = rs.getString("ref_contacts_id");
			if(strContacts!=null){
				String[] contacts = strContacts.split(",");
				System.out.println(contacts.length);
				for (String strContact : contacts) {
					user.addContacts(cDao.getContact(Integer.parseInt(strContact)));
				}
			}
			//为user添加乘机人
			String strPsgs = rs.getString("ref_psgs_id");
			if(strPsgs!=null){
				String[] psgs = strPsgs.split(",");
				System.out.println(psgs.length);
				for (String strPsg : psgs) {
					user.addPassenger(pDao.getPassenger(Integer.parseInt(strPsg)));
				}
			}
			//为user添加相应订购消息待实现
			String strSubs = rs.getString("user_subscriptions_id");
			if(strSubs!=null){
				sql="select sub_id,sub_name from subscription where sub_id in ("+strSubs+")";
				System.out.println(sql);
				pstm2 = conn.prepareStatement(sql);
				rs2 = pstm2.executeQuery();
				while(rs2.next()){
					Subscription sub = new Subscription();
					sub.setId(rs2.getInt("sub_id"));
					sub.setName(rs2.getString("sub_name"));
					user.addSubscription(sub);
				}
			}
			return user;
		}else{
			throw new BusinessException(ErrorMessageUtil.getErrorMessage(1004));
		}
	}
	public void removeUser(User user) throws Exception {
		
	}
	@Override
	public List<User> selectUsers(String where, String[] args) throws Exception {
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		conn = ConnectionUtil.getCurrentConnection();
		String sql="SELECT user_id,user_login_name,user_name,user_state,user_passenger_type," +
				"user_telephone,user_certif_type,user_certif_num,user_email,user_creation_date," +
				"user_last_login_time,user_total_login_times,user_total_login_seconds,ref_psgs_id," +
				"ref_contacts_id,user_subscriptions_id,ref_memb_id FROM user where "+where;
		pstm=conn.prepareStatement(sql);
		return null;
	}
	@Override
	public void updateUser(Map<String, Object> data, String where, String[] args)
			throws Exception {
	}
	public User getUserById(int id) throws Exception {
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		conn = ConnectionUtil.getCurrentConnection();
		String sqlStr = "select user_id,user_login_name,user_name,user_state,user_type,branch_id from user where user_id= ? ;";
		pstm = conn.prepareStatement(sqlStr);
		pstm.setInt(1, id);
		rs = pstm.executeQuery();
		if (rs.next()) {
			User user = new User();
			user.setId(Integer.parseInt(rs.getString(1)));
			user.setLoginName(rs.getString("user_login_name"));
			user.setName(rs.getString("user_name"));
			user.setState(rs.getString("user_state"));
			return user;
		} else {
			throw new BusinessException(ErrorMessageUtil.getErrorMessage(1014));
		}
	}
	public void addPassenger(User user, int psg_id) throws Exception {
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		conn = ConnectionUtil.getCurrentConnection();
		String select = "select ref_psgs_id from user where user_login_name=\'"+ user.getLoginName() + "\'";
		pstm = conn.prepareStatement(select);
		rs = pstm.executeQuery();
		String update = null;
		rs.next();
		String ref_psgs_id = rs.getString("ref_psgs_id");
		if (ref_psgs_id != null) {
			update = "update user set ref_psgs_id=\'" + psg_id + ","
					+ ref_psgs_id + "\' where user_login_name=\'" + user.getLoginName() + "\'";
		} else {
			update = "update user set ref_psgs_id=\'" + psg_id
					+ "\' where user_login_name=\'" + user.getLoginName() + "\'";
		}
		pstm = conn.prepareStatement(update);
		pstm.executeUpdate();
	}
	
	public void addContact(User user, int cont_id) throws Exception {
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		conn = ConnectionUtil.getCurrentConnection();
		String select = "select ref_contacts_id from user where user_login_name=\'"+ user.getLoginName() + "\'";
		pstm = conn.prepareStatement(select);
		rs = pstm.executeQuery();
		String update = null;
		rs.next();
		String ref_contacts_id = rs.getString("ref_contacts_id");
		if (ref_contacts_id != null) {
			update = "update user set ref_contacts_id=\'" + cont_id + ","
					+ ref_contacts_id + "\' where user_login_name=\'" + user.getLoginName() + "\'";
		} else {
			update = "update user set ref_contacts_id=\'" + cont_id
					+ "\' where user_login_name=\'" + user.getLoginName() + "\'";
		}
		pstm = conn.prepareStatement(update);
		pstm.executeUpdate();
	}
	public void delPassenger(User user, int psg_id) throws Exception {
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		conn = ConnectionUtil.getCurrentConnection();
		String select = "select ref_psgs_id from user where user_id=\'"
				+ user.getId() + "\'";
		pstm = conn.prepareStatement(select);
		rs = pstm.executeQuery();
		if (rs.next()) {
			String ref_psgs_id = rs.getString("ref_psgs_id");
			String id = String.valueOf(psg_id);
			String[] ary = ref_psgs_id.split(",");
			String[] ary_bak = new String[ary.length - 1];
			int j = 0;
			for (int i = 0; i < ary.length; i++) {
				if (!ary[i].equals(id)) {
					ary_bak[j] = ary[i];
					j++;
				}
			}
			String rst_psgs = Arrays.toString(ary_bak);
			System.out.println(rst_psgs);
			String sub_psg = rst_psgs.substring(1, rst_psgs.length() - 1);
			
			String update =null;
			if (sub_psg.equals("")) {
				sub_psg = null;
				update = "update user set ref_psgs_id=" + sub_psg
				+ " where user_id=\'" + user.getId() + "\'";
			}else{
				update = "update user set ref_psgs_id=\'" + sub_psg
				+ "\' where user_id=\'" + user.getId() + "\'";
			}
			pstm = conn.prepareStatement(update);
			pstm.executeUpdate();
		}
	}
	public List<Passenger> searchPassenger(User user) throws Exception {
		Connection conn = null;
		PreparedStatement pstm = null;
		PreparedStatement pstm2 = null;
		ResultSet rs = null;
		ResultSet rs2 = null;
		conn = ConnectionUtil.getCurrentConnection();
		List<Passenger> list = new ArrayList<Passenger>();
		String select = "select ref_psgs_id from user where user_id=\'"
				+ user.getId() + "\'";
		pstm = conn.prepareStatement(select);
		rs = pstm.executeQuery();
		String[] ary = null;
		System.out.println("USERID:" + user.getId());
		System.out.println("RS:" + rs.getRow());
		rs.next();
		String ref_psgs_id = rs.getString("ref_psgs_id");
		System.out.println("ref_psgs_id:" + ref_psgs_id);
		if (ref_psgs_id != null) {
			ary = ref_psgs_id.split(",");
			for (String str : ary) {
				String sql = "select psg_id,psg_name,psg_certif_type,psg_certif_num from passenger where psg_id =\'"
						+ Integer.parseInt(str) + "\'";
				pstm2 = conn.prepareStatement(sql);
				rs2 = pstm2.executeQuery();
				while (rs2.next()) {
					Passenger passenger = new Passenger();
					passenger.setId(rs2.getInt("psg_id"));
					passenger.setName(rs2.getString("psg_name"));
					passenger.setCertificateType(rs2
							.getString("psg_certif_type"));
					passenger.setCertificateNumber(rs2
							.getString("psg_certif_num"));
					list.add(passenger);
				}
			}
		}
		return list;
	}
	@Override
	public void setSubscription(int userId, List<Subscription> subs)
			throws Exception {
		Connection conn = null;
		PreparedStatement pstm = null;
		conn = ConnectionUtil.getCurrentConnection();
		String strSql = "update user set user_subscriptions_id=? where user_id = ?";
		pstm = conn.prepareStatement(strSql);
		String strSub = "";
		for (Subscription sub : subs) {
			strSub += sub.getId()+",";
		}
		strSub = strSub.substring(0, strSub.length()-1);
		pstm.setString(1, strSub);
		pstm.setInt(2, userId);
		pstm.execute();
	}
	@Override
	public void modifyPassword(User user) throws Exception {
		Connection conn = null;
		PreparedStatement pstm = null;
		conn = ConnectionUtil.getCurrentConnection();
		String update = "update user set user_password=\'" + user.getPassword()
				+ "\' where user_login_name=\'" + user.getLoginName() + "\'";
		pstm = conn.prepareStatement(update);
		pstm.executeUpdate();
	}
	@Override
	public void modifyUser(User user) throws Exception {
		Connection conn = null;
		PreparedStatement pstm = null;
		conn = ConnectionUtil.getCurrentConnection();
		String update = "update user set user_telephone=\'"
				+ user.getTelephone() + "\',user_certif_type=\'"
				+ user.getCertifyType() + "\',user_email=\'" + user.getEmail()
				+ "\',user_certif_num=\'" + user.getCertifyNum()
				+ "\' where user_login_name=\'" + user.getLoginName() + "\'";
		pstm = conn.prepareStatement(update);
		pstm.executeUpdate();
		//如果年龄符合规则,则同时修改该用户表的乘机人类型~
		if (user.getCertifyType().equals("身份证")) {
			String result = user.getCertifyNum().replaceAll("[^0-9X]", "");
			Calendar cal = Calendar.getInstance();
			int year = cal.get(Calendar.YEAR);
			PassengerDao passengerDao=DaoFactory.getPassengerDao();
			Passenger passenger=new Passenger();
			passenger.setName(user.getName());
			if (result.length() == 18&& year - Integer.parseInt(result.substring(6, 10)) < 2) {
				passenger.setCertificateType("I");
				passengerDao.modifyPassenger(passenger);
			} else if (result.length() == 18&& year - Integer.parseInt(result.substring(6, 10)) < 12) {
				passenger.setCertificateType("C");
				passengerDao.modifyPassenger(passenger);
			}
		}
	}
}
