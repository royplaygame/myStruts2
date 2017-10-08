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
		<form action="product-save.action" method="post">
			产品名称: <input type="text" name="productName" /> <br> <br>
			产品描述: <input type="text" name="productDesc" /> <br> <br>
			产品价格: <input type="text" name="productPrice" /> <br> <br>
			<input type="submit" value="保存" /> <br> <br>
		</form>
	</center>
</body>
</html>