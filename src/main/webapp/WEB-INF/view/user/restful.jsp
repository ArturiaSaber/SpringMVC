<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Search</title>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/jquery-1.10.2.min.js"></script>
<script type="text/javascript">
	function search() {
		var userid = $('#userid').val();
		$.ajax({
			url: "${pageContext.request.contextPath}/user/user/"+userid,
			type: "get",
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
	<form>
		用户编号：<input type="text" name="userid" id="userid"/><br/>
		<input type="button" value="Search" onclick="search()" />
	</form>
</body>
</html>