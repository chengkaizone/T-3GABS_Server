package com.tolo.t3gabs.server.dao;

import java.util.Map;

import com.tolo.t3gabs.common.entities.CabinClass;

public interface CabinClassDao {
	
	public Map<Integer,CabinClass> getAllCabinClass() throws Exception;

	public CabinClass getCabinClassById(int cabinClassId) throws Exception;
	
}
