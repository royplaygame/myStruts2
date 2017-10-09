package com.hy.ly.struts2.action;

import java.util.Map;

import org.apache.struts2.interceptor.ApplicationAware;
import org.apache.struts2.interceptor.ParameterAware;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;

public class TestAwareAction implements ApplicationAware, SessionAware, RequestAware, ParameterAware {
	private Map<String, Object> application;
	private Map<String, Object> session;
	private Map<String, Object> request;
	private Map<String, String[]> params;

	public String execute() {

		// 1. 向 application 中加入一个属性: applicationKey2 - applicationValue2
		application.put("applicationKey2", "applicationValue2");

		// 2. 从 application 中读取一个属性 date, 并打印.
		System.out.println(application.get("date"));

		// 3. 放置session
		session.put("sessionKey", "sessionValue");
		
		// 4. 放置request
		request.put("requestKey", "requestValue");
		
		// 5. 获取参数
		String []names=params.get("name");
		System.out.println(names[0]);
		
		return "success";
	}

	@Override
	public void setApplication(Map<String, Object> application) {
		this.application = application;

	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	@Override
	public void setParameters(Map<String, String[]> params) {
		this.params = params;
	}

	@Override
	public void setRequest(Map<String, Object> request) {
		this.request = request;
	}
}
