package com.tolo.t3gabs.common.entities;

import java.util.Date;

public class Ticket implements java.io.Serializable{
	
	private static final long serialVersionUID=7788990012310917892L;
	
	private long ticketId;
	
	private Flight flight;

	private Passenger passenger;
	
	private CabinClass cabinClass;
	
	private Date ticketDate;
	
	private double ticketPrice;
	
	private double tax1Price;
	
	private double tax2Price;
	
	private double totalPrice;
	
	private int seatsOrder;
	
	private String changeState;
	
	private double refundCharge;
	
	private String restrictions;
	
	private String agentInfo;
	
	private String paymentType;
	
	private String paymentRef;
	
	private String ternimalType;
	
	private String ternimalIp;
	
	public Ticket(){
		
	}
	

	public String getAgentInfo() {
		return agentInfo;
	}

	public void setAgentInfo(String agentInfo) {
		this.agentInfo = agentInfo;
	}

	public CabinClass getCabinClass() {
		return cabinClass;
	}

	public void setCabinClass(CabinClass cabinClass) {
		this.cabinClass = cabinClass;
	}

	public String getChangeState() {
		return changeState;
	}

	public void setChangeState(String changeState) {
		this.changeState = changeState;
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

	public String getPaymentRef() {
		return paymentRef;
	}

	public void setPaymentRef(String paymentRef) {
		this.paymentRef = paymentRef;
	}

	public String getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	public double getRefundCharge() {
		return refundCharge;
	}

	public void setRefundCharge(double refundCharge) {
		this.refundCharge = refundCharge;
	}

	public String getRestrictions() {
		return restrictions;
	}

	public void setRestrictions(String restrictions) {
		this.restrictions = restrictions;
	}

	public int getSeatsOrder() {
		return seatsOrder;
	}

	public void setSeatsOrder(int seatsOrder) {
		this.seatsOrder = seatsOrder;
	}

	public double getTax1Price() {
		return tax1Price;
	}

	public void setTax1Price(double tax1Price) {
		this.tax1Price = tax1Price;
	}

	public double getTax2Price() {
		return tax2Price;
	}

	public void setTax2Price(double tax2Price) {
		this.tax2Price = tax2Price;
	}

	public String getTernimalIp() {
		return ternimalIp;
	}

	public void setTernimalIp(String ternimalIp) {
		this.ternimalIp = ternimalIp;
	}

	public String getTernimalType() {
		return ternimalType;
	}

	public void setTernimalType(String ternimalType) {
		this.ternimalType = ternimalType;
	}

	public Date getTicketDate() {
		return ticketDate;
	}

	public void setTicketDate(Date ticketDate) {
		this.ticketDate = ticketDate;
	}

	public long getTicketId() {
		return ticketId;
	}

	public void setTicketId(long ticketId) {
		this.ticketId = ticketId;
	}

	public double getTicketPrice() {
		return ticketPrice;
	}

	public void setTicketPrice(double ticketPrice) {
		this.ticketPrice = ticketPrice;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	
	
}
