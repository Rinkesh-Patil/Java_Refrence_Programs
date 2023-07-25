

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.*;


import mypack.Register;


/**
 * Servlet implementation class RegisterServ
 */
public class RegisterServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
   private SessionFactory factory;
	
	public void init(ServletConfig config) throws ServletException {
		Configuration cfg = new Configuration();
	   cfg.configure("hibernate.cfg.xml");
	   this.factory = cfg.buildSessionFactory();
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	 Session session = factory.openSession();
	Transaction tr = session.beginTransaction();
	response.setContentType("text/html");
	PrintWriter out = response.getWriter();
     String name = request.getParameter("name");
     String address = request.getParameter("address");
     String email = request.getParameter("email");
     String login = request.getParameter("login");
     String password = request.getParameter("password");
	Register r1 = new Register();
	r1.setName(name);
	r1.setEmailId(email);
	r1.setAddress(address);
	r1.setLogin(login);
	r1.setPassword(password);
	session.persist(r1);
	tr.commit();
	out.println("Values Inserted !1");
	session.close();	
	}

}
