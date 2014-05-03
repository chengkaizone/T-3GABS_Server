package com.tolo.t3gabs.server.dao.impl;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import com.tolo.t3gabs.common.entities.Contact;
import com.tolo.t3gabs.common.entities.Passenger;
import com.tolo.t3gabs.common.exceptions.BusinessException;
import com.tolo.t3gabs.common.util.ConnectionUtil;
import com.tolo.t3gabs.common.util.ErrorMessageUtil;
import com.tolo.t3gabs.server.dao.ContactDao;
public class ContactDaoImpl implements ContactDao{
	@Override
	public int addContact(Contact contact) throws Exception {
		int contact_id=0;
		Connection conn=null;
		PreparedStatement pstm=null;
		conn=ConnectionUtil.getCurrentConnection();
		String sqlStr="insert into contact(cont_name,cont_telephone) values(?,?)";
		pstm=conn.prepareStatement(sqlStr);
		pstm.setString(1, contact.getName());
		pstm.setString(2, contact.getTelephone());
		pstm.execute();
		pstm=conn.prepareStatement("select cont_id from contact where cont_name=?");
		pstm.setString(1, contact.getName());
		ResultSet rs=pstm.executeQuery();
		while(rs.next()){
			contact_id=rs.getInt("cont_id");
		}
		return contact_id;
	}

	@Override
	public void deleteContact(int contactId,int userId) throws Exception {
		Connection conn=null;
		PreparedStatement pstm=null;
		conn=ConnectionUtil.getCurrentConnection();
		String sqlStr="select user_id,ref_contacts_id from user where user_id = ?";
		pstm=conn.prepareStatement(sqlStr);
		pstm.setInt(1, userId);
		ResultSet rs = pstm.executeQuery();
		String strContact = "";
		if(rs.next()){
			strContact = rs.getString("ref_contacts_id");
			String[] contacts = strContact.split(",");
			strContact="";
			for (int i = 0; i < contacts.length; i++) {
				if(Integer.parseInt(contacts[i])==contactId)
					continue;
				strContact+=contacts[i]+",";
			}
			strContact = strContact.substring(0, strContact.length()-1);
		}
		sqlStr = "update user set ref_contacts_id=? where user_id = ?";
		pstm=conn.prepareStatement(sqlStr);
		pstm.setString(1, strContact);
		pstm.setInt(2, userId);
		pstm.execute();
//		sqlStr="delete from contact where cont_id=?";
//		pstm=conn.prepareStatement(sqlStr);
//		pstm.setInt(1, contactId);
//		pstm.execute();
	}

	@Override
	public Contact getContact(int id) throws Exception {
		Connection conn=null;
		PreparedStatement pstm=null;
		ResultSet rs=null;
		conn=ConnectionUtil.getCurrentConnection();
		String sqlStr="select cont_id,cont_name,cont_telephone from contact where cont_id= ? ;";

		pstm=conn.prepareStatement(sqlStr);
		pstm.setInt(1,id);
		rs=pstm.executeQuery();
		if(rs.next()){
			Contact contact = new Contact();
			contact.setId(rs.getInt("cont_id"));
			contact.setName(rs.getString("cont_name"));
			contact.setTelephone(rs.getString("cont_telephone"));
			return contact;
		}else{
			throw new BusinessException(ErrorMessageUtil.getErrorMessage(1014));
		}
	}

	@Override
	public List<Passenger> searchContacts(int userId) throws Exception {
		return null;
	}

	@Override
	public void setUser(int userId, int contactId) throws Exception {
		Connection conn=null;
		PreparedStatement pstm=null;
		conn=ConnectionUtil.getCurrentConnection();
		String sqlStr="update contact set ref_user_id = ? where cont_id = ?";
		pstm=conn.prepareStatement(sqlStr);
		pstm.setInt(1, userId);
		pstm.setInt(2, contactId);
		pstm.execute();
	}

	@Override
	public void updateContact(Contact contact) throws Exception {
		Connection conn=null;
		PreparedStatement pstm=null;
		conn=ConnectionUtil.getCurrentConnection();
		String sqlStr="update contact set cont_name=?,cont_telephone=? where cont_id=?";
		pstm=conn.prepareStatement(sqlStr);
		pstm.setString(1, contact.getName());
		pstm.setString(2, contact.getTelephone());
		pstm.setInt(3, contact.getId());
		pstm.execute();
	}


	

}
