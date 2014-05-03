package com.tolo.t3gabs.server.action;

import java.util.List;
import java.util.UUID;

import com.tolo.t3gabs.common.entities.MemberStage;
import com.tolo.t3gabs.common.entities.Membership;
import com.tolo.t3gabs.common.exceptions.BusinessException;
import com.tolo.t3gabs.common.net.Request;
import com.tolo.t3gabs.common.net.Response;
import com.tolo.t3gabs.common.util.ErrorMessageUtil;
import com.tolo.t3gabs.server.dao.MemberStageDao;
import com.tolo.t3gabs.server.dao.MembershipDao;
import com.tolo.t3gabs.server.dao.impl.UserDaoImplForMySql;
import com.tolo.t3gabs.server.service.DaoFactory;
import com.tolo.t3gabs.server.service.ServerContext;

public class FindMemberMileageAction extends ServerAction{


	@Override
	public void executeSome(Request request, Response response) throws Exception {
		// TODO Auto-generated method stub
		String memberCard = (String)request.getParameter("memberCard");
		String password = (String)request.getParameter("Password");
		MembershipDao membershipDao =DaoFactory.getMembershipDao();
		MemberStageDao  MemberStageDao=DaoFactory.getMemberStageDao(); 
		
		
		Membership memb = membershipDao.getMembership(memberCard, password);//根据用户名和密码得到用户对象
		System.out.println("====="+memb==null);
		if(memb!=null){
			List<MemberStage> memberStage= MemberStageDao.getStage(memb.getMebID());
//			UserDaoImplForMySql user=(UserDaoImplForMySql)DaoFactory.getUserDao();
//			int id=memb.getMebID();
//			UUID uuid = ServerContext.addOnlineUser(user.getUserById(id));
			response.addParameter("MemberStage", memberStage);
			response.addParameter("Memb", memb);
//			response.addParameter("SessionId", uuid);
			
			
			
		}else{
			throw new BusinessException(ErrorMessageUtil.getErrorMessage(1004));
			
		}	
	}
	//出现异常返回-1；
	public int getMembId(Request request,Response response){
		try {
			String memberCard = (String)request.getParameter("memberCard");
			String password = (String)request.getParameter("Password");
			MembershipDao membershipDao =DaoFactory.getMembershipDao();
			MemberStageDao  MemberStageDao=DaoFactory.getMemberStageDao(); 
			Membership memb = membershipDao.getMembership(memberCard, password);
			if(memb!=null){
				return memb.getMebID();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return -1;
	}
}
