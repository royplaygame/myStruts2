package com.hy.ly.struts2.action;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

public class TestServletActionContext {

	public String execute() {
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpServletResponse response = ServletActionContext.getResponse();
		HttpSession session = ServletActionContext.getRequest().getSession();
		ServletContext servletContext = ServletActionContext.getServletContext();

		System.out.println(request);
		System.out.println(response);
		System.out.println(session);
		System.out.println(servletContext);
		return "success";
	}
}
