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
	<center>
		<legend>Register</legend>
		<form action="./register" method="post">
			<table>
				<tr>
					<td>Name:</td>
					<td><input type="text" name="name"></td>
				</tr>
				<tr>
					<td>email:</td>
					<td><input type="email" name="email"></td>
				</tr>
				<tr>
					<td>Password:</td>
					<td><input type="password" name="password"></td>
				</tr>
				
				<tr>
					<td><input type="reset" value="Reset"></td>
					<td><input type="submit" value="Register"></td>
				</tr>

			</table>
		</form>
			<a href="./login"> Click here to Login</a>
		
		</center>
	</fieldset>
	
</body>
</html>