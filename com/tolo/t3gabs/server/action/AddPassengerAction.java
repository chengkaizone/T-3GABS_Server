package com.tolo.t3gabs.server.action;

import com.tolo.t3gabs.common.entities.Passenger;
import com.tolo.t3gabs.common.entities.User;
import com.tolo.t3gabs.common.net.Request;
import com.tolo.t3gabs.common.net.Response;
import com.tolo.t3gabs.server.dao.PassengerDao;
import com.tolo.t3gabs.server.dao.UserDao;
import com.tolo.t3gabs.server.service.DaoFactory;

public class AddPassengerAction extends ServerAction {


	@Override
	public void executeSome(Request request, Response response)
			throws Exception {
		Passenger passenger = (Passenger) request.getParameter("Passenger");
		User user = (User)request.getParameter("User");
		
		PassengerDao passengerDao = DaoFactory.getPassengerDao();
		int psg_id = passengerDao.addPassenger(passenger);
	
		UserDao userDao = DaoFactory.getUserDao();
		userDao.addPassenger(user, psg_id);
		response.addParameter("passengerId", psg_id);
	}

}
