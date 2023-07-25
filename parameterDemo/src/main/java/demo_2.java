

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class demo_2
 */
public class demo_2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try
		{
			response.setContentType("text/html");
			PrintWriter pw=response.getWriter();
String value=getServletConfig().getInitParameter("file");    //init or congif parameters
			pw.println(value);
String value1=getServletContext().getInitParameter("driver");  //context parameters
			pw.println("<br>"+value1);
		}
		catch(Exception ee)
		{
			ee.printStackTrace();
		}

	}

}
