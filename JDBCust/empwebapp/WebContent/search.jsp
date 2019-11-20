<%@page import="com.ustglobal.empwebapp.dto.EmployeeInfo"%>
<%@page import="com.ustglobal.empwebapp.dao.EmployeeDAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<%
	EmployeeInfo info = (EmployeeInfo)request.getAttribute("info");
%>
<body>
	<a href='./home' style='float: left'>Home</a>
	<a href='./logout' style='float: right'>Logout</a>
	<%if(info!=null){ %>
	<fieldset>
		<legend>Employee info</legend>
		<table align="center">
			<tr>
				<th>Id</th>
				<th>Name</th>
				<th>Email</th>
			</tr>
			<tr>
				<td><%=info.getId() %></td>
				<td><%=info.getName() %></td>
				<td><%=info.getEmail() %></td>
			</tr>
		</table>
	</fieldset>
	<%}else{ %>
	<h1>No data Found</h1>
	<%} %>
</body>
</html>