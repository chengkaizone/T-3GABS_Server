package com.tolo.t3gabs.server.dao;

import java.util.Map;

import com.tolo.t3gabs.common.entities.Branch;

public interface BranchDao {
	public Map<Integer,Branch> getAllBranch() throws Exception;

}
