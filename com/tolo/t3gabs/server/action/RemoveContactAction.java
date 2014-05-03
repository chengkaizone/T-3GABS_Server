package com.tolo.t3gabs.server.action;

import com.tolo.t3gabs.common.net.Request;
import com.tolo.t3gabs.common.net.Response;
import com.tolo.t3gabs.server.dao.ContactDao;
import com.tolo.t3gabs.server.dao.PassengerDao;
import com.tolo.t3gabs.server.service.DaoFactory;

public class RemoveContactAction extends ServerAction{

	@Override
	public void executeSome(Request request, Response response)
			throws Exception {
		Integer contactId=(Integer) request.getParameter("contactId");
		Integer userId = (Integer)request.getParameter("userId");
		ContactDao contactDao = DaoFactory.getContactDao();
		contactDao.deleteContact(contactId,userId);
	}
	

}
