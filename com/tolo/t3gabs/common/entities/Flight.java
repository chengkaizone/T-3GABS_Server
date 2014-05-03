package com.tolo.t3gabs.common.entities;

import java.util.Date;
import java.util.List;

/**
 * 航班类
 *
 */
public class Flight implements java.io.Serializable{
	
	private static final long serialVersionUID=4083251978045713037L;
	
	/**
	 * 航班编号
	 */
	private String flightId;
	
	/**
	 * 航班号
	 */
	private String flightNum;
	
	/**
	 * 执行航线
	 */
	private Route route;

	
	/**
	 * 出发日期
	 */
	private Date depDate;
	
	/**
	 * 到达日期
	 */
	private Date arrDate;
	
	
	/**
	 * 剩余头等舱座位数
	 */
	private int F_seates_remian;
	
	/**
	 * 剩余公务舱座位数
	 */
	private int C_seats_remain;
	
	/**
	 * 剩余经济舱座位数
	 */
	private int Y_seats_remain;
	
	/**
	 * 可选舱位列表
	 */
	private List<CabinClass> selectableClass;
	
	/**
	 * 航班基准价格
	 */
	private double fullBasePrice;
	
	/**
	 * 当前舱位最低价格
	 */
	private double minTicketPrice;
	
	/**
	 * 机场建设费
	 */
	private double tax1;
	
	
	/**
	 * 燃油税
	 */
	private double tax2;
	
	
	/**
	 * 执行飞机
	 */
	private Plane plane;
	
	
	/**
	 * 航班状态
	 */
	private char state;
	
	/**
	 * 当前订座编号
	 */
	private int currentOrder;

	public Flight(){}
	
	

	public String getFlightId() {
		return flightId;
	}


	public void setFlightId(String flightId) {
		this.flightId = flightId;
	}




	public double getMinTicketPrice() {
		return minTicketPrice;
	}
	
	public void setMinTicketPrice(double minTicketPrice) {
		this.minTicketPrice = minTicketPrice;
	}


	public int getC_seats_remain() {
		return C_seats_remain;
	}


	public void setC_seats_remain(int c_seats_remain) {
		C_seats_remain = c_seats_remain;
	}


	public int getF_seates_remian() {
		return F_seates_remian;
	}


	public void setF_seates_remian(int f_seates_remian) {
		F_seates_remian = f_seates_remian;
	}


	public String getFlightNum() {
		return flightNum;
	}


	public void setFlightNum(String flightNum) {
		this.flightNum = flightNum;
	}


	public double getFullBasePrice() {
		return fullBasePrice;
	}


	public void setFullBasePrice(double fullBasePrice) {
		this.fullBasePrice = fullBasePrice;
	}


	public Plane getPlane() {
		return plane;
	}


	public void setPlane(Plane plane) {
		this.plane = plane;
	}


	public List<CabinClass> getSelectableClass() {
		return selectableClass;
	}


	public void setSelectableClass(List<CabinClass> selectableClass) {
		this.selectableClass = selectableClass;
	}


	public char getState() {
		return state;
	}


	public void setState(char state) {
		this.state = state;
	}


	public int getY_seats_remain() {
		return Y_seats_remain;
	}


	public void setY_seats_remain(int y_seats_remain) {
		Y_seats_remain = y_seats_remain;
	}


	public int getCurrentOrder() {
		return currentOrder;
	}


	public void setCurrentOrder(int currentOrder) {
		this.currentOrder = currentOrder;
	}


	public Date getArrDate() {
		return arrDate;
	}


	public void setArrDate(Date arrDate) {
		this.arrDate = arrDate;
	}


	public Date getDepDate() {
		return depDate;
	}


	public void setDepDate(Date depDate) {
		this.depDate = depDate;
	}


	public Route getRoute() {
		return route;
	}


	public void setRoute(Route route) {
		this.route = route;
	}


	public double getTax1() {
		return tax1;
	}


	public void setTax1(double tax1) {
		this.tax1 = tax1;
	}


	public double getTax2() {
		return tax2;
	}


	public void setTax2(double tax2) {
		this.tax2 = tax2;
	}
	
	
	
}
