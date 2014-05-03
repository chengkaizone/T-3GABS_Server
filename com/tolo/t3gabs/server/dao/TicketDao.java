package com.tolo.t3gabs.server.dao;

import com.tolo.t3gabs.common.entities.Ticket;


public interface TicketDao {
	/**
	 * ��ӻ�Ʊ
	 * @param ticket
	 * @throws Exception
	 */
	public void addTicket(Ticket ticket) throws Exception;
	
	/**
	 * �޸Ļ�Ʊ״̬
	 * @param ticketId
	 * @param state
	 * @throws Exception
	 */
	public void setTicketState(String ticketId ,char state)throws Exception;
	

}
