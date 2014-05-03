package com.tolo.t3gabs.common.entities;

import java.util.Date;

/**
 * ¶©µ¥Àà
 *
 */
public class Order implements java.io.Serializable{
	private static final long serialVersionUID=5083271409871749583L;
	/**
	 * ¶©µ¥±àºÅ
	 */
	private long id;
	
	private User user;
	
	private double orderMoney;
	
	private Date orderDate;
	
	private String state;
	
	private String paymentRecord;
	
	private Flight flight;
	
	private Passenger passenger;
	
	private Contact contact;
	
	private CabinClass cabinClass;
	
	private double ticketPrice;
	
	private double appendTax1;
	
	private double appendTax2;
	
	private int seatOrder;
	
		
	
	public Order(){}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public Date getOrderDate() {
		return orderDate;
	}


	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}


	public double getOrderMoney() {
		return orderMoney;
	}


	public void setOrderMoney(double orderMoney) {
		this.orderMoney = orderMoney;
	}


	public String getPaymentRecord() {
		return paymentRecord;
	}


	public void setPaymentRecord(String paymentRecord) {
		this.paymentRecord = paymentRecord;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}


	public Flight getFlight() {
		return flight;
	}


	public void setFlight(Flight flight) {
		this.flight = flight;
	}


	public Passenger getPassenger() {
		return passenger;
	}


	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}


	public Contact getContact() {
		return contact;
	}


	public void setContact(Contact contact) {
		this.contact = contact;
	}


	public CabinClass getCabinClass() {
		return cabinClass;
	}


	public void setCabinClass(CabinClass cabinClass) {
		this.cabinClass = cabinClass;
	}


	public double getTicketPrice() {
		return ticketPrice;
	}


	public void setTicketPrice(double ticketPrice) {
		this.ticketPrice = ticketPrice;
	}


	public double getAppendTax1() {
		return appendTax1;
	}


	public void setAppendTax1(double appendTax1) {
		this.appendTax1 = appendTax1;
	}


	public double getAppendTax2() {
		return appendTax2;
	}


	public void setAppendTax2(double appendTax2) {
		this.appendTax2 = appendTax2;
	}


	public int getSeatOrder() {
		return seatOrder;
	}


	public void setSeatOrder(int seatOrder) {
		this.seatOrder = seatOrder;
	}
	
}
