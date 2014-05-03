package com.tolo.t3gabs.common.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * �ṩ�������ַ���ת����MD5�����ַ����Ĺ��߷�����
 *
 */
public class MD5Util {
	/**
	 * �÷�����ָ�����ַ�����MD5�㷨���ܺ󷵻ء�
	 * @param s
	 * @return
	 */
	public static String getMD5Encoding(String s) {
		byte[] input=s.getBytes(); 
		String output = null; 
//		����16������ĸ 
		char[] hexChar={'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'}; 
		try{ 
			//		���һ��MD5ժҪ�㷨�Ķ��� 
			MessageDigest md=MessageDigest.getInstance("MD5"); 
			md.update(input); 
			/* 
			 MD5�㷨�Ľ����128λһ������,������javaAPI�Ѿ��ѽ��ת�����ֽ������� 
			 */ 
			byte[] tmp = md.digest();//���MD5��ժҪ��� 
			char[] str = new char[32]; 
			byte b=0; 
			for(int i=0;i<16;i++){ 
				b=tmp[i]; 
				str[2*i] = hexChar[b>>>4 & 0xf];//ȡÿһ���ֽڵĵ���λ����16������ĸ 
				str[2*i+1] = hexChar[b & 0xf];//ȡÿһ���ֽڵĸ���λ����16������ĸ 
			} 
			output = new String(str); 
		}catch(NoSuchAlgorithmException e){ 
			e.printStackTrace(); 
		} 
		
		return output; 
	}
	
	public static void main(String[] args){
		String str=MD5Util.getMD5Encoding("tarena");
		System.out.println(str);
	}

}
