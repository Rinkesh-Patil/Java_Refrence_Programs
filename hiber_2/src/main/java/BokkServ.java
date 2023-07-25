
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.*; 
import mypack.Book;

/**
 * Servlet implementation class BokkServ
 */
public class BokkServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private SessionFactory factory;

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		this.factory =cfg.buildSessionFactory();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try
		{
			Session session=factory.openSession();
			Transaction tr=session.beginTransaction();
			System.out.println("after change");
			response.setContentType("text/html");
			PrintWriter out=response.getWriter();
			String name=request.getParameter("name");
			String subject=request.getParameter("subject");
			int cost=Integer.parseInt(request.getParameter("cost").trim());
			Book b1=new Book();
			b1.setName(name);
			b1.setSubject(subject);
			b1.setCost(cost);
			session.persist(b1);
			tr.commit();
			session.close();
			out.println("Done with book");
		}
		catch(Exception ee)
		{
			System.out.println("in service  "+ee);
		}

	}

}
