package com.tolo.t3gabs.server.dao;

import java.util.Map;

import com.tolo.t3gabs.common.entities.Plane;

public interface PlaneDao {
	public Map<Integer,Plane> getAllPlanes() throws Exception;

}
