<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="hwm"
		class="cn.javass.hello.servletimpl.vo.HelloWordModel" scope="request">

	</jsp:useBean>

	
	欢迎账号	<%=hwm.getAccount()%>的朋友来访

</body>
</html>