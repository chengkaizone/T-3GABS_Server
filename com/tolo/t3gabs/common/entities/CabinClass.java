package com.tolo.t3gabs.common.entities;

public class CabinClass implements java.io.Serializable{
	
	private static final long serialVersionUID = -927561432180919L;
	
	private int id;
	
	private String name;
	
	/**
	 * 舱位字符，用来描述该舱位的唯一标识字符
	 */
	private String classChar;
	
	
	/**
	 * 舱位类型，用来表示该舱位的座位对应飞机上的头等舱('F')，公务舱('C')或经济舱('Y')。
	 */
	private String classType;
	
	
	/**
	 * 是否可改签(改期)
	 */
	private boolean rescheduable;
	
	/**
	 * 是否可签转
	 */
	private boolean transferable;
	
	/**
	 * 是否可退票
	 */
	private boolean refundable;
	
	
	/**
	 * 该舱位的退票手续费率。
	 */
	private double refundCharge;
	
	/**
	 * 该舱位的机票折扣
	 */
	private double cabinDiscount;
	
	/**
	 * 该舱位的里程系数
	 */
	private double mileageFactor;
	
	

	public CabinClass() {
		super();
	}

	public double getCabinDiscount() {
		return cabinDiscount;
	}

	public void setCabinDiscount(double cabinDiscount) {
		this.cabinDiscount = cabinDiscount;
	}


	public String getClassChar() {
		return classChar;
	}

	public void setClassChar(String classChar) {
		this.classChar = classChar;
	}

	public String getClassType() {
		return classType;
	}

	public void setClassType(String classType) {
		this.classType = classType;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getRefundCharge() {
		return refundCharge;
	}

	public void setRefundCharge(double refundTicketCharge) {
		this.refundCharge = refundTicketCharge;
	}

	public boolean isRefundable() {
		return refundable;
	}

	public void setRefundable(boolean refundable) {
		this.refundable = refundable;
	}

	public boolean isRescheduable() {
		return rescheduable;
	}

	public void setRescheduable(boolean rescheduable) {
		this.rescheduable = rescheduable;
	}

	public boolean isTransferable() {
		return transferable;
	}

	public void setTransferable(boolean transferable) {
		this.transferable = transferable;
	}

	public double getMileageFactor() {
		return mileageFactor;
	}

	public void setMileageFactor(double mileageFactor) {
		this.mileageFactor = mileageFactor;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
}
