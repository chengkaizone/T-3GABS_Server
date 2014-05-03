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
 * 该类用来存储服务器端需缓存的对象和Dao对象
 */
public class ServerContext {
	/**
	 * 在线用户会话列表
	 */
	public static Map<UUID,User> onlineUsers;
	/**
	 * 服务器端属性集
	 */
	public static Properties serverConfigPro;
	/**
	 * 请求-响应属性集
	 */
	public static Properties requestActionPro;
	/**
	 * 机场缓存
	 */
	public static Map<Integer,Airport> airportCache;
	/**
	 * 航线缓存
	 */
	public static Map<Integer,Route> routeCache;
	/**
	 * 营业网点缓存
	 */
	public static Map<Integer,Branch> branchCache;
	
	
	/**
	 * 省份缓存
	 */
	public static Map<Integer,Province> provinceCache;
	
	
	/**
	 * 城市缓存
	 */
	public static Map<Integer,City> cityCache;
	/**
	 * 舱位等级缓存
	 */
	public static Map<Integer,CabinClass> cabinClassCache;
	/**
	 * 飞机缓存
	 */
	public static Map<Integer,Plane> planeCache;
	/**
	 * 订单缓存
	 */
	public static Map<Order,Date> orders;
	/**
	 * 营业网点缓存
	 */
	public static Map<Integer,Subscription> subscriptionCache;
	public static String AIRPORT_DATA_VERSION="1.0";
	public static String BRANCH_DATA_VERSION="1.0";
	public static String ROUTE_DATA_VERSION="1.0";
	public static String PLANE_DATA_VERSION="1.0";
	public static String PROGRAM_VERSION="1.0";
	static{
		System.out.println("加载配置参数...\t["+new Date()+"]");
		loadProperties();
		System.out.println("加载配置参数完成!\t["+new Date()+"]");
		
		System.out.println("加载请求-响应参数...\t["+new Date()+"]");
		loadRequestActionProperties();
		System.out.println("加载请求-响应参数完成!\t["+new Date()+"]");
		
		System.out.println("加载缓存数据...\t["+new Date()+"]");
		init();
		System.out.println("加载缓存数据完成!\t["+new Date()+"]");
		
	}
	
	/**
	 *  初始化方法，该方法将所有缓存空间初始化，并从数据库中装载要缓存的对象。
	 *
	 */
	private static void init(){
		
		onlineUsers=new Hashtable<UUID,User>();
		
		orders=new Hashtable<Order,Date>();
		
		try {
			
			System.out.println("缓存省份数据...\t["+new Date()+"]");
			provinceCache=DaoFactory.getProvinceDao().getAllProvinces();
			System.out.println("缓存省份数据完成!\t["+new Date()+"]");
			
			System.out.println("缓存城市数据...\t["+new Date()+"]");
			cityCache=DaoFactory.getCityDao().getAllCities();
			System.out.println("缓存城市数据完成!\t["+new Date()+"]");
			
			System.out.println("缓存机场数据...\t["+new Date()+"]");
			airportCache=DaoFactory.getAirportDao().getAllAirports();
			System.out.println("缓存机场数据完成!\t["+new Date()+"]");
			
			System.out.println("缓存航线数据...\t["+new Date()+"]");
			routeCache=DaoFactory.getRouteDao().getAllRoutes();
			System.out.println("缓存航线数据完成!\t["+new Date()+"]");
			
			System.out.println("缓存网点数据...\t["+new Date()+"]");
			branchCache=DaoFactory.getBranchDao().getAllBranch();
			System.out.println("缓存网点数据完成!\t["+new Date()+"]");
			
			System.out.println("缓存舱位数据...\t["+new Date()+"]");
			cabinClassCache=DaoFactory.getCabinClassDao().getAllCabinClass();
			System.out.println("缓存舱位数据完成!\t["+new Date()+"]");
			
			System.out.println("缓存飞机数据...\t["+new Date()+"]");
			planeCache=DaoFactory.getPlaneDao().getAllPlanes();
			System.out.println("缓存飞机数据完成!\t["+new Date()+"]");
			
			subscriptionCache = DaoFactory.getSubscriptionDao().getAllSubscriptions();
			System.out.println("缓存订阅消息数据完成!\t["+new Date()+"]");
		} catch (Exception e) {
			System.out.println("数据缓存失败,读取数据库缓存数据失败！");
			e.printStackTrace();
		}
	}
	
	
	/**
	 * 根据配置文件的参数，装载属性集。
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
	 * 根据配置文件的参数，装载请求-响应属性集。
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
	 * 返回配置文件中设置的手机服务端口号
	 * @return
	 */
	public static int getServerPort(){
		return Integer.parseInt(serverConfigPro.getProperty("MobileServerPort"));
	}
	
	/**
	 * 配置文件中设置的柜员服务是否打开
	 * @return
	 */
	public static boolean isCounterServiceOn(){
		return serverConfigPro.getProperty("CounterService").equalsIgnoreCase("ON");
	}
	
	/**
	 * 配置文件中设置的手机服务是否打开
	 * @return
	 */
	public static boolean isMobileServiceOn(){
		return serverConfigPro.getProperty("MobileService").equalsIgnoreCase("ON");
	}
	
	
	/**
	 * 配置文件中设置的访问的数据库名
	 * @return
	 */
	public static String getDatabaseName(){
		return serverConfigPro.getProperty("Database");
	}
	
	/**
	 * 配置文件中设置的错误消息文件名
	 * @return
	 */
	public static String getErrorMessageFile(){
		return serverConfigPro.getProperty("ErrorMessageFile");
	}
	
	/**
	 * 配置文件中设置的错误日志路径
	 * @return
	 */
	public static File getErrorLogFile(){
		return new File(serverConfigPro.getProperty("ErrorLog"));
	}
	
	/**
	 * 配置文件中设置的操作日志路径
	 * @return
	 */
	public static File getOperationLogFile(){
		return new File(serverConfigPro.getProperty("OperationLog"));
	}
	
	
	/**
	 * 配置文件中设置的账户日志路径
	 * @return
	 */
	public static File getAccountLogFile(){
		return new File(serverConfigPro.getProperty("AccountLog"));
	}
	
	
	/**
	 * 配置文件中设置的未支付订单的时效（单位：分钟）
	 * @return
	 */
	public static int getOrderTimeout(){
		return Integer.parseInt(serverConfigPro.getProperty("OrderTimeout"));
	}
	
	/**
	 * 向在线用户列表中添加用户,并随机生成sessionID。
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
