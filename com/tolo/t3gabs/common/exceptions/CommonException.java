package com.tolo.t3gabs.common.exceptions;

import com.tolo.t3gabs.common.net.ErrorMessage;

public class CommonException extends Exception{
	/** 
	 * ´íÎóÏûÏ¢
	 */
	private ErrorMessage errorMessage;
	
	/**
	 * µ×²ãÒì³£
	 */
	private Exception backupException;
	
	private static final long serialVersionUID=-2019803409178990L;
	
	public CommonException(){
		
	}
	
	
	
	public CommonException(ErrorMessage em,Exception backExcep){
		this.errorMessage=em;
		this.backupException=backExcep;
	}
	
	public CommonException(ErrorMessage errorMessage){
		this.errorMessage=errorMessage;
	}
	
	public int getErrorCode(){
		return errorMessage.getCode(); 
	}

	public Exception getBackupException() {
		return backupException;
	}

	public void setBackupException(Exception backupException) {
		this.backupException = backupException;
	}

	public ErrorMessage getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(ErrorMessage errorMessage) {
		this.errorMessage = errorMessage;
	}
	
}
