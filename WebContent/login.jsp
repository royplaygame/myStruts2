<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<center>
		<div style="height: 150px;"></div>
		<form action="user-login.do" method="post">
			用户名称: <input type="text" name="username" /> <br> <br>
			<input type="submit" value="登录" /> <br> <br>
		</form>
	</center>
</body>
</html>