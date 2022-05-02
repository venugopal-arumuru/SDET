<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 style="text-align:center">Login Here</h1>
<hr />
<form name="f1"  method="POST"  action="loginprocess">
<p style="text-align:center">
	<input type="text"  name="txtUser"  placeholder="UserName" required />
	<br />	<br />
	<input type="password"  name="txtPass"  placeholder="Password" required />
	<br />	<br />
	<input type="submit"  value="Login Here" />
	<input type="reset"  value="Clear All" />
	<br />	<br />
	<h2 style="text-align:center;color:red">${loginfo }</h2>
</p>

</form>
</body>
</html>