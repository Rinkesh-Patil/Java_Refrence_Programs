package mypack;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.*;
import java.util.*;

public class Main_1
{
	public static void main(String[] args) 
	{

	Configuration cfg=new Configuration();		
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		Transaction tr=session.beginTransaction();
		Product p=new Product();
		p.setName("soap");
		p.setPrice(100);
		p.setQty(30);
		session.persist(p);
		tr.commit();
		session.close();
		Session session1=factory.openSession();  
		Product emp2=(Product)session1.get(Product.class,1);  
		   
		System.out.println(emp2);
		session1.close();  
		    
        System.out.println(factory.getStatistics().getSecondLevelCacheHitCount()); //Prints 0
		      
	    Session session2=factory.openSession();  
		Product emp3=(Product)session2.get(Product.class,1);  
		
		System.out.println(emp3);
		   // session2.close();  
		    
        System.out.println(factory.getStatistics().getSecondLevelCacheHitCount()); //Prints 1
            
        Product emp4=(Product)session2.get(Product.class,1);  
			
		System.out.println(emp4);
		// session2.close();  
		    
		//still prints 1 because , this time we got it from first level cache.
        System.out.println(factory.getStatistics().getSecondLevelCacheHitCount()); 

	}
}