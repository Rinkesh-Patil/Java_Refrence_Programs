package DAOpack;

import java.util.List;

import org.hibernate.query.*;

import business.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmployeeDAODatabaseImpl implements EmployeeDAO 
{
	private SessionFactory sf;
	private Session session;
	Configuration cfg;
	
	public EmployeeDAODatabaseImpl()
	{
	   cfg=new Configuration();		
		cfg.configure("hibernate.cfg.xml");
		sf=cfg.buildSessionFactory();
	    session=sf.openSession();
		Transaction tr=session.beginTransaction();

	}
	@Override
	public void insertEmployee(Employee ref) 
	{
		   session=sf.openSession();
		   Transaction trans=session.beginTransaction();
		   session.persist(ref);
		   trans.commit();
		   session.close();
		   System.out.println("Done with commit");
		
		
	}

	@Override
	public Employee getEmployee() 
	{
		session=sf.openSession();
		Query<?> qry=session.createQuery("from Employee",Employee.class);
		List<?> mylist=qry.list();
		Employee ref=(Employee) mylist.get(0);
		session.close();
		return ref;
	}

}








