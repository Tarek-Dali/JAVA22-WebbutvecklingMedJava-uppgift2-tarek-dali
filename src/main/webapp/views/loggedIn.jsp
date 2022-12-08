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

<%
  if (session.getAttribute("loginBean") == null) {

    response.sendRedirect("index.jsp");

} else {

  LoginBean loginBean = (LoginBean) session.getAttribute("loginBean");
  out.println("<h2>" + "Welcome " + loginBean.getUsername() + "</h2>");
}
%>

<form action="<%=request.getContextPath()%>/RemoveSessionServlet" method="POST">
<input type="submit" value="Logout"></input>
</form>



</body>
</html>