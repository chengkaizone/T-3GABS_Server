package com.tolo.t3gabs.server.service;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import com.tolo.t3gabs.common.net.Request;
import com.tolo.t3gabs.common.net.Response;
import com.tolo.t3gabs.server.action.ServerAction;
public class ServerThread extends Thread{
	private Socket s;
	private ObjectInputStream ois;
	private ObjectOutputStream oos;
	public ServerThread(Socket s){
		this.s=s;
		try {
			ois=new ObjectInputStream(s.getInputStream());
			oos=new ObjectOutputStream(s.getOutputStream());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void run(){
		Request request=null;
		try {
			request=(com.tolo.t3gabs.common.net.Request)ois.readObject();
			Response res=null;
			ServerAction action=null;
			Class<?> c=Class.forName(ServerContext.getActionNameByRequestCode(request.getType()));
			System.out.println(s.getInetAddress()+":"+Request.getRequestNameByCode(request.getType())+":"+c.getName());
			action=(ServerAction)c.newInstance();
			res=action.execute(request);
			oos.writeObject(res);
			oos.flush();
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}

}
