package mypack;

import org.hibernate.cfg.*;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Configuration cgf = new Configuration();
      cgf.configure("hibernate.cfg.xml");
      SessionFactory factory = cgf.buildSessionFactory();
      Session session = factory.openSession();
      Transaction tr = session.beginTransaction();
	   Student s1 = new Student();
	  // s1.setRollno(1);
	   s1.setName("rudra");
	   s1.setAge(24);
	   s1.setAddress("dhule");
	   Student s2 = new Student();
	  // s2.setRollno(2);
	   s2.setName("vinod");
	   s2.setAge(27);
	   s2.setAddress("dhule");
//	   Student s3 = new Student();
//	  // s2.setRollno(2);
//	   s2.setName("");
//	   s2.setAge(27);
//	   s2.setAddress("dhule");
	 session.persist(s1);
	 session.persist(s2);
	 tr.commit();
	 System.out.println("Done with student");
	}

}
