package mypack;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main 
{

	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();		
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		
        try { 
        	Transaction transaction=session.beginTransaction();
            Employee e1=new Employee();
           
            e1.setName("abc");
            e1.setSalary(30000);
            
            Employee e2=new Employee();
           
            e2.setName("xyz");
            e2.setSalary(40000);
            
            Set<Employee> employees=new HashSet<Employee>();
            employees.add(e1);
            employees.add(e2);
            Company c1=new Company();
            c1.setName("3I");
            c1.setLocation("Vashi");
            c1.setEmployees(employees);
           
            session.persist(c1);
            transaction.commit(); 
            System.out.println("done with employees");  
             }
        catch(Exception ee)
        {
        	System.out.println("in catch\t"+ee);
        }
}
}








