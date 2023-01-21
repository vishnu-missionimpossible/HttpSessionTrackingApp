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
@WebServlet("/test2")
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//collecting the data from form_2
		String qualification = request.getParameter("qual");
		String designation = request.getParameter("design");
		
		//create a session object and store these request parameters in that session object.
		HttpSession session=request.getSession();
		session.setAttribute("qualification",qualification);
		session.setAttribute("designation", designation);
		
		
		//forward the response to form_3.html
		RequestDispatcher rd = request.getRequestDispatcher("/form3.html");
		rd.forward(request, response);
	}

}
