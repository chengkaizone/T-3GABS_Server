package com.tolo.t3gabs.server.action;

import java.util.ArrayList;
import java.util.Date;

import com.tolo.t3gabs.common.entities.Flight;
import com.tolo.t3gabs.common.net.Request;
import com.tolo.t3gabs.common.net.Response;
import com.tolo.t3gabs.server.dao.FlightDao;
import com.tolo.t3gabs.server.service.DaoFactory;

/**
 * 查询航班Action
 * 
 *
 */
public class SearchFlightAction extends ServerAction{
	

	@Override
	public void executeSome(Request request,Response response) throws Exception{
		String flight_num = (String) request.getParameter("flight_num");
		//如果有航班号的话,执行上面的代码~
		if (flight_num != null) {
			System.out.println(flight_num);
			FlightDao flightDao = DaoFactory.getFlightDao();
			response.addParameter("FlightRoute", flightDao.searchFlights(flight_num));
		} else {
			String depAirportCode = (String) request.getParameter("DepAirportCode");
			String arrAirportCode = (String) request.getParameter("ArrAirportCode");
			Date flightdate = (Date) request.getParameter("FlightDate");

			FlightDao flightDao = DaoFactory.getFlightDao();
			System.out.println(flightdate);
			ArrayList<Flight> flights = (ArrayList<Flight>) flightDao
					.searchFlights(depAirportCode, arrAirportCode, flightdate);
			response.addParameter("Flights", flights);
		}
	}

}
