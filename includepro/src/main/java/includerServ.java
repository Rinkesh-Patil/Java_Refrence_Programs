

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class includerServ
 */
public class includerServ extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try
		{

			PrintWriter pw=response.getWriter();
			pw.println("<b>this is a main servlet</b><br>");
			RequestDispatcher rd=request.getRequestDispatcher("includedServ");
			rd.include(request,response);
			pw.println("<b>coming back to main servlet</b>");
			
		}
		catch(Exception ee)
		{
			System.out.println(ee);
		}
	
	}

}
