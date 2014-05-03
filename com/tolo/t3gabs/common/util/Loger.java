package com.tolo.t3gabs.common.util;

import java.io.File;

import com.tolo.t3gabs.server.service.ServerContext;

public class Loger {
	private static File errorLogFile;
	private static int currentErrorLogId;
	
	private static File operationLogFile;
	private static int currentOperationLogId;
	
	private static File accountLogFile;
	private static int currentAccountLogId;
	
	
	static{
		errorLogFile=ServerContext.getErrorLogFile();
		operationLogFile=ServerContext.getOperationLogFile();
		accountLogFile=ServerContext.getAccountLogFile();
		currentErrorLogId=0;
		currentOperationLogId=0;
		currentAccountLogId=0;
	}
	
	
	public static int errorLog(Exception e){
		e.printStackTrace();
		currentErrorLogId++;
		return currentErrorLogId;
	}
	
	public static int errorLog(String message){
		//???
		currentErrorLogId++;
		return currentErrorLogId;
	}

	public static int operationLog(Exception e){
		//????
		currentOperationLogId++;
		return currentOperationLogId;
	}
	
	public static int operationLog(String message){
		//???
		currentOperationLogId++;
		return currentOperationLogId;
	}
	
	public static int accoutLog(Exception e){
		//????
		currentAccountLogId++;
		return currentAccountLogId;
	}
	
	public static int accoutLog(String message){
		//???
		currentAccountLogId++;
		return currentAccountLogId;
	}
}
