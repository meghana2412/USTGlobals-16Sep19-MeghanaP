<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<fieldset>
		<a href="./home">Home</a> 
		<a href=".logout" style="float: right">Logout</a>

		<center>
			<legend>Change Password</legend>
			<form action="./changepassword" method="post">
				<table>
					<tr>
						<td>Old Password:</td>
						<td><input type="password" name="password" placeholder="new password"></td>
					</tr>
					<tr>
						<td>New Password:</td>
						<td><input type="password" name="confirmpassword" placeholder="confirm password"></td>
					</tr>
					<tr>

						<td><input type="submit" value="Change"></td>
					</tr>


				</table>
			</form>
		</center>
	</fieldset>
</body>
</html>