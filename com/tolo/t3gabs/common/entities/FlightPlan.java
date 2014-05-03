package com.tolo.t3gabs.common.entities;

import java.util.Date;
import java.util.List;


/**
 * ����ƻ�
 *
 */
public class FlightPlan implements java.io.Serializable{
	
	private static final long serialVersionUID=7543901827149176L;
	
	
	/**
	 * ����ƻ���ţ���ҵ���޹ص�Ψһ���룬��:17254
	 */
	private int id;
	
	/**
	 * ����ţ����磺TL1202
	 */
	private String no;
	
	/**
	 * ����ƻ���ʼ����
	 */
	private Date startDate;
	
	/**
	 * ����ƻ���������
	 */
	private Date endDate;
	
	/**
	 * �����ػ���
	 */
	private Airport fromAirport;
	
	/**
	 * ����ػ���
	 */
	private Airport toAirport;
	
	/**
	 * ����ʱ��
	 */
	private Date leaveTime;
	
	/**
	 * ����ʱ��
	 */
	private Date arriveTime;
	
	/**
	 * �������
	 */
	private int schedule;
	
	/**
	 * ��׼Ʊ��
	 */
	private int baseTicketPrice;
	

	public FlightPlan(){}
	
	/**
	 * �õ��ú���ƻ��µ����к���
	 * @return
	 */
	public List<Flight> getAllFlights(){
		//?????
		return null;
	}
	
	
	/**
	 * �õ�ָ�����ڼ�ĸú���ƻ��µ����к���
	 * @param from
	 * @param to
	 * @return
	 */
	public List<Flight> getAllFlights(Date from,Date to){
		//????
		return null;
	}


	public Date getArriveTime() {
		return arriveTime;
	}


	public void setArriveTime(Date arriveTime) {
		this.arriveTime = arriveTime;
	}


	public Date getEndDate() {
		return endDate;
	}


	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}


	public Airport getFromAirport() {
		return fromAirport;
	}


	public void setFromAirport(Airport fromAirport) {
		this.fromAirport = fromAirport;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public Date getLeaveTime() {
		return leaveTime;
	}


	public void setLeaveTime(Date leaveTime) {
		this.leaveTime = leaveTime;
	}


	public String getNo() {
		return no;
	}


	public void setNo(String no) {
		this.no = no;
	}


	public int getSchedule() {
		return schedule;
	}


	public void setSchedule(int schedule) {
		this.schedule = schedule;
	}


	public Date getStartDate() {
		return startDate;
	}


	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}


	public int getBaseTicketPrice() {
		return baseTicketPrice;
	}


	public void setBaseTicketPrice(int ticketPrice) {
		this.baseTicketPrice = ticketPrice;
	}


	public Airport getToAirport() {
		return toAirport;
	}


	public void setToAirport(Airport toAirport) {
		this.toAirport = toAirport;
	}

}
