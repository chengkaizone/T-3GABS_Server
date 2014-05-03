package com.tolo.t3gabs.server.action;

import com.tolo.t3gabs.common.net.Request;
import com.tolo.t3gabs.common.net.Response;
import com.tolo.t3gabs.server.dao.OrderDao;
import com.tolo.t3gabs.server.service.DaoFactory;

public class DeleteOrderAction extends ServerAction{
	
	@Override
	public void executeSome(Request request, Response response) throws Exception {
		long orderId=(Long)request.getParameter("OrderId");
		OrderDao orderDao=DaoFactory.getOrderDao();
		orderDao.deleteOrder(orderId);
	}
}
