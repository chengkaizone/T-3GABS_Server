package com.tolo.t3gabs.server.dao;

import java.util.Map;

import com.tolo.t3gabs.common.entities.Subscription;

public interface SubscriptionDao {
	public Map<Integer,Subscription> getAllSubscriptions() throws Exception;
}
