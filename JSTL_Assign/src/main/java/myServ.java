

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import mypack.person;
import java.util.*;

/**
 * Servlet implementation class myServ
 */
public class myServ extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		person p1 = new person();
		p1.setName("abc");
		p1.setAge(20);
		person p2 = new person();
		p2.setName("xyz");
		p2.setAge(25);
		
		List<person>personlist=new ArrayList<person>();
		personlist.add(p1);
		personlist.add(p2);
		request.setAttribute("mylist", personlist);
		 RequestDispatcher dispatcher = request.getRequestDispatcher("my.jsp");
	        dispatcher.forward(request, response);
	}

}
