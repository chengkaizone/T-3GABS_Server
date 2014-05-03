package com.tolo.t3gabs.server.action;


import java.util.ArrayList;

import com.tolo.t3gabs.common.entities.Order;
import com.tolo.t3gabs.common.entities.Ticket;
import com.tolo.t3gabs.common.net.Request;
import com.tolo.t3gabs.common.net.Response;
import com.tolo.t3gabs.common.util.IDCreator;
import com.tolo.t3gabs.server.dao.OrderDao;
import com.tolo.t3gabs.server.dao.TicketDao;
import com.tolo.t3gabs.server.service.DaoFactory;

/**
 * 支付订单Action
 *
 */
public class PaymentAction extends ServerAction{
	

	@Override
	public void executeSome(Request request, Response response) throws Exception {
		long orderId=(Long)request.getParameter("OrderId");
//		String creditCardNum=(String)request.getParameter("CreditCardNum");
//		TicketDao ticketDao=DaoFactory.getTicketDao();
		OrderDao orderDao=DaoFactory.getOrderDao();
		orderDao.modifyOrder(orderId, "P");
//		Order order=orderDao.getOrder(orderId);
		
//		if(order!=null){
//			Ticket ticket=new Ticket();
//			ticket.setTicketId(IDCreator.getNumID());
//			ticket.setPaymentType("信用卡支付");
//			ticket.setPaymentRef("信用卡支付，卡号："+creditCardNum);
//			ticketDao.addTicket(ticket);
//			orderDao.modifyOrder(orderId, "P");
//		}
		
	}
}
