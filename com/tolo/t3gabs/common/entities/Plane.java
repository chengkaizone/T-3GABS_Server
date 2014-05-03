package com.tolo.t3gabs.common.entities;


/**
 * 飞机类，用来描述该航空公司的一架飞机
 *
 */
public class Plane implements java.io.Serializable{
	
	private static final long serialVersionUID=330633073308991L;
	
	/**
	 * 飞机编号
	 */
	private int id;
	
	/**
	 * 飞机舷号
	 */
	private String number;
	
	
	/**
	 * 飞机型号
	 */
	private String model;
	
	/**
	 * 制造厂商
	 */
	private String manufacturer;
	
	
	/**
	 * 头等舱座位
	 */
	private int firstSeats;
	
	/**
	 * 公务舱座位
	 */
	private int businessSeats;
	
	/**
	 * 经济舱座位
	 */
	private int economySeats;
	
	/**
	 * 最大航程
	 */
	private int maxDistance;
	
	
	/**
	 * 飞机座位布局图片路径
	 */
	private String picPath;
	

	public Plane(){}
	
	
	
	public int getBusinessSeats() {
		return businessSeats;
	}
	
	public void setBusinessSeats(int businessSeats) {
		this.businessSeats = businessSeats;
	}
	
	
	public int getEconomySeats() {
		return economySeats;
	}
	
	public void setEconomySeats(int economySeats) {
		this.economySeats = economySeats;
	}
	
	public int getFirstSeats() {
		return firstSeats;
	}
	public void setFirstSeats(int firstSeats) {
		this.firstSeats = firstSeats;
	}
	
	public String getManufacturer() {
		return manufacturer;
	}
	
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	
	public int getMaxDistance() {
		return maxDistance;
	}
	
	public void setMaxDistance(int maxDistance) {
		this.maxDistance = maxDistance;
	}
	
	public String getModel() {
		return model;
	}
	
	public void setModel(String type) {
		this.model = type;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getPicPath() {
		return picPath;
	}

	public void setPicPath(String picPath) {
		this.picPath = picPath;
	}
	
}
