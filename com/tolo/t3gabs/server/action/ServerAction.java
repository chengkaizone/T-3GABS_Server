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
			response.setErrorMessage(new ErrorMessage("ϵͳ��������ϵϵͳ����Ա��������־�ţ�"+logid));
		}
		
		return response;
		
	}
	
	/**
	 * ʵ�ֵ�¼��֤����
	 * @throws ValidationException 
	 */
	protected void loginValidate(Request request) throws ValidationException{
		int type = request.getType();
		if(type==Request.LOGIN_REQUEST||type==Request.REGISTE_REQUEST	//����ǵ�½����ע������������֤,ֱ�ӷ���
				||type==Request.COMPARE_PROGRAM_VERSION||type==Request.UPDATE_BUSINESS_DATA){	//�汾�Ƚ�,�汾����������֤	
			return;
		}
		UUID uuid = (UUID)request.getParameter("SessionId");
		User user = ServerContext.onlineUsers.get(uuid);
		if(user==null)														//���û��sessionId��Ӧ��User,�׳��쳣
			throw new ValidationException(ErrorMessageUtil.getErrorMessage(1002));
		if(System.currentTimeMillis()-user.getLastActionTime().getTime()>1000*60*10){	//����Ѿ�����10����ʧЧ�Ի�,�׳��쳣
			ServerContext.onlineUsers.remove(uuid);
			throw new ValidationException(ErrorMessageUtil.getErrorMessage(1002));
		}
		user.setLastActionTime(new Date());									//����,������������ʱ��
	}
	
	public abstract void executeSome(Request request,Response response) throws Exception;
}
