package com.tolo.t3gabs.server.action;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import com.tolo.t3gabs.common.net.Request;
import com.tolo.t3gabs.common.net.Response;

/**
 * @author fanjunjie
 *	��ȡ�����ط�������������
 */
public class CompareProgramVersionAction extends ServerAction{

	@Override
	public void executeSome(Request request, Response response)
			throws Exception {
			Properties properties=new Properties();
			//��ȡ�����ļ��еİ汾��
			properties.load(new FileInputStream("config//CachedDatebaseVersion.properties"));	
			String version=properties.getProperty("version");
			System.out.println("��ǰ�������ݿ�汾Ϊ:"+version);
			response.addParameter("version", version);

		
	}
	
	/**
	 * ������main����
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
		System.out.println("��ǰ�������ݿ�汾Ϊ:"+version);
	}

}
