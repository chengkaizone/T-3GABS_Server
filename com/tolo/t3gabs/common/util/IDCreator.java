package com.tolo.t3gabs.common.util;

import java.util.Date;

public class IDCreator {
	private static int i=0;
	
	@SuppressWarnings("deprecation")
	public static String getStringID(){
		Date date=new Date();
		int year=date.getYear()+1900;
		int month=date.getMonth()+1;
		int day=date.getDate();
		int hour=date.getHours();
		int min=date.getMinutes();
		int sec=date.getSeconds();
		int mill=(int)(date.getTime()%1000);
		String str="";
		str+=toString(year,4);
		str+=toString(month,2);
		str+=toString(day,2);
		str+=toString(hour,2);
		str+=toString(min,2);
		str+=toString(sec,2);
		str+=toString(mill,3);
		str+=toString(i,3);
		i++;
		
		if(i>=1000){
			i=0;
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
		return str;
		
	}
	
	public synchronized static long getNumID(){
		long time = System.currentTimeMillis();
		System.out.println(time);
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return time;
		
	}
	

	
	private static String toString(int num,int r){
		char[] ch=new char[r];
		while(r>0){
			int k=num%10;
			ch[r-1]=(char)(k+'0');
			num=num/10;
			r--;
		}
		return new String(ch);
	}
	
	public static void main(String[] args){
//		Date date=new Date();
//		date.setTime(1288234612690L);
//		System.out.println(date);
		for(int i=0;i<120;i++){
			System.out.println(getNumID());
		}
		
	}

}
