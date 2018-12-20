<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Register</title>
</head>
<body>
	<form action="${pageContext.request.contextPath}/user/registerUser" method="post">
		用户名：<input type="text" name="username" /><br/>
		密&nbsp;&nbsp;&nbsp;码：<input type= "text" name="password" /><br/>
		<input type="submit" va1ue="注册" />
	</form>
</body>
</html>