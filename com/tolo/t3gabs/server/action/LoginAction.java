package com.tolo.t3gabs.server.action;
import java.util.Date;
import java.util.UUID;
import com.tolo.t3gabs.common.entities.User;
import com.tolo.t3gabs.common.exceptions.BusinessException;
import com.tolo.t3gabs.common.net.Request;
import com.tolo.t3gabs.common.net.Response;
import com.tolo.t3gabs.common.util.ErrorMessageUtil;
import com.tolo.t3gabs.server.dao.UserDao;
import com.tolo.t3gabs.server.service.DaoFactory;
import com.tolo.t3gabs.server.service.ServerContext;
/**
 * µÇÂ¼Action
 */
public class LoginAction extends ServerAction{
	@Override
	public void executeSome(Request request,Response response)throws Exception {
		String userName=(String)request.getParameter("UserName");
		String password=(String)request.getParameter("Password");
		System.out.println("UserName="+userName+",Password="+password);
		UserDao userDao=DaoFactory.getUserDao();
		for(User tmpUser:ServerContext.onlineUsers.values()){
			if(tmpUser.getLoginName().equals(userName)){
				throw new BusinessException(ErrorMessageUtil.getErrorMessage(1001));
			}
		}
		User user=userDao.getUser(userName,password);
		if(user!=null){
			user.setLastActionTime(new Date());
			user.setLastLoginTime(new Date());
			UUID uuid=ServerContext.addOnlineUser(user);
			response.addParameter("User", user);
			response.addParameter("SessionId",uuid);
		}else{
			throw new BusinessException(ErrorMessageUtil.getErrorMessage(1004));
		}
	}
}
