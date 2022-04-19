<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 style="text-align:center">Student Registration</h1>
<hr />
<form name="frmReg"  method="POST"  action="#">
<table width="50%" border="1">
	<tr>
		<td align="right">Student Name : </td>
		<td><input type="text" name="txtSname"  /></td>
	</tr>
	<tr>
		<td align="right">Father Name : </td>
		<td><input type="text" name="txtFname"  /></td>
	</tr>
	<tr>
		<td align="right">Gender : </td>
		<td>
			<input type="radio"  name="gender"  value="M" />Male
			<input type="radio"  name="gender"  value="F" />Female
		</td>
	</tr>
	<tr>
		<td align="right">Hobbies : </td>
		<td>
			<input type="checkbox" name="chk1"  value="garden" />Gardening
			<br />
			<input type="checkbox" name="chk2"  value="read" />Reading Books
			<br />
			<input type="checkbox" name="chk3"  value="chess" />Playing Chess
		</td>
	</tr>
	<tr>
		<td align="right">Birth Date : </td>
		<td><input type="date" name="txtBdate"  /></td>
	</tr>
	<tr>
		<td align="right">Email  : </td>
		<td><input type="email" name="txtEmail"  /></td>
	</tr>
	
	<tr>
		<td align="right">Phone Number : </td>
		<td><input type="tel" name="txtPhone"  /></td>
	</tr>
	
	<tr>
		<td align="right">Address : </td>
		<td>
			<textarea name="txtadrs"  rows="5"  cols="30">			
			</textarea>
		</td>
	</tr>
	<tr>
		<td align="right">Location : </td>
		<td>
			<select name="ddlLoc">
				<option value="-1">Select City</option>
				<option value="Hyderabad">Hyderabad</option>
				<option value="Bangalore">Bangalore</option>
				<option value="Chennai">Chennai</option>
				<option value="Pune">Pune</option>
				<option value="Vizag">Vizag</option>
			</select>
		</td>
	</tr>
	
	<tr>
		<td align="right">
			<input type="submit"  value="Register" />
		</td>
		<td>
			<input type="reset"  value="Clear All" />
		</td>
	</tr>
</table>
</form>
</body>
</html>