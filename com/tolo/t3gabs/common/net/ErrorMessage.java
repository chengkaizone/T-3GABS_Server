package com.tolo.t3gabs.common.net;

public class ErrorMessage implements java.io.Serializable{
	
	private static final long serialVersionUID=7714918001204577L;
	/**
	 * �������
	 */
	private int code;
	
	/**
	 * ������
	 */
	private String name;
	
	/**
	 * ������Ϣ
	 */
	private String message;
	
	
	/**
	 * ��������
	 */
	private String details;
	
	
	public ErrorMessage(int code,String name,String mesg,String details){
		this.code=code;
		this.name=name;
		this.message=mesg;
		this.details=details;
	}
	
	public ErrorMessage(String message){
		this.message=message;
	}
	
	public ErrorMessage(String mesg,String details){
		this.message=mesg;
		this.details=details;
	}
	
	
	public ErrorMessage(){
		
	}
	

	public String getDetails() {
		return details;
	}


	public void setDetails(String details) {
		this.details = details;
	}


	public int getCode() {
		return code;
	}



	public void setCode(int code) {
		this.code = code;
	}



	public String getMessage() {
		return message;
	}



	public void setMessage(String message) {
		this.message = message;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}

	public String getSimpleString(){
		return null;
	}

	public String toString(){
		String str=
			"������룺"+code+"\n"+
			"��������:"+name+"\n"+
			"��������:"+message+"\n"+
			"��������:"+details+"\n";
		
		return str;
		
	}
	
	

}
