<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Jsp Expression </h1>
<%
String str = "Welcome to Jsp";
%>
<h1><%=str %></h1>
<hr />
<h1>JSTL expression</h1>
<h1>  
<c:out value="${'Welcome to JSTL' }" />
</h1>
<h1>Set Tag : </h1>
<c:set var="sal" scope="session" value="${10000}"></c:set>
<h1>Salary is : <c:out value="${sal }" /></h1>
<hr />
<c:set var="income" scope="session" value="${4000*4}"/>  
<c:if test="${income > 8000}">  
   <h2>My income is: <c:out value="${income}"/><h2>  
</c:if>  
</body>
</html>