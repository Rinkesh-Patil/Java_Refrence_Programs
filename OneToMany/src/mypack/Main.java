package mypack;
import org.hibernate.cfg.Configuration;
import java.util.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Configuration cfg=new Configuration();		
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		
        try { 
        	Transaction transaction=session.beginTransaction();
           Student s1=new Student();
           Phone p1=new Phone();
           p1.setPhoneNumber("923456789");
           p1.setPhoneType("mobile");
           Phone p2=new Phone();
           p2.setPhoneNumber("2654321");
           p2.setPhoneType("resd");
           Set<Phone> h=new HashSet<Phone>();
           h.add(p1);
           h.add(p2);
           s1.setStudentName("abc");
           s1.setStudentPhoneNumbers(h);
           session.persist(s1);
           transaction.commit(); 
            System.out.println("done with student");  
            System.out.println("enter number : ");
            new Scanner(System.in).nextInt();
            transaction=session.beginTransaction();
            session.remove(s1);
            transaction.commit();
            System.out.println("done completely");


             }
        catch(Exception ee)
        {
        	System.out.println("in catch\t"+ee);
        }
}
}