package com.tolo.t3gabs.server.action;

import com.tolo.t3gabs.common.net.Request;
import com.tolo.t3gabs.common.net.Response;
import com.tolo.t3gabs.server.dao.PassengerDao;
import com.tolo.t3gabs.server.service.DaoFactory;

public class RemovePassengerAction extends ServerAction{

	public RemovePassengerAction(){
		
	}
	@Override
	public void executeSome(Request request, Response response)
			throws Exception {
		// TODO Auto-generated method stub
		//Passenger passenger = (Passenger) request.getParameter("Passenger");
		Integer passengerId=(Integer) request.getParameter("passengerId");
		Integer userId = (Integer)request.getParameter("userId");
		PassengerDao passengerDao = DaoFactory.getPassengerDao();
		passengerDao.deletePassenger(passengerId,userId);

	}

}
