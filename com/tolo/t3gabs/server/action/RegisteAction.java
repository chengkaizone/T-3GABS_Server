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
		//�Ƚ�����,�����������ɹ��ķ���ֵ���޸�����~
		
		//ͨ��Daofactory���userDao,contactDao��passengerDao����~
		UserDao userDao=DaoFactory.getUserDao();
		ContactDao contactDao=DaoFactory.getContactDao();
		PassengerDao passengerDao=DaoFactory.getPassengerDao();
		
		//ͨ��getParameter�����õ�user����~
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
		
		//ʹ��userDao��addUser����,�Ѵ������� user���󴫽�ȥ~
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
