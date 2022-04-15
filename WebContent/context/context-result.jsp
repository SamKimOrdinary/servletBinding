<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	String driver = (String)request.getAttribute("driver");
	String url = (String)request.getAttribute("url");
	String user = (String)request.getAttribute("user");
	String pass = (String)request.getAttribute("pass");
%>    
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<%@ include file="../inc/menu.jsp"%>

	<h1>Context-result</h1>
	driver: <%= driver %><br>
	url : <%= url %><br>
	user : <%= user %><br>
	pass : <%= pass %> <br>
</body>
</html>