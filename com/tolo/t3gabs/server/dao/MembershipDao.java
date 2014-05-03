package com.tolo.t3gabs.server.dao;

import com.tolo.t3gabs.common.entities.Membership;

public interface MembershipDao {
	
	public Membership getMembership(int id)throws Exception;
	
	public Membership getMembership(String membCard,String password)throws Exception;
	


}
