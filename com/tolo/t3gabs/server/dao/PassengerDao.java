package com.tolo.t3gabs.server.dao;

import java.util.List;

import com.tolo.t3gabs.common.entities.Passenger;

public interface PassengerDao {
	public Passenger getPassenger(int id) throws Exception;

	public int addPassenger(Passenger psg )throws Exception;
	
	public void updatePassenger(Passenger psg )throws Exception;
	
	public void deletePassenger(int passengerId , int userId)throws Exception;
	
	public List<Passenger> searchPassenger(int userId)throws Exception;

	public void setUser(int userId,int psgId) throws Exception;

	public void modifyPassenger(Passenger psg )throws Exception;
}
