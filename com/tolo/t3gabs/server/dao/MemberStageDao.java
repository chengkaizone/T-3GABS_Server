package com.tolo.t3gabs.server.dao;

import java.util.List;

import com.tolo.t3gabs.common.entities.MemberStage;

public interface MemberStageDao {
	
	/**
	 * 得到会员的航程信息
	 * @param membId 会员编号
	 * @return 该会员的航程信息列表
	 */
	public List<MemberStage> getStage(int membId)throws Exception;

}
