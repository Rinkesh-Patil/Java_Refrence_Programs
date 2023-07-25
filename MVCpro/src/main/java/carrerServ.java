

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import pack.CarrerExpert;

import java.io.IOException;

/**
 * Servlet implementation class carrerServ
 */
public class carrerServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
	CarrerExpert c1 ;
	String exp = "";
	
	public void init(ServletConfig config) throws ServletException {
		c1 = new CarrerExpert();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String qual = request.getParameter("qualif");
		 exp = c1.giveAdvice(qual);
		request.setAttribute("ans", exp);
		RequestDispatcher rd = request.getRequestDispatcher("finalAns.jsp");
		rd.forward(request, response);
	}

}
;