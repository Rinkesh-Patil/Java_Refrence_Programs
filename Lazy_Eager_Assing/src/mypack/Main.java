package mypack;
import java.util.*;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tr = session.beginTransaction();
		Book b1 = new Book();
		Author a1 = new Author();
		a1.setName("bahinabai");
		a1.setAddress("Khandesh");
		Author a2 = new Author();
		a1.setName("kavikesh");
		a1.setAddress("mumbai");
		Set<Author> s = new HashSet<Author>();
		s.add(a1);
		s.add(a2);
		b1.setTitle("Khandeshiii");
		b1.setCost(300);
		b1.setAuthors(s);
		session.persist(b1);
		tr.commit();
		session.close();
        session=factory.openSession();
        Book ref=(Book)session.get(Book.class,1);
        session.close();       
        System.out.println(ref.getTitle());
        System.out.println(ref.getCost());
        System.out.println(ref.getAuthors());
         System.out.println("done with student");  
	
	}

}
