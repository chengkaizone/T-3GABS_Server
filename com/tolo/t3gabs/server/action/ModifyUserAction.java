package com.tolo.t3gabs.server.action;
import com.tolo.t3gabs.common.entities.User;
import com.tolo.t3gabs.common.net.Request;
import com.tolo.t3gabs.common.net.Response;
import com.tolo.t3gabs.server.dao.UserDao;
import com.tolo.t3gabs.server.service.DaoFactory;
public class ModifyUserAction extends ServerAction{

	@Override
	public void executeSome(Request request, Response response) throws Exception {
		User user = (User) request.getParameter("NewUser");
		UserDao userDao = DaoFactory.getUserDao();
		userDao.modifyUser(user);
	}
}
