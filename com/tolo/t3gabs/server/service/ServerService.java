package com.tolo.t3gabs.server.service;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;
public class ServerService {
	private ServerSocket mss;
	private boolean flag;
	public ServerService(){
		flag=true;
	}
	public void startService(){
		try {
			if(ServerContext.isMobileServiceOn()){
				System.out.println("启动手机服务...\t["+new Date()+"]");
				mss=new ServerSocket(ServerContext.getServerPort());
				System.out.println("手机服务启动完成\t["+new Date()+"]");
				while(flag){
					Socket s=mss.accept();
					new ServerThread(s).start();
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
