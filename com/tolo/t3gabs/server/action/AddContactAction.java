package com.tolo.t3gabs.server.action;

import com.tolo.t3gabs.common.entities.Contact;
import com.tolo.t3gabs.common.entities.Passenger;
import com.tolo.t3gabs.common.entities.User;
import com.tolo.t3gabs.common.net.Request;
import com.tolo.t3gabs.common.net.Response;
import com.tolo.t3gabs.server.dao.ContactDao;
import com.tolo.t3gabs.server.dao.PassengerDao;
import com.tolo.t3gabs.server.dao.UserDao;
import com.tolo.t3gabs.server.service.DaoFactory;

public class AddContactAction extends ServerAction{

	@Override
	public void executeSome(Request request, Response response)
			throws Exception {
		Contact contact = (Contact) request.getParameter("Contact");
		User user = (User)request.getParameter("User");
		
		ContactDao contactDao = DaoFactory.getContactDao();
		int contact_id = contactDao.addContact(contact);
	
		UserDao userDao = DaoFactory.getUserDao();
		userDao.addContact(user, contact_id);
		response.addParameter("contactId", contact_id);
	}
	

}
