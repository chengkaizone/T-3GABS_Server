package com.tolo.t3gabs.common.net;

import java.util.HashMap;
import java.util.Map;

public class Response implements java.io.Serializable{
	/**
	 * ����״̬������õ���ȷ���
	 */
	public static final int OK_STATE=201;
	
	/**
	 * ��֤����״̬����֤δͨ��
	 */
	public static final int VALI_ERROR_STATE=301;
	
	/**
	 * ҵ�����״̬����������������ܵõ���ȷ�����ҵ���쳣�����
	 */
	public static final int BUSS_ERROR_STATE=302;
	
	/**
	 * ϵͳ����״̬��������һ��ϵͳ������쳣
	 */
	public static final int SYS_ERROR_STATE=401;
	
	
	/**
	 * Ӧ������,��ͬ��Ӧ�����Ͷ�Ӧ�Ų�ͬ�Ĳ����б�
	 */
	private int type;
	
	/**
	 * �����б�
	 */
	private Map<String,Object> parameters;
	
	/**
	 * Ӧ��״̬
	 */
	private int status;
	
	/**
	 * �쳣��Ϣ
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
