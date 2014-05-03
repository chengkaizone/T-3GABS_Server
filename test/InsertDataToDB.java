package test;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.tolo.t3gabs.common.entities.Route;
import com.tolo.t3gabs.common.util.ConnectionUtil;
import com.tolo.t3gabs.server.service.ServerContext;

public class InsertDataToDB {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		Connection conn=null;
		PreparedStatement pstm=null;
		try {
			conn=ConnectionUtil.getCurrentConnection();
			pstm=conn.prepareStatement("insert into flight" +
					"(flight_id,flight_num,fl_departure_date,fl_arrival_date," +
					"route_id,f_seats_remain,b_seats_remain,e_seats_remain," +
					"current_classes,full_price,current_discount,current_price," +
					"tax1_price,tax2_price)" +
					"values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
			
			
			for(Route rou:ServerContext.routeCache.values()){
				
			}
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
