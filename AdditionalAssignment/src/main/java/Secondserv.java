

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Servlet implementation class Secondserv
 */
public class Secondserv extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		List<String> mylist = new ArrayList<String>();
		
		String[] str = request.getParameterValues("ch");
		mylist = Arrays.asList(str);
		HttpSession session = request.getSession(true);
		session.setAttribute("products", mylist);
		PrintWriter pw = response.getWriter();
		response.setContentType("text/html");
		pw.print("<a href='Bill.jsp'>View cart</a>");
//       RequestDispatcher rd = request.getRequestDispatcher("Bill.jsp");
//       rd.forward(request, response);
		
	}

}
