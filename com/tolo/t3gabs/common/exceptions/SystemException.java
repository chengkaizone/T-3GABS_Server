package com.tolo.t3gabs.common.exceptions;

import com.tolo.t3gabs.common.net.ErrorMessage;

public class SystemException extends CommonException{
	private static final long serialVersionUID=991340172819907L;
	
	public SystemException(ErrorMessage em){
		super(em);
	}
	
	public SystemException(){
		
	}
}
