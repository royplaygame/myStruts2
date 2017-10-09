package com.hy.ly.struts2.action;

import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.ApplicationAware;
import org.apache.struts2.interceptor.SessionAware;

public class UserAction implements SessionAware, ApplicationAware {

	private String username;

	public void setUsername(String username) {
		this.username = username;
	}

	private Map<String, Object> session;
	private Map<String, Object> application;

	public String execute() {

		// 把用户信息入到session域中
		// 1. 获取Session,通过实现RequestAware接口的方式
		// 2. 获取登录信息,通过在UserAction中添加setter方法
		// 3. 把用户信息入到session域中
		session.put("username", username);
		// 在线人数+1
		// 1. 获取当前在线人数，从application中获取
		Integer count = (Integer) application.get("count");
		if (count == null) {
			count = 0;
		}
		// 2. 使当前的在线人数加1
		count++;
		application.put("count", count);

		return "login-success";
	}

	@SuppressWarnings("rawtypes")
	public String logout() {
		// 在线人数-1，如果当前人数大于0，则-1
		Integer count = (Integer) application.get("count");
		if (count != null && count > 0) {
			count --;
			application.put("count", count);
		}
		// session失效,强转为SessionMap类型，调用invalidate方法
		((SessionMap)session).invalidate();
		return "logout-success";
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;

	}

	@Override
	public void setApplication(Map<String, Object> application) {
		this.application = application;
	}
}
