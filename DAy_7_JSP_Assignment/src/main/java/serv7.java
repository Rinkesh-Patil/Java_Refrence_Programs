

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class serv7
 */
public class serv7 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String name = (String) request.getParameter("username");
    String pass = (String) request.getParameter("pass");
    
    if(name.equals("sccot") && pass.equals("tiger")) {
    	Cookie c  = new Cookie("tiger","sccot");
    	response.addCookie(c);
    	 RequestDispatcher dispatcher = request.getRequestDispatcher("welcome.jsp");
	        dispatcher.forward(request, response);
    }
    else {
		  RequestDispatcher dispatcher = request.getRequestDispatcher("day7JSP.jsp");
		
		  dispatcher.forward(request, response);
		    }

	}

}
