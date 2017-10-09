package com.hy.ly.struts2.action;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.util.ServletContextAware;

public class TestServletAwareAction implements ServletContextAware, ServletRequestAware, ServletResponseAware {
	private HttpServletResponse response;
	private HttpServletRequest request;
	private ServletContext application;

	public String execute() {
		System.out.println(this.request);
		System.out.println(this.response);
		System.out.println(this.request.getSession());
		System.out.println(this.application);
		return "success";
	}

	@Override
	public void setServletResponse(HttpServletResponse response) {
		this.response = response;

	}

	@Override
	public void setServletRequest(HttpServletRequest request) {
		this.request = request;

	}

	@Override
	public void setServletContext(ServletContext application) {
		this.application = application;

	}

}
