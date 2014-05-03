package com.tolo.t3gabs.server.action;

import java.util.List;

import javax.swing.ListModel;

import com.tolo.t3gabs.common.entities.Subscription;
import com.tolo.t3gabs.common.net.Request;
import com.tolo.t3gabs.common.net.Response;
import com.tolo.t3gabs.server.dao.UserDao;
import com.tolo.t3gabs.server.service.DaoFactory;

public class SetSubscriptionAction extends ServerAction{

	@Override
	public void executeSome(Request request, Response response)
			throws Exception {
		List<Subscription> subs = (List<Subscription>)request.getParameter("subs");
		int userId = (Integer)request.getParameter("userId");
		UserDao userDao = DaoFactory.getUserDao();
		userDao.setSubscription(userId,subs);
	}
	

}
