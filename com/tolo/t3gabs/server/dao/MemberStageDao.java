package com.tolo.t3gabs.server.dao;

import java.util.List;

import com.tolo.t3gabs.common.entities.MemberStage;

public interface MemberStageDao {
	
	/**
	 * �õ���Ա�ĺ�����Ϣ
	 * @param membId ��Ա���
	 * @return �û�Ա�ĺ�����Ϣ�б�
	 */
	public List<MemberStage> getStage(int membId)throws Exception;

}
