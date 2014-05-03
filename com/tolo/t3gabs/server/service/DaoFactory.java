package com.tolo.t3gabs.server.service;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import com.tolo.t3gabs.server.dao.AirportDao;
import com.tolo.t3gabs.server.dao.BranchDao;
import com.tolo.t3gabs.server.dao.CabinClassDao;
import com.tolo.t3gabs.server.dao.CityDao;
import com.tolo.t3gabs.server.dao.ContactDao;
import com.tolo.t3gabs.server.dao.FlightDao;
import com.tolo.t3gabs.server.dao.MemberStageDao;
import com.tolo.t3gabs.server.dao.MembershipDao;
import com.tolo.t3gabs.server.dao.OrderDao;
import com.tolo.t3gabs.server.dao.PassengerDao;
import com.tolo.t3gabs.server.dao.PlaneDao;
import com.tolo.t3gabs.server.dao.ProvinceDao;
import com.tolo.t3gabs.server.dao.RouteDao;
import com.tolo.t3gabs.server.dao.SubscriptionDao;
import com.tolo.t3gabs.server.dao.TicketDao;
import com.tolo.t3gabs.server.dao.UserDao;

public class DaoFactory {
	/**
	 * DAO Ù–‘ºØ
	 */
	private static Properties daoPro;
	private static UserDao userDao;
	private static FlightDao flightDao;
	private static ProvinceDao provinceDao;
	private static CityDao cityDao;
	private static AirportDao airportDao;
	private static RouteDao routeDao;
	private static BranchDao branchDao;

	private static CabinClassDao cabinClassDao;

	private static PlaneDao planeDao;

	private static OrderDao orderDao;

	private static TicketDao ticketDao;

	private static PassengerDao passDao;

	private static ContactDao contactDao;

	private static MembershipDao membshipDao;

	private static MemberStageDao memberStageDao;
	
	private static SubscriptionDao subscriptionDao;

	static {
		daoPro = new Properties();
		try {
			daoPro.load(new FileInputStream("config//DaoConfig.cfg"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public synchronized static ProvinceDao getProvinceDao() {
		if (provinceDao == null) {
			try {
				Class<?> c = Class.forName(daoPro.getProperty("ProvinceDaoClass"));
				provinceDao = (ProvinceDao) c.newInstance();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return provinceDao;
	}

	public synchronized static CityDao getCityDao() {
		if (cityDao == null) {
			try {
				Class c = Class.forName(daoPro.getProperty("CityDaoClass"));
				cityDao = (CityDao) c.newInstance();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return cityDao;
	}

	public synchronized static AirportDao getAirportDao() {
		if (airportDao == null) {
			try {
				Class c = Class.forName(daoPro.getProperty("AirportDaoClass"));
				airportDao = (AirportDao) c.newInstance();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return airportDao;
	}

	public synchronized static RouteDao getRouteDao() {
		if (routeDao == null) {
			try {
				Class c = Class.forName(daoPro.getProperty("RouteDaoClass"));
				routeDao = (RouteDao) c.newInstance();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return routeDao;
	}

	public synchronized static CabinClassDao getCabinClassDao() {
		if (cabinClassDao == null) {
			try {
				Class c = Class.forName(daoPro
						.getProperty("CabinClassDaoClass"));
				cabinClassDao = (CabinClassDao) c.newInstance();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return cabinClassDao;
	}

	public synchronized static BranchDao getBranchDao() {
		if (branchDao == null) {
			try {
				Class c = Class.forName(daoPro.getProperty("BranchDaoClass"));
				branchDao = (BranchDao) c.newInstance();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return branchDao;
	}

	public synchronized static PlaneDao getPlaneDao() {
		if (planeDao == null) {
			try {
				Class c = Class.forName(daoPro.getProperty("PlaneDaoClass"));
				planeDao = (PlaneDao) c.newInstance();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (InstantiationException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			}
		}
		return planeDao;
	}

	public synchronized static UserDao getUserDao() {
		if (userDao == null) {
			try {
				Class<?> c = Class.forName(daoPro.getProperty("UserDaoClass"));
				userDao = (UserDao) c.newInstance();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (InstantiationException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			}
		}
		return userDao;
	}

	public synchronized static FlightDao getFlightDao() {
		if (flightDao == null) {
			try {
				Class<?> c = Class.forName(daoPro.getProperty("FlightDaoClass"));
				flightDao = (FlightDao) c.newInstance();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return flightDao;
	}

	public synchronized static OrderDao getOrderDao() {
		if (orderDao == null) {
			try {
				Class c = Class.forName(daoPro.getProperty("OrderDaoClass"));
				orderDao = (OrderDao) c.newInstance();

			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return orderDao;
	}

	public synchronized static TicketDao getTicketDao() {
		if (ticketDao == null) {
			try {
				Class c = Class.forName(daoPro.getProperty("TicketDaoClass"));
				ticketDao = (TicketDao) c.newInstance();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return ticketDao;
	}

	public synchronized static PassengerDao getPassengerDao() {
		if (passDao == null) {
			try {
				Class c = Class
						.forName(daoPro.getProperty("PassengerDaoClass"));
				passDao = (PassengerDao) c.newInstance();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return passDao;
	}

	public synchronized static ContactDao getContactDao() {
		if (contactDao == null) {
			try {
				Class c = Class.forName(daoPro.getProperty("ContactDaoClass"));
				contactDao = (ContactDao) c.newInstance();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return contactDao;
	}

	public synchronized static MembershipDao getMembershipDao() {
		if (membshipDao == null) {
			try {
				Class c = Class.forName(daoPro
						.getProperty("MembershipDaoClass"));
				membshipDao = (MembershipDao) c.newInstance();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return membshipDao;
	}

	public synchronized static MemberStageDao getMemberStageDao() {
		if (memberStageDao == null) {
			try {
				Class c = Class.forName(daoPro
						.getProperty("MemberStageDaoClass"));
				memberStageDao = (MemberStageDao) c.newInstance();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return memberStageDao;
	}
	
	public synchronized static SubscriptionDao getSubscriptionDao() {
		if (subscriptionDao == null) {
			try {
				Class c = Class.forName(daoPro.getProperty("SubscriptionDaoClass"));
				subscriptionDao = (SubscriptionDao) c.newInstance();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (InstantiationException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			}
		}
		return subscriptionDao;
	}
}
