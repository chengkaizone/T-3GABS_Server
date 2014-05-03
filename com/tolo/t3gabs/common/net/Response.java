package com.tolo.t3gabs.common.net;

import java.util.HashMap;
import java.util.Map;

public class Response implements java.io.Serializable{
	/**
	 * 正常状态，请求得到正确结果
	 */
	public static final int OK_STATE=201;
	
	/**
	 * 验证错误状态，验证未通过
	 */
	public static final int VALI_ERROR_STATE=301;
	
	/**
	 * 业务错误状态，根据请求参数不能得到正确结果（业务异常情况）
	 */
	public static final int BUSS_ERROR_STATE=302;
	
	/**
	 * 系统错误状态，请求导致一个系统错误或异常
	 */
	public static final int SYS_ERROR_STATE=401;
	
	
	/**
	 * 应答类型,不同的应答类型对应着不同的参数列表
	 */
	private int type;
	
	/**
	 * 参数列表
	 */
	private Map<String,Object> parameters;
	
	/**
	 * 应答状态
	 */
	private int status;
	
	/**
	 * 异常信息
	 */
	private ErrorMessage errorMessage;
	
	private static final long serialVersionUID=1740286903134427908L;
	
	public Response(){
		parameters=new HashMap<String,Object>();
	}

	public ErrorMessage getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(ErrorMessage errorMessage) {
		this.errorMessage = errorMessage;
	}

	public Map<String,Object> getParameters() {
		return parameters;
	}

	public Object getParameter(String name) {
		return parameters.get(name);
	}
	
	public void addParameter(String name,Object value){
		parameters.put(name,value);
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

}
