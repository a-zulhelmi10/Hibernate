<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Homepage Welcome</title>
</head>
<body>
	<h3> Welcome <%= request.getParameter("username") %> </h3>
	Click <a href="login.jsp">here</a> to go back
</body>
</html>