<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<h4>Success Page</h4>
	欢迎&nbsp;${sessionScope.username }
	<br/>
	<br/>
	当前在线人数是： ${applicationScope.count }
	<br/>
	<br/>
	<a href="logout.do">退出登录</a>
</body>
</html>