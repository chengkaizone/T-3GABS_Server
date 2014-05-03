package com.tolo.t3gabs.server.action;

import java.util.Date;
import java.util.UUID;

import com.tolo.t3gabs.common.entities.User;
import com.tolo.t3gabs.common.exceptions.BusinessException;
import com.tolo.t3gabs.common.exceptions.ValidationException;
import com.tolo.t3gabs.common.net.ErrorMessage;
import com.tolo.t3gabs.common.net.Request;
import com.tolo.t3gabs.common.net.Response;
import com.tolo.t3gabs.common.util.ConnectionUtil;
import com.tolo.t3gabs.common.util.ErrorMessageUtil;
import com.tolo.t3gabs.common.util.Loger;
import com.tolo.t3gabs.server.service.ServerContext;

public abstract class ServerAction {

	
	public Response execute(Request request){
		Response response=new Response();
		try {
			loginValidate(request);
			ConnectionUtil.beginTransaction();
			executeSome(request,response);
			System.out.println(999999);
			ConnectionUtil.commitTransaction();
			response.setStatus(Response.OK_STATE);
		} catch (ValidationException e) {
			response.setErrorMessage(e.getErrorMessage());
			response.setStatus(Response.VALI_ERROR_STATE);
		} catch (BusinessException e) {
			e.printStackTrace();
			response.setErrorMessage(e.getErrorMessage());
			response.setStatus(Response.BUSS_ERROR_STATE);
		}catch (Exception e) {
			response.setStatus(Response.SYS_ERROR_STATE);
			int logid=Loger.errorLog(e);
			response.setErrorMessage(new ErrorMessage("系统错误，请联系系统管理员，错误日志号："+logid));
		}
		
		return response;
		
	}
	
	/**
	 * 实现登录验证功能
	 * @throws ValidationException 
	 */
	protected void loginValidate(Request request) throws ValidationException{
		int type = request.getType();
		if(type==Request.LOGIN_REQUEST||type==Request.REGISTE_REQUEST	//如果是登陆或者注册请求无需验证,直接返回
				||type==Request.COMPARE_PROGRAM_VERSION||type==Request.UPDATE_BUSINESS_DATA){	//版本比较,版本更新无需验证	
			return;
		}
		UUID uuid = (UUID)request.getParameter("SessionId");
		User user = ServerContext.onlineUsers.get(uuid);
		if(user==null)														//如果没有sessionId对应的User,抛出异常
			throw new ValidationException(ErrorMessageUtil.getErrorMessage(1002));
		if(System.currentTimeMillis()-user.getLastActionTime().getTime()>1000*60*10){	//如果已经过了10分钟失效对话,抛出异常
			ServerContext.onlineUsers.remove(uuid);
			throw new ValidationException(ErrorMessageUtil.getErrorMessage(1002));
		}
		user.setLastActionTime(new Date());									//正常,设置最后的请求时间
	}
	
	public abstract void executeSome(Request request,Response response) throws Exception;
}
