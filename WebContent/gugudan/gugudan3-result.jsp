<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<% 
 	String str = (String)request.getAttribute("gugu"); 
%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>구구단</title>
</head>
<body>
	<%@ include file="../inc/menu.jsp"%>
	
	<h1> 구구단 결과 페이지</h1>
	<%= str %>
	
</body>
</html>