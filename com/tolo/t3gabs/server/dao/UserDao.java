package com.tolo.t3gabs.server.dao;
//UserDao�ӿ�,������ɾ�Ĳ�ķ���~
import java.util.List;
import java.util.Map;

import javax.swing.ListModel;

import com.tolo.t3gabs.common.entities.Subscription;
import com.tolo.t3gabs.common.entities.User;

public interface UserDao {
	/**
	 * ����û�����
	 * @param user ��������û�
	 * @throws Exception �����ʧ�ܣ����׳��쳣
	 */
	public void addUser(User user) throws Exception;
	
	/**
	 * 
	 * @param user
	 * @throws Exception
	 */
	public void removeUser(User user) throws Exception;
	
	/**
	 * �޸��û�����
	 * @param user1
	 * @param user2
	 * @throws Exception
	 */
	public void updateUser(Map<String,Object> data,String where, String[] args) throws Exception;
	
	/**
	 * �����û���������õ��û�����
	 * @param userName �û�������¼����
	 * @param password ����
	 * @return �û��������û��������벻��ȷ���򷵻�null
	 * @throws Exception
	 */
	public User getUser(String userName,String password) throws Exception;
	
	/**
	 * 
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public User getUserById(int id) throws Exception;
	
	public List<User> selectUsers(String where,String[] args)throws Exception;
	
	public void addContact(User user, int cont_id) throws Exception;
	
	public void addPassenger(User user, int psg_id) throws Exception;
	
	public void delPassenger(User user, int psg_id) throws Exception;
	
	public void modifyPassword(User user) throws Exception;
	
	public void modifyUser(User user) throws Exception;
	
	public void setSubscription(int userId,List<Subscription> subs) throws Exception;
}
