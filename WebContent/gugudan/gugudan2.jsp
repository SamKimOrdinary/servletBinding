<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>구구단</title>
</head>
<body>
	<%@ include file="../inc/menu.jsp"%>
	
	<h1> guguFrm, get, /gugu2, 결과 서블릿</h1>
	
	<form name="guguFrm" method="get" action="/servletBinding/gugu2">
		단<input type="number" name="dan" value="3"> <input type="submit" value="계산">
	</form>
</body>
</html>