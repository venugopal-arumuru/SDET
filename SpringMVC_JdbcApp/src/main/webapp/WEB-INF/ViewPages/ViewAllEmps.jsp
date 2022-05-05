<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View All Employees</title>
</head>
<body>
<h1 style="text-align:center">All Employees Info</h1>
<h2 style="text-align:center">
<a href="addemp">New Employee</a>  &nbsp;&nbsp;|&nbsp;&nbsp;
<a href="viewemp">View all Employees</a>
</h2>
<hr />
<table width="100%" border=1>
<tr>
<th>Employee Number</th>
<th>Employee Name</th>
<th>Employee Job</th>
<th>Employee Salary</th>
</tr>
<c:forEach items="${empall }" var="emp">
<tr>
<td>${emp.empno }</td>
<td>${emp.empname }</td>
<td>${emp.job }</td>
<td>${emp.sal }</td>
</tr>

</c:forEach>
</table>
</body>
</html>