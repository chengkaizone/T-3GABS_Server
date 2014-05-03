package com.tolo.t3gabs.server.action;

import java.util.ArrayList;
import java.util.List;

import com.tolo.t3gabs.common.entities.Order;
import com.tolo.t3gabs.common.net.Request;
import com.tolo.t3gabs.common.net.Response;
import com.tolo.t3gabs.common.util.IDCreator;
import com.tolo.t3gabs.server.dao.OrderDao;
import com.tolo.t3gabs.server.service.DaoFactory;

/**
 * ¶©Æ±Action
 *
 */
public class OrderTicketAction extends ServerAction{
	

	@Override
	public void executeSome(Request request, Response response) throws Exception {
		
		List<Order> orders=(List<Order>)request.getParameter("Orders");
		List<Long> orderIds = new ArrayList<Long>();
		OrderDao orderDao=DaoFactory.getOrderDao();
		for (Order order : orders) {
			order.setId(IDCreator.getNumID());
			orderDao.insertOrder(order);
			orderIds.add(order.getId());
			Thread.sleep(100);
		}
		response.addParameter("OrderIds", orderIds);
		
	}
}
