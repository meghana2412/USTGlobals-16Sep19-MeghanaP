<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<<jsp:useBean id="info" class="com.ustglobal.empwebapp.dto.EmployeeInfo" scope="session"></jsp:useBean>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Welcome</h1>

	<h1 style='text-align: center'>HOME PAGE</h1>
	<center>
		<fieldset style="""width:50%\">

			<h2 style='color: purple'>Welcome  <%=info.getName() %> </h2>

			<table cellspacing='15'>
				<tr>

					<td><a href='./search.html' style='color: green'>SEARCH</a></td>
					<td><a href='./changepassword.jsp'>CHANGE PASSWORD</a></td>
					<td><a href='./logout'>LOGOUT</a></td>

					</fieldset>
					<center>
</body>
</html>