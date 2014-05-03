package com.tolo.t3gabs.common.util;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Hashtable;

import com.tolo.t3gabs.common.net.ErrorMessage;
import com.tolo.t3gabs.server.service.ServerContext;

/**
 * 缓存错误消息，并提供根据错误编码查找错误消息的方法
 *
 */
public class ErrorMessageUtil {
	/**
	 * 缓存所有错误消息
	 */
	private static Hashtable<Integer,ErrorMessage> errorMessageCache;
	
	static{
		errorMessageCache=new Hashtable<Integer,ErrorMessage>();
		loadErrorMessages();
	}
	
	private static void loadErrorMessages(){
		String fileName=ServerContext.getErrorMessageFile();
		FileInputStream fis=null;
		BufferedReader br=null;
		try {
			fis=new FileInputStream(fileName);
			br=new BufferedReader(new InputStreamReader(fis,"GBK"));
			String str=null;
			while((str=br.readLine())!=null){
				String[] ss=str.split(":");
				ErrorMessage em=new ErrorMessage();
				em.setCode(Integer.parseInt(ss[0]));
				em.setName(ss[1]);
				em.setMessage(ss[2]);
				errorMessageCache.put(em.getCode(), em);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static ErrorMessage getErrorMessage(int code){
		return errorMessageCache.get(code);
	}
	
	public static ErrorMessage getErrorMessage(int code,String details){
		ErrorMessage er=errorMessageCache.get(code);
		ErrorMessage newER=new ErrorMessage(er.getCode(),er.getName(),er.getMessage(),details);
		return newER;
	}

}
