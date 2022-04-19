<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body>
<h1 style="color:green;text-align:center">Login Here</h1>
<form name="frmLogin"  method="POST"  action="DemoLogFun.jsp">
<p  style="text-align:center">
<input type="text" name="txtUser"  placeholder="Username" />
<br /> <br />
<input type="password" name="txtPass" placeholder="Password" />
<br /> <br />
<input type="submit"  value="Login here" />
<input type="reset"  value="Clear All" />

</p>
</form> 

</body>
</html>