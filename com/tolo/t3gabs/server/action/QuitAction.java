package com.tolo.t3gabs.server.action;

import java.util.UUID;

import com.tolo.t3gabs.common.net.Request;
import com.tolo.t3gabs.common.net.Response;
import com.tolo.t3gabs.server.service.ServerContext;

public class QuitAction extends ServerAction {

	@Override
	public void executeSome(Request request, Response response) throws Exception {
		UUID uuid=(UUID)request.getParameter("SessionId");
		ServerContext.onlineUsers.remove(uuid);
	}
}
