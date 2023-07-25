

//import jakarta.persistence.Query;
import org.hibernate.*;

import java.io.*;
import java.util.*;
import mypack.Register;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

/**
 * Servlet implementation class ViewServ
 */
public class ViewServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 private SessionFactory factory;
		
		public void init(ServletConfig config) throws ServletException {
			Configuration cfg = new Configuration();
		   cfg.configure("hibernate.cfg.xml");
		   this.factory = cfg.buildSessionFactory();
		}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Session session = factory.openSession();
		Query<?> query=session.createQuery("from Register",Register.class);
		List<?> mylist1=(List<?>) query.list();    //list of objects
		
		System.out.println(mylist1);
		request.setAttribute("list", mylist1);
		RequestDispatcher rd = request.getRequestDispatcher("ViewRegister.jsp");
		rd.forward(request, response);
	}

}
