<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<jsp:useBean id="helloModel2"
		class="cn.javass.hello.servletimpl.vo.HelloWordModel" scope="request">

	</jsp:useBean>

	<jsp:setProperty property="*" name="helloModel2" />

	<%
		System.out.println(helloModel2.getSubmitFlag());
		if ("login".equals(helloModel2.getSubmitFlag())) {
	%>
	<jsp:forward page="/hello"></jsp:forward>
	<%
		}
	%>

	<form action="/struts2HelloWord/servletimpl/login.jsp" method="post">
		<input type="hidden" value="login" name="submitFlag"> 账号：<input
			type="text" name="account"> <br>密码：<input type="text"
			name="password"> <br> <input type="submit" value="提交">
	</form>
</body>
</html>