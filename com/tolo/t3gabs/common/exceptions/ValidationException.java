package com.tolo.t3gabs.common.exceptions;

import com.tolo.t3gabs.common.net.ErrorMessage;

public class ValidationException extends CommonException{
	
	private static final long serialVersionUID=219087320191245L;
	
	public ValidationException(ErrorMessage em){
		super(em);
	}
	
	
	public ValidationException(){
		
	}

}
