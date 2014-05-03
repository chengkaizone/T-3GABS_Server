package com.tolo.t3gabs.server.dao;

import java.util.List;

import com.tolo.t3gabs.common.entities.Contact;
import com.tolo.t3gabs.common.entities.Passenger;

public interface ContactDao {
	
	public Contact getContact(int id) throws Exception;

	public int addContact(Contact contact )throws Exception;
	
	public void deleteContact(int contactId,int userId)throws Exception;
	
	public List<Passenger> searchContacts(int userId)throws Exception;

	public void setUser(int userId,int contactId) throws Exception;
	
	public void updateContact(Contact contact) throws Exception;
}
