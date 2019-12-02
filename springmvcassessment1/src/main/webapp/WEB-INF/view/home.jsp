<%@page import="com.ustglobals.springmvcassessment.dto.Product"%>
<%@page import="com.ustglobals.springmvcassessment.dto.Retailer"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%
	Retailer bean = (Retailer) session.getAttribute("bean");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<a href="./changepassword">Change Password</a>&nbsp&nbsp&nbsp&nbsp
	<a href="./logout" style="float: right;">Logout</a>

	<h2 style="color: green"; align="center" >Here we are to help with search  <%= bean.getName()%></h2>
	<fieldset>
	<center>
		<legend>Search Products</legend>
		<form action="./search">
			<table>
				<tr>
					<td>ID:</td>
					<td><input type="number" name="id"></td>
					<td><input type="submit" value="Search"></td>
				</tr>
			</table>
		</form>
		</center>
	</fieldset>
	
	<%
	Product productBean = (Product)request.getAttribute("bean");
	%>
	<% 
	if(productBean!=null)
		{
		%>
		<center>
	<table border="1">
 
		<tr>
			<th>Prodct Id:</th>
			<th>Product Name</th>
			<th>Price per unit</th>
			<th>Quantity</th>
			<th>Amount Payable</th>
		</tr>
		<tr>
			<td><%=productBean.getPid() %></td>
			<td><%=productBean.getPname() %></td>
			<td><%=productBean.getPriceperunit() %></td>
			<td><%=productBean.getQuantity() %></td>
			<td><%=productBean.getAmountpayable() %></td>
	</table>
	</center>
	<%
	}
	%>
	<h3>${msg}</h3>
</body>
</html>