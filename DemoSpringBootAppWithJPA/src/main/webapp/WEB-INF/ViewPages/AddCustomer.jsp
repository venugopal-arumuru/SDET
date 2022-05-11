<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isELIgnored="false" %>
    <%@ taglib prefix="frm" uri="http://www.springframework.org/tags/form" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
table
{
margin-left: auto;
margin-right: auto;
}
</style>
</head>
<body>
<frm:form  method="POST"  action="addnew"  modelAttribute="customer">
<table width="50%" border=1>
<tr>
<td>Customer Name</td>
<td>
<frm:input path="cusname"  type="text"/>
</td>
</tr>

<tr>
<td>Gender </td>
<td>
<frm:radiobutton path="gender"  name="rdogender"  value="Male"/> Male
<br />
<frm:radiobutton path="gender"  name="rdogender"  value="Female"/> Female
</td>
</tr>

<tr>
<td>Location : </td>
<td>
<frm:select path="location">
	<option value="hyderabad">Hyderabad</option>
	<option value="pune">Pune</option>
	<option value="bangalore">Bangalore</option>
</frm:select>
</td>
</tr>

<tr>
<td>Customer Email</td>
<td>
<frm:input path="email"  type="email"/>
</td>
</tr>

<tr>
<td>Email Password</td>
<td>
<frm:input path="pasword"  type="text"/>
</td>
</tr>

<tr>
<td><input type="submit" value="Add Customer" /></td>
<td>
<input type="reset"  value="Clear All"  />
</td>
</tr>
</table>
<h2>${msg }</h2>
</frm:form>
</body>
</html>