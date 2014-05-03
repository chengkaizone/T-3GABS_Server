package com.tolo.t3gabs.server.dao;

import java.util.List;

import com.tolo.t3gabs.common.entities.Order;

public interface OrderDao {
	
	/**
	 * 根据订单号查询订单
	 * @param OrderId
	 * @return
	 * @throws Exception
	 */
	public Order getOrder(long OrderId) throws Exception;
	
	/**
	 * 根据用户查询订单
	 * @param user
	 * @throws Exception
	 */
	public List<Order> getOrders(int userId) throws Exception;
	
	
	/**
	 * 修改订单状态
	 * @param orderId  原始订单编号
	 * @param state  订单状态
	 * @throws Exception
	 */
	public void modifyOrder(long orderId,String state)throws Exception;
	
	/**
	 * 插入订单
	 * @param order
	 */
	public void insertOrder(Order order) throws Exception; 
	
	/**
	 * 删除订单
	 * @param orderId
	 * @throws Exception
	 */
	public void deleteOrder(long orderId)throws Exception;

}
