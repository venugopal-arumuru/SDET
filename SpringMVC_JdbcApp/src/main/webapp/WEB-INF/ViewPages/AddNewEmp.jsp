<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
	table{
		margin-left: auto;
		margin-right: auto
	}

</style>
</head>
<body>
<h1 style="text-align:center">Employee Registration</h1>
<h2 style="text-align:center">
<a href="addemp">New Employee</a>  &nbsp;&nbsp;|&nbsp;&nbsp;
<a href="viewemp">View all Employees</a>
</h2>

<hr />
<form name="f1"  method="POST"  action="empProcess">
<table width="50%">
<tr>
<td>Employee Number : </td>
<td><input type="text"  name="txtEno"  required /></td>
</tr>

<tr>
<td>Employee Name : </td>
<td><input type="text"  name="txtEname"  required /></td>
</tr>

<tr>
<td>Employee Job : </td>
<td>
<select name="ddlJob">
<option  value="-1">Select Job</option>
<option value="HR-Manager">HR-Manager</option>
<option value="Developer">Developer</option>
<option value="Tester">Tester</option>
<option value="Project Manager">Project Manager</option>
</select>
</td>
</tr>

<tr>
<td>Employee Salary : </td>
<td><input type="text"  name="txtSal"  required /></td>
</tr>

<tr>
<td><input type="submit"  value="Add Employee" /></td>
<td><input type="reset"  value="Clear All" /></td>
</tr>

<tr>
<td colspan="2">
<h2>${msg }</h2>
</td>
</tr>
</table>
</form>
</body>
</html>