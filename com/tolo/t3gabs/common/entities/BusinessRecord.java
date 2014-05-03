package com.tolo.t3gabs.common.entities;

import java.util.Date;

/**
 * 营业记录
 *
 */
public class BusinessRecord implements java.io.Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2017893546190083427L;

	/**
	 * 营业记录编号
	 */
	private long id;
	
	/**
	 * 营业记录发生日期时间
	 */
	private Date date;
	
	/**
	 * 发生的营业网点
	 */
	private Branch branch;
	
	/**
	 * 营业员
	 */
	private User sales;
	
	/**
	 * 营业金额
	 */
	private double amount;
	
	/**
	 * 结算状态
	 * 0：未结算
	 * 1：一级待结算
	 * 2：一级已结算
	 * 3：二级待结算
	 * 4：二级已结算
	 */
	private int settleState;
	
	/**
	 * 营业发生的机器IP
	 */
	private String IPAddress;

	public BusinessRecord(){}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public Branch getBranch() {
		return branch;
	}

	public void setBranch(Branch branch) {
		this.branch = branch;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}


	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getIPAddress() {
		return IPAddress;
	}

	public void setIPAddress(String address) {
		IPAddress = address;
	}

	public User getSales() {
		return sales;
	}

	public void setSales(User sales) {
		this.sales = sales;
	}

	public int getSettleState() {
		return settleState;
	}

	public void setSettleState(int settleState) {
		this.settleState = settleState;
	}
}
