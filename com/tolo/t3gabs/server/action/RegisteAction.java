package com.tolo.t3gabs.server.action;
import com.tolo.t3gabs.common.entities.Contact;
import com.tolo.t3gabs.common.entities.Passenger;
import com.tolo.t3gabs.common.entities.User;
import com.tolo.t3gabs.common.net.Request;
import com.tolo.t3gabs.common.net.Response;
import com.tolo.t3gabs.server.dao.ContactDao;
import com.tolo.t3gabs.server.dao.PassengerDao;
import com.tolo.t3gabs.server.dao.UserDao;
import com.tolo.t3gabs.server.service.DaoFactory;
public class RegisteAction extends ServerAction{
	@Override
	public void executeSome(Request request,Response response)throws Exception {
		//先建主表,用其他表建立成功的返回值来修改主表~
		
		//通过Daofactory获得userDao,contactDao和passengerDao对象~
		UserDao userDao=DaoFactory.getUserDao();
		ContactDao contactDao=DaoFactory.getContactDao();
		PassengerDao passengerDao=DaoFactory.getPassengerDao();
		
		//通过getParameter方法得到user对象~
		User user=(User)request.getParameter("User");
		Passenger passenger=new Passenger();
		Contact contact=new Contact();
		
		passenger.setName(user.getName());
		passenger.setCertificateNumber(user.getCertifyNum());
		passenger.setCertificateType(user.getCertifyType());
		
		contact.setName(user.getName());
		contact.setTelephone(user.getTelephone());
		
		user.addPassenger(passenger);
		user.addContacts(contact);
		
		//使用userDao的addUser方法,把传过来的 user对象传进去~
		userDao.addUser(user);
		
		for(Passenger psg:user.getRelativePassengers()){
			int psgId = passengerDao.addPassenger(psg);
			userDao.addPassenger(user,psgId);
		}
		for(Contact conts:user.getRelativeContacts()){
			int contsId = contactDao.addContact(conts);
			userDao.addContact(user,contsId);
		}
	}
}
