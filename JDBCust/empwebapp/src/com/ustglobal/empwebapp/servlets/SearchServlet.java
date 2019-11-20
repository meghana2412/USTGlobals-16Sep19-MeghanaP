package com.ustglobal.empwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ustglobal.empwebapp.dao.EmployeeDAO;
import com.ustglobal.empwebapp.dto.EmployeeInfo;
import com.ustglobal.empwebapp.util.EmployeeDAOManger;

@WebServlet("/search")
public class SearchServlet extends HttpServlet{
	@Override

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession(false);//checks weather session is present or not
		
		if(session == null) {
			RequestDispatcher dispatcher = req.getRequestDispatcher("/login.jsp");
			dispatcher.forward(req, resp);
		}
		else {
			int id = Integer.parseInt(req.getParameter("id"));
			EmployeeDAO dao = EmployeeDAOManger.getEmployeeDAO();
			EmployeeInfo info = dao.searchEmployee(id);
			
			req.setAttribute("info", info);
			RequestDispatcher dispatcher = req.getRequestDispatcher("/search.jsp");
			dispatcher.forward(req, resp);
			
		/*
		 * PrintWriter out = resp.getWriter(); out.println("<html>");
		 * out.println("<body>");
		 * 
		 * out.println("<center>");
		 * out.println("<fieldset style='width:50%;height:200px'>");
		 * out.println("<h1 style='text-align: center'>Employee details</h1>");
		 * out.println("<a href = './home' style='float:left'>Home</a>");
		 * out.println("<a href = './logout' style='float:right'>Logout</a>");
		 * 
		 * out.println("<table align='center' cellspacing='2' border='1'>");
		 * if(info!=null) { out.println("<tr>"); out.println("<th> ID </th>");
		 * out.println("<th>Name</th>"); out.println("<th>Email</th>");
		 * 
		 * out.println("</tr>");
		 * 
		 * out.println("<tr>"); out.println("<td> "+ info.getId()+"</td>");
		 * out.println("<th>"+ info.getName() +"</td>"); out.println("<td>"+
		 * info.getEmail() +"</td>"); out.println("</tr>");
		 * 
		 * out.println("</table>"); } else { out.println("<h2>No data found</h2>"); }
		 * out.println("</fieldset>"); out.println("</center>");
		 * 
		 * out.println("</body>"); out.println("</html>");
		 * 
		 */

	}
}
}
