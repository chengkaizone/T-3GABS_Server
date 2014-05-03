package com.tolo.t3gabs.server.dao;

import java.util.List;

import com.tolo.t3gabs.common.entities.Order;

public interface OrderDao {
	
	/**
	 * ���ݶ����Ų�ѯ����
	 * @param OrderId
	 * @return
	 * @throws Exception
	 */
	public Order getOrder(long OrderId) throws Exception;
	
	/**
	 * �����û���ѯ����
	 * @param user
	 * @throws Exception
	 */
	public List<Order> getOrders(int userId) throws Exception;
	
	
	/**
	 * �޸Ķ���״̬
	 * @param orderId  ԭʼ�������
	 * @param state  ����״̬
	 * @throws Exception
	 */
	public void modifyOrder(long orderId,String state)throws Exception;
	
	/**
	 * ���붩��
	 * @param order
	 */
	public void insertOrder(Order order) throws Exception; 
	
	/**
	 * ɾ������
	 * @param orderId
	 * @throws Exception
	 */
	public void deleteOrder(long orderId)throws Exception;

}
