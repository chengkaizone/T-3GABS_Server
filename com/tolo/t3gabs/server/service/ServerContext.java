package com.tolo.t3gabs.server.service;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;
import java.util.Hashtable;
import java.util.Map;
import java.util.Properties;
import java.util.UUID;

import com.tolo.t3gabs.common.entities.Airport;
import com.tolo.t3gabs.common.entities.Branch;
import com.tolo.t3gabs.common.entities.CabinClass;
import com.tolo.t3gabs.common.entities.City;
import com.tolo.t3gabs.common.entities.Order;
import com.tolo.t3gabs.common.entities.Plane;
import com.tolo.t3gabs.common.entities.Province;
import com.tolo.t3gabs.common.entities.Route;
import com.tolo.t3gabs.common.entities.Subscription;
import com.tolo.t3gabs.common.entities.User;
import com.tolo.t3gabs.common.net.Request;

/**
 * ���������洢���������軺��Ķ����Dao����
 */
public class ServerContext {
	/**
	 * �����û��Ự�б�
	 */
	public static Map<UUID,User> onlineUsers;
	/**
	 * �����������Լ�
	 */
	public static Properties serverConfigPro;
	/**
	 * ����-��Ӧ���Լ�
	 */
	public static Properties requestActionPro;
	/**
	 * ��������
	 */
	public static Map<Integer,Airport> airportCache;
	/**
	 * ���߻���
	 */
	public static Map<Integer,Route> routeCache;
	/**
	 * Ӫҵ���㻺��
	 */
	public static Map<Integer,Branch> branchCache;
	
	
	/**
	 * ʡ�ݻ���
	 */
	public static Map<Integer,Province> provinceCache;
	
	
	/**
	 * ���л���
	 */
	public static Map<Integer,City> cityCache;
	/**
	 * ��λ�ȼ�����
	 */
	public static Map<Integer,CabinClass> cabinClassCache;
	/**
	 * �ɻ�����
	 */
	public static Map<Integer,Plane> planeCache;
	/**
	 * ��������
	 */
	public static Map<Order,Date> orders;
	/**
	 * Ӫҵ���㻺��
	 */
	public static Map<Integer,Subscription> subscriptionCache;
	public static String AIRPORT_DATA_VERSION="1.0";
	public static String BRANCH_DATA_VERSION="1.0";
	public static String ROUTE_DATA_VERSION="1.0";
	public static String PLANE_DATA_VERSION="1.0";
	public static String PROGRAM_VERSION="1.0";
	static{
		System.out.println("�������ò���...\t["+new Date()+"]");
		loadProperties();
		System.out.println("�������ò������!\t["+new Date()+"]");
		
		System.out.println("��������-��Ӧ����...\t["+new Date()+"]");
		loadRequestActionProperties();
		System.out.println("��������-��Ӧ�������!\t["+new Date()+"]");
		
		System.out.println("���ػ�������...\t["+new Date()+"]");
		init();
		System.out.println("���ػ����������!\t["+new Date()+"]");
		
	}
	
	/**
	 *  ��ʼ���������÷��������л���ռ��ʼ�����������ݿ���װ��Ҫ����Ķ���
	 *
	 */
	private static void init(){
		
		onlineUsers=new Hashtable<UUID,User>();
		
		orders=new Hashtable<Order,Date>();
		
		try {
			
			System.out.println("����ʡ������...\t["+new Date()+"]");
			provinceCache=DaoFactory.getProvinceDao().getAllProvinces();
			System.out.println("����ʡ���������!\t["+new Date()+"]");
			
			System.out.println("�����������...\t["+new Date()+"]");
			cityCache=DaoFactory.getCityDao().getAllCities();
			System.out.println("��������������!\t["+new Date()+"]");
			
			System.out.println("�����������...\t["+new Date()+"]");
			airportCache=DaoFactory.getAirportDao().getAllAirports();
			System.out.println("��������������!\t["+new Date()+"]");
			
			System.out.println("���溽������...\t["+new Date()+"]");
			routeCache=DaoFactory.getRouteDao().getAllRoutes();
			System.out.println("���溽���������!\t["+new Date()+"]");
			
			System.out.println("������������...\t["+new Date()+"]");
			branchCache=DaoFactory.getBranchDao().getAllBranch();
			System.out.println("���������������!\t["+new Date()+"]");
			
			System.out.println("�����λ����...\t["+new Date()+"]");
			cabinClassCache=DaoFactory.getCabinClassDao().getAllCabinClass();
			System.out.println("�����λ�������!\t["+new Date()+"]");
			
			System.out.println("����ɻ�����...\t["+new Date()+"]");
			planeCache=DaoFactory.getPlaneDao().getAllPlanes();
			System.out.println("����ɻ��������!\t["+new Date()+"]");
			
			subscriptionCache = DaoFactory.getSubscriptionDao().getAllSubscriptions();
			System.out.println("���涩����Ϣ�������!\t["+new Date()+"]");
		} catch (Exception e) {
			System.out.println("���ݻ���ʧ��,��ȡ���ݿ⻺������ʧ�ܣ�");
			e.printStackTrace();
		}
	}
	
	
	/**
	 * ���������ļ��Ĳ�����װ�����Լ���
	 *
	 */
	private static void loadProperties(){
		serverConfigPro=new Properties();
		requestActionPro=new Properties();

		try {
			serverConfigPro.load(new FileInputStream("config"+File.separator+"server.cfg"));
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * ���������ļ��Ĳ�����װ������-��Ӧ���Լ���
	 *
	 */
	private static void loadRequestActionProperties(){
		requestActionPro=new Properties();

		try {
			requestActionPro.load(new FileInputStream("config"+File.separator+"request_action.properties"));
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	/**
	 * ���������ļ������õ��ֻ�����˿ں�
	 * @return
	 */
	public static int getServerPort(){
		return Integer.parseInt(serverConfigPro.getProperty("MobileServerPort"));
	}
	
	/**
	 * �����ļ������õĹ�Ա�����Ƿ��
	 * @return
	 */
	public static boolean isCounterServiceOn(){
		return serverConfigPro.getProperty("CounterService").equalsIgnoreCase("ON");
	}
	
	/**
	 * �����ļ������õ��ֻ������Ƿ��
	 * @return
	 */
	public static boolean isMobileServiceOn(){
		return serverConfigPro.getProperty("MobileService").equalsIgnoreCase("ON");
	}
	
	
	/**
	 * �����ļ������õķ��ʵ����ݿ���
	 * @return
	 */
	public static String getDatabaseName(){
		return serverConfigPro.getProperty("Database");
	}
	
	/**
	 * �����ļ������õĴ�����Ϣ�ļ���
	 * @return
	 */
	public static String getErrorMessageFile(){
		return serverConfigPro.getProperty("ErrorMessageFile");
	}
	
	/**
	 * �����ļ������õĴ�����־·��
	 * @return
	 */
	public static File getErrorLogFile(){
		return new File(serverConfigPro.getProperty("ErrorLog"));
	}
	
	/**
	 * �����ļ������õĲ�����־·��
	 * @return
	 */
	public static File getOperationLogFile(){
		return new File(serverConfigPro.getProperty("OperationLog"));
	}
	
	
	/**
	 * �����ļ������õ��˻���־·��
	 * @return
	 */
	public static File getAccountLogFile(){
		return new File(serverConfigPro.getProperty("AccountLog"));
	}
	
	
	/**
	 * �����ļ������õ�δ֧��������ʱЧ����λ�����ӣ�
	 * @return
	 */
	public static int getOrderTimeout(){
		return Integer.parseInt(serverConfigPro.getProperty("OrderTimeout"));
	}
	
	/**
	 * �������û��б�������û�,���������sessionID��
	 * @param user
	 * @return
	 */
	public synchronized static UUID addOnlineUser(User user){
		UUID uuid=null;
		boolean flag;
		do{
			uuid=UUID.randomUUID();
			flag=false;
			for(UUID tmpId:onlineUsers.keySet()){
				if(tmpId.equals(uuid)){
					flag=true;
					break;
				}
			}
		}while(flag);
		
		onlineUsers.put(uuid,user);
		return uuid;
	}
	
	public static Airport getAirportById(int id){
		return airportCache.get(id);
	}
	
	public static Airport getAirportByCode(String code){
		for(Airport air:airportCache.values()){
			if(air.getCode().equalsIgnoreCase(code)){
				return air;
			}
		}
		return null;
	}
	
	public static Route getRouteById(int id){
		return routeCache.get(id);
	}
	
	public static Route getRouteByAirportsCode(String depAirCode,String arrAirCode){
		for(Route rou:routeCache.values()){
			if(rou.getFromAirport().getCode().equalsIgnoreCase(depAirCode) 
					&& rou.getToAirport().getCode().equalsIgnoreCase(arrAirCode)){
				return rou;
			}
		}
		return null;
	}
	
	public static Branch getBranchById(int id){
		return branchCache.get(id);
	}
	
	public static Province getProvinceById(int id){
		return provinceCache.get(id);
	}
	
	public static City getCityById(int id){
		return cityCache.get(id);
	}
	
	public static Plane getPlaneById(int id){
		return planeCache.get(id);
	}
	
	public static CabinClass getCabinClassById(int id){
		return cabinClassCache.get(id);
	}
	
	public static CabinClass getCabinClassByChar(String ch){
		for(CabinClass cc:cabinClassCache.values()){
			if(cc.getClassChar().equals(ch)){
				return cc;
			}
		}
		return null;
	}
	
	public static String getActionNameByRequestCode(int code){
		String name=Request.getRequestNameByCode(code);
		return requestActionPro.getProperty(name);
	}
}
