<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	String uname = request.getParameter("txtUser");
	String pwd = request.getParameter("txtPass");
	
	if(uname.equals("venugopal") && pwd.equals("12345"))
		response.sendRedirect("WelcomePage.jsp");
	else
		response.sendRedirect("ErrorPage.jsp");
%>
</body>
</html>