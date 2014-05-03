package com.tolo.t3gabs.server.action;

import com.tolo.t3gabs.common.entities.Passenger;
import com.tolo.t3gabs.common.net.Request;
import com.tolo.t3gabs.common.net.Response;
import com.tolo.t3gabs.server.dao.PassengerDao;
import com.tolo.t3gabs.server.service.DaoFactory;

public class ModifyPassengerAction extends ServerAction{


	@Override
	public void executeSome(Request request, Response response)
			throws Exception {
		Passenger passenger = (Passenger) request.getParameter("Passenger");
		PassengerDao passengerDao = DaoFactory.getPassengerDao();
		passengerDao.updatePassenger(passenger);
	}

}
