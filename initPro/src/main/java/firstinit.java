

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class firstinit
 */
public class firstinit extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
//	public void init()
//	{
//		System.out.println("inside init() method");
//	}
	private ServletConfig conf;
	public void init(ServletConfig conf)throws ServletException
	{
		this.conf=conf;
		System.out.println("inside init(ServletConfig conf) method");
	}
	



	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw=response.getWriter();
		pw.println("Without overriding init");
		pw.println("Config parameter value  "+conf.getInitParameter("user")+"<br>");
		pw.println("Context parameter value   "+conf.getServletContext().getInitParameter("database"));
		pw.println("</body></html>");
	}

}
