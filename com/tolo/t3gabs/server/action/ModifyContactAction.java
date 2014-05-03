package com.tolo.t3gabs.server.action;

import com.tolo.t3gabs.common.entities.Contact;
import com.tolo.t3gabs.common.entities.Passenger;
import com.tolo.t3gabs.common.net.Request;
import com.tolo.t3gabs.common.net.Response;
import com.tolo.t3gabs.server.dao.ContactDao;
import com.tolo.t3gabs.server.dao.PassengerDao;
import com.tolo.t3gabs.server.service.DaoFactory;

public class ModifyContactAction extends ServerAction{

	@Override
	public void executeSome(Request request, Response response)
			throws Exception {
		Contact contact = (Contact) request.getParameter("Contact");
		ContactDao contactDao = DaoFactory.getContactDao();
		contactDao.updateContact(contact);
	}

}
