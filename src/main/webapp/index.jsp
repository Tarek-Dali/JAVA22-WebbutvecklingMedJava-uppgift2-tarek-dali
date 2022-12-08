<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@page import="model.LoginBean"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>



	<form action="<%=request.getContextPath()%>/FirstServlet" method="POST">
		<p>Enter your username</p>
		<input type="text" name="username" />
		<p>Enter your password</p>
		<input type="password" name="password" /> 
		<br> <br> 
		<input type="submit" value="Login" />
	</form>

</body>
</html>