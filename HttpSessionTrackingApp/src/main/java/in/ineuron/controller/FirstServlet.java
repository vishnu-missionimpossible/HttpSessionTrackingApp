package in.ineuron.controller;

import java.io.IOException;

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
@WebServlet("/test1")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//collecting the data from form_1
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		
		//create a session object and store these request paramters in that session object.
		HttpSession session=request.getSession();
		session.setAttribute("name",name);
		session.setAttribute("age", age);
		
		
		//forward the response to form_2.html
		RequestDispatcher rd = request.getRequestDispatcher("/form2.html");
		rd.forward(request, response);
	}

}
