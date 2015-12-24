<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<a href="/test1234.do?startNo=1&endNo=10">Click me</a> <br>
	<a href="/loginPage.do">로그인 페이지 이동</a> <br>
	
	Working with server: 
	<%=application.getServerInfo() %> <br>
	
	Servlet Specification: 
	<%=application.getMajorVersion()%>.<%= application.getMinorVersion() %> <br>
	
	JSP version: 
	<%= JspFactory.getDefaultFactory().getEngineInfo().getSpecificationVersion() %>
</body>
</html>