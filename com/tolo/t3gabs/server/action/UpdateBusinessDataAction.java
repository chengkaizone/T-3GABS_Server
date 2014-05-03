package com.tolo.t3gabs.server.action;

import com.tolo.t3gabs.common.net.Request;
import com.tolo.t3gabs.common.net.Response;
import com.tolo.t3gabs.server.service.ServerContext;

/**
 * @author fanjunjie
 * 用于客户端得到所有需缓存的表数据
 *
 */
public class UpdateBusinessDataAction extends ServerAction {

	@Override
	public void executeSome(Request request, Response response)
			throws Exception {
		// 这里在response中把所有的数据返回回去
		response.addParameter("airportCache", ServerContext.airportCache);
		response.addParameter("routeCache", ServerContext.routeCache);
		response.addParameter("branchCache", ServerContext.branchCache);
		response.addParameter("provinceCache", ServerContext.provinceCache);
		response.addParameter("cityCache", ServerContext.cityCache);
		response.addParameter("cabinClassCache", ServerContext.cabinClassCache);
		response.addParameter("planeCache", ServerContext.planeCache);
		response.addParameter("subscriptionCache", ServerContext.subscriptionCache);
	}

}
