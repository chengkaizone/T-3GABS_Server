package com.tolo.t3gabs.server.action;

import java.util.ArrayList;

import com.tolo.t3gabs.common.entities.Order;
import com.tolo.t3gabs.common.net.Request;
import com.tolo.t3gabs.common.net.Response;
import com.tolo.t3gabs.server.dao.OrderDao;
import com.tolo.t3gabs.server.service.DaoFactory;

public class FindOrderAction extends ServerAction{
	

	@Override
	public void executeSome(Request request, Response response) throws Exception {
		int userId=(Integer)request.getParameter("UserId");
		OrderDao orderDao=DaoFactory.getOrderDao();
		ArrayList<Order> orderList=(ArrayList<Order>)orderDao.getOrders(userId);
		response.addParameter("Orders", orderList);
	}
	

}
