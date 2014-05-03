package com.tolo.t3gabs.common.net;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
public class Request implements java.io.Serializable{
	/**
	 * 比较程序版本请求
	 */
	public static final int COMPARE_PROGRAM_VERSION=0x1;
	/**
	 * 更新业务数据请求
	 */
	public static final int UPDATE_BUSINESS_DATA=0x2;
	/**
	 * 登录请求
	 */
	public static final int LOGIN_REQUEST=0x3;
	/**
	 * 注册请求
	 */
	public static final int REGISTE_REQUEST=0x4;
	/**
	 * 查询航班请求
	 */
	public static final int SEARCH_FLIGHT_REQUEST=0x5;
	/**
	 * 订票请求
	 */
	public static final int ORDER_REQUEST=0x6;
	/**
	 * 支付请求
	 */
	public static final int PAYMENT_REQUEST=0x7;
	/**
	 * 查询订单请求
	 */
	public static final int FIND_ORDER_REQUEST=0x8;
	/**
	 * 删除订单请求
	 */
	public static final int DELETE_ORDER_REQUEST=0x9;
	/**
	 * 添加乘客请求
	 */
	public static final int ADD_PASSENGER_REQUEST=0xa;
	/**
	 * 修改乘客请求
	 */
	public static final int MODIFY_PASSENGER_REQUEST=0xb;
	
	
	/**
	 * 删除乘客请求
	 */
	public static final int REMOVE_PASSENGER_REQUEST=0xc;
	
	/**
	 * 添加联系人请求
	 */
	public static final int ADD_CONTACT_REQUEST=0xd;
	
	/**
	 * 修改联系人请求
	 */
	public static final int MODIFY_CONTACT_REQUEST=0xe;
	
	/**
	 * 删除联系人请求
	 */
	public static final int REMOVE_CONTACT_REQUEST=0xf;
	
	
	/**
	 * 查询会员里程请求
	 */
	public static final int FIND_MEMBER_MILEAGE_REQUEST=0x10;
	
	
	/**
	 * 修改用户信息请求
	 */
	public static final int MODIFY_USER_REQUEST=0x11;
	
	/**
	 * 修改用户密码请求
	 */
	public static final int MODIFY_USER_PASSWORD_REQUEST=0x12;
	
	/**
	 * 设置订阅请求
	 */
	public static final int SET_SUBSCRIPTION_REQUEST=0x13;
	
	
	/**
	 * 退出请求
	 */
	public static final int QUIT_REQUEST=0x14;
	
	private static final long serialVersionUID=2013415890997784131L;
	
	private int type;
	
	private Map<String,Object> parameters;
	
	public Request(int type){
		this();
		this.type=type;
	}
	
	public Request(){
		parameters=new HashMap<String,Object>();
	}
	
	public void addParameter(String name,Object value){
		parameters.put(name, value);
	}
	
	public Object getParameter(String name){
		return parameters.get(name);
	}
	
	public Map<String,Object> getparameters(){
		return parameters;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}
	
	public static String getRequestNameByCode(int code){
		Field[] fs=Request.class.getDeclaredFields();
		try {
			for(Field f:fs){
				f.setAccessible(true);
				if((Integer)(f.get(null))==code){
					return f.getName();
				}
			}
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		return null;
	}

}
