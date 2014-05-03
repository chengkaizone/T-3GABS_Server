package com.tolo.t3gabs.server.dao;

import java.util.Map;

import com.tolo.t3gabs.common.entities.City;

public interface CityDao {
	public Map<Integer,City> getAllCities() throws Exception;
	

}
