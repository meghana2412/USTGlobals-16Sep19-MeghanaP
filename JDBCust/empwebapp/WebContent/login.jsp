<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@page session="false" %>
<!DOCTYPE html>
<html>
<head>

<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<jsp:useBean id="msg" class="java.lang.String" scope="request"></jsp:useBean>
<%
	String id = "";
	Cookie[] cookies = request.getCookies();
	if (cookies != null) {
		for (Cookie cookie : cookies) {
			if (cookie.getName().equals("alwaysRem")) {
				id = cookie.getValue();
			}
		}
	}
%>
<body>


	<center>
		<fieldset style='width: 50%'>
			<form action='./login' method='post'>
				<center>
					<h1>Login</h1>
				</center>
				<h1><%=msg %></h1>
				<table align='center' cellpadding='15'>
					<tr>
						<td>Enter ID</td>
						<td><input name='id' type='number' value='<%=id%>' required></td>
					</tr>
					<tr>
						<td>Enter Password</td>
						<td><input name='password' type='text' required></td>
					</tr>
					<tr>
						<td align='center' colspan='2'><input type='checkbox'
							name='rememberme' value='check'>Remember me</td>
					</tr>
					<tr>
						<td style='float: right'><input type='submit'
							style='background-color: green; color: white; width: 90px; height: 30px;'></td>
						<td><input type='reset'
							style='background-color: green; color: white; width: 90px; height: 30px;'></td>
					</tr>
					<tr>
						<td colspan='2' align='center'><a href='register.html'
							style='color: blue;'> Click here to register</a></td>
					</tr>
				</table>
			</form>
		</fieldset>
	</center>
</body>

</html>

