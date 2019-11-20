package com.ustglobal.empwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login.html")
public class LoginPageServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();

		String id = "";
		Cookie[] cookies = req.getCookies();
		if(cookies!=null) {
		for (Cookie cookie : cookies) {
			if(cookie.getName().equals("alwaysRem"))
			{
				id= cookie.getValue();
			}
		}
		}
		out.println("<html>");
		out.println("<body>");
		out.println(" <center>");
		out.println("<fieldset style='width:50%'>");
		out.println("<form action='./login' method='post'>");
		out.println("<center>");
		out.println("<h1>Login</h1>");
		out.println("</center>");
		out.println("<table align='center' cellpadding='15' >");
		out.println("<tr><td>Enter ID</td><td><input name='id' type='number' value='"+id+"' required></td></tr>");
		out.println("<tr><td>Enter Password</td><td><input name='password' type='text' required></td></tr>");
		out.println("<tr ><td align='center' colspan='2'><input type='checkbox' name='rememberme' value='check'>Remember me</td></tr>");
		out.println("<tr><td style='float:right'><input type='submit' style='background-color:green;color:white;width:90px;height:30px;'></td>");
		out.println("<td><input type='reset' style='background-color:green;color:white;width:90px;height:30px;'></td></tr>");
		out.print("<tr><td colspan='2' align='center'><a href='register.html' style='color:blue;'> Click  here to register</a></td></tr>");
		out.println("</table>");
		out.println("</form>");
		out.println("</fieldset>");
		out.println("</center>");
		out.println("</body>");

		out.println("</html>");
	}
	
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// TODO Auto-generated method stub
	doGet(req, resp);
}
}

