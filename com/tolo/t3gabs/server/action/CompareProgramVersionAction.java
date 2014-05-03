package com.tolo.t3gabs.server.action;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import com.tolo.t3gabs.common.net.Request;
import com.tolo.t3gabs.common.net.Response;

/**
 * @author fanjunjie
 *	读取并返回服务器缓存数据
 */
public class CompareProgramVersionAction extends ServerAction{

	@Override
	public void executeSome(Request request, Response response)
			throws Exception {
			Properties properties=new Properties();
			//读取配置文件中的版本号
			properties.load(new FileInputStream("config//CachedDatebaseVersion.properties"));	
			String version=properties.getProperty("version");
			System.out.println("当前缓存数据库版本为:"+version);
			response.addParameter("version", version);

		
	}
	
	/**
	 * 测试用main方法
	 * @param args
	 */
	public static void main(String[] args) {
		Properties properties=new Properties();
		try {
			properties.load(new FileInputStream("config//CachedDatebaseVersion.properties"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		String version=properties.getProperty("version");
		System.out.println("当前缓存数据库版本为:"+version);
	}

}
