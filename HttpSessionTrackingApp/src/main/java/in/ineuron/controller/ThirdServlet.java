package in.ineuron.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class FirstServlet
 */
@WebServlet("/test3")
public class ThirdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//collecting the data from form_2
		String email = request.getParameter("mail");
		String mobile = request.getParameter("mobile");
		
		//create a session object and store these request parameters in that session object.
		HttpSession session=request.getSession();
		session.setAttribute("email",email);
		session.setAttribute("mobile", mobile);
		
		//retrive the data from session object
		Object name = session.getAttribute("name");
		Object age = session.getAttribute("age");
		Object qualification = session.getAttribute("qualification");
		Object designation = session.getAttribute("designation");
		Object gmail = session.getAttribute("email");
		Object umobile = session.getAttribute("mobile");
		
		//create a html page from session object and then send the response.
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.println("<center>");
		out.println("<table border='1' bgcolor='cyan'>");
		out.println("<tr><th>NAME: </th><td>"+name+"</td></tr>");
		out.println("<tr><th>AGE: </th><td>"+age+"</td></tr>");
		out.println("<tr><th>QUALIFICATION: </th><td>"+qualification+"</td></tr>");
		out.println("<tr><th>DESIGNATION: </th><td>"+designation+"</td></tr>");
		out.println("<tr><th>EMAIL: </th><td>"+gmail+"</td></tr>");
		out.println("<tr><th>MOBILE: </th><td>"+umobile+"</td></tr>");
		out.println("</table>");
		out.println("</center>");
		
		out.close();
		
	}

}
