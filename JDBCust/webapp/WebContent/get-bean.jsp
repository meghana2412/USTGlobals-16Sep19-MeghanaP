<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<jsp:useBean id="obj" class="com.ustglobals.webapp.servlets.Employee" scope="request"/>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1><%=obj.getId() %></h1>
<h1><%=obj.getName() %></h1>
</body>
</html>