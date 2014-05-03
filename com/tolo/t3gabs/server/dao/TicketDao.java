package com.tolo.t3gabs.server.dao;

import com.tolo.t3gabs.common.entities.Ticket;


public interface TicketDao {
	/**
	 * 添加机票
	 * @param ticket
	 * @throws Exception
	 */
	public void addTicket(Ticket ticket) throws Exception;
	
	/**
	 * 修改机票状态
	 * @param ticketId
	 * @param state
	 * @throws Exception
	 */
	public void setTicketState(String ticketId ,char state)throws Exception;
	

}
