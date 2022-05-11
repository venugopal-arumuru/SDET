<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isELIgnored="false" %>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<table width="100%" border=1>
<tr>
<th>Customer ID</th>
<th>Customer Name</th>
<th>Gender</th>
<th>Location</th>
<th>Email</th>
</tr>
<c:forEach items="${cusall }" var="cus">
<tr>
<td>${cus.cusid }</td>
<td>${cus.cusname }</td>
<td>${cus.gender }</td>
<td>${cus.location }</td>
<td>${cus.email }</td>
</tr>

</c:forEach>
</table>
</body>
</html>