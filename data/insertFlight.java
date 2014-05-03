package data;



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Random;

import com.tolo.t3gabs.common.util.ConnectionUtil;

public class insertFlight {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		try {
		Connection conn=null;
		PreparedStatement pstm=null;
		ResultSet rs=null;
		conn=ConnectionUtil.getCurrentConnection();
		for (int i = 0; i < 10000; i++) {
			int c;
			System.out.println(conn);
			Random r=new Random();
			String b1=""+r.nextInt(3)+r.nextInt(10);
			String time1=" "+r.nextInt(2)+r.nextInt(10)+":"+r.nextInt(6)+r.nextInt(10)+":"+r.nextInt(6)+r.nextInt(10);
			String time2=" "+r.nextInt(2)+r.nextInt(10)+":"+r.nextInt(6)+r.nextInt(10)+":"+r.nextInt(6)+r.nextInt(10);
			String date1="2011-11-"+b1+time1;
			String b2=""+r.nextInt(10)+r.nextInt(10)+r.nextInt(10)+r.nextInt(10);
			String date12="201111"+b1+b2;
			String date2="2011-11-"+(Integer.parseInt(b1)+1)+time2;
//			String sqlStr="insert into flight(flight_id,flight_num,fl_departure_date,fl_arrival_date,route_id,plane_id,"+
//					"f_seats_remain,b_seats_remain,e_seats_remain,current_classes,current_discount,full_price,current_price,"+
//					"tax1_price,tax2_price,current_order) "+
//					" values (?,?,"+"'"+date1+"'"+","+"'"+date2+"'"+",?,?,?,?,?,?,?,?,?,?,?,1)";
			String sqlStr="insert into flight(flight_id,flight_num,fl_departure_date,fl_arrival_date,route_id,plane_id,"+
					"f_seats_remain,b_seats_remain,e_seats_remain,current_classes,current_discount,full_price,current_price,"+
					"tax1_price,tax2_price,current_order) "+
					" values ('N"+date12+"','TL"+b2+"','"+date1+"','"+date2+"',"+(r.nextInt(48)+1)+","+(r.nextInt(103)+1)+","+(r.nextInt(20)+1)+",0"+(r.nextInt(50)+1)+","+(r.nextInt(500)+1)+",'F,C,Y',1.0,"+((c=(r.nextInt(1000)+100))+".00")+","+c+".00"+",50.00,40.00,1)";
			pstm=conn.prepareStatement(sqlStr);
			System.out.print("N"+date12);
			System.out.println("     "+date1+"     "+date2+"      "+time1+"      "+time2);
//			pstm.setInt(3, r.nextInt(48)+1);//route_id  1-48
//			pstm.setInt(4, r.nextInt(103)+1);//plane_id 1-103
//			pstm.setInt(5, r.nextInt(20)+1);//f_seats_remain
//			pstm.setInt(6,r.nextInt(50)+1);//b_seats_remain
//			pstm.setInt(7, r.nextInt(400)+1);//e_seats_remain
//			pstm.setString(8, "'F,C,Y'");//current_classes
//			pstm.setDouble(9,1.0 );//current_discount
//			pstm.setDouble(10, a=r.nextInt(1000)+100+0.0);//full_price
//			pstm.setDouble(11, a);//current_price
//			pstm.setDouble(12,50.0 );//tax1_price
//			pstm.setDouble(13,40.0 );//tax2_price
			pstm.execute(sqlStr);
			System.out.println("OK");

			
		}
	
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			main(args);
		}
		

	}

}
