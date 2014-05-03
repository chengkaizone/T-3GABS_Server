package com.tolo.t3gabs.server.dao;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.tolo.t3gabs.common.entities.Flight;

public interface FlightDao {
	
	/**
	 * 
	 * @param flightNumber
	 * @return
	 * @throws Exception
	 */
	public List<Flight> searchFlights(String depAirportCode,String arrAirportCode,Date date)throws Exception;
	
	/**
	 * 根据航班编号查询航班对象。
	 * @param flightId
	 * @return
	 * @throws Exception
	 */
	public Flight getFlightById(String flightId) throws Exception;
	
	
	/**
	 * 修改航班对象
	 * @param data
	 * @param where
	 * @param args
	 * @throws Exception
	 */
	public void updateFlight(Map<String,Object> data,String where ,String[] args)throws Exception;

	
	public String[] searchFlights(String flight_name) throws Exception;
}