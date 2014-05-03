package com.tolo.t3gabs.server.dao;
//UserDao接口,定义增删改查的方法~
import java.util.List;
import java.util.Map;

import javax.swing.ListModel;

import com.tolo.t3gabs.common.entities.Subscription;
import com.tolo.t3gabs.common.entities.User;

public interface UserDao {
	/**
	 * 添加用户对象
	 * @param user 待加入的用户
	 * @throws Exception 若添加失败，则抛出异常
	 */
	public void addUser(User user) throws Exception;
	
	/**
	 * 
	 * @param user
	 * @throws Exception
	 */
	public void removeUser(User user) throws Exception;
	
	/**
	 * 修改用户对象
	 * @param user1
	 * @param user2
	 * @throws Exception
	 */
	public void updateUser(Map<String,Object> data,String where, String[] args) throws Exception;
	
	/**
	 * 根据用户名和密码得到用户对象
	 * @param userName 用户名（登录名）
	 * @param password 密码
	 * @return 用户对象，若用户名或密码不正确，则返回null
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
