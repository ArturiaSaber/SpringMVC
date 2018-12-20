<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Register</title>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/jquery-1.10.2.min.js"></script>
<script type="text/javascript">
	function testJson() {
		var username = $('#username').val();
		var password = $('#password').val();
		var c = JSON.stringify({username:username,password:password});
		alert(c);
		$.ajax({
			url: "${pageContext.request.contextPath}/user/testJson",
			type: "post",
			data: JSON.stringify({username:username,password:password}),
			contentType:"application/json;charset=UTF-8",
			dataType:"json",
			success:function(data){
				if (data != null) {
					//alert(data);
					alert(JSON.stringify(data));
				}
			}
		});
	}
</script>
</head>
<body>
	<form action="${pageContext.request.contextPath}/user/registerUser" method="post">
		用户名：<input type="text" name="username" id="username"/><br/>
		密&nbsp;&nbsp;&nbsp;码：<input type= "text" name="password" id="password"/><br/>
		<input type="button" value="Json交互" onclick="testJson()" />
	</form>
</body>
</html>