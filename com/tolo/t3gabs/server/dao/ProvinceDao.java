package com.tolo.t3gabs.server.dao;

import java.util.Map;

import com.tolo.t3gabs.common.entities.Province;

public interface ProvinceDao {
	public Map<Integer,Province> getAllProvinces() throws Exception;

}
