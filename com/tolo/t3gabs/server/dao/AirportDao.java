package com.tolo.t3gabs.server.dao;

import java.util.Map;

import com.tolo.t3gabs.common.entities.Airport;

public interface AirportDao {
	public Map<Integer,Airport> getAllAirports() throws Exception;

}
