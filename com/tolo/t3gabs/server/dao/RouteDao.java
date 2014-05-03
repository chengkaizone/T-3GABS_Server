package com.tolo.t3gabs.server.dao;

import java.util.Map;

import com.tolo.t3gabs.common.entities.Route;

public interface RouteDao {
	
	public Map<Integer,Route> getAllRoutes() throws Exception;

}
