<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>


	<form action="/useStrust2HelloWord/helloWordAction.action" method="post">
		<input type="hidden" value="login" name="submitFlag"> 账号：<input
			type="text" name="account"> <br>密码：<input type="text"
			name="password"> <br> <input type="submit" value="提交">
	</form>
</body>
</html>