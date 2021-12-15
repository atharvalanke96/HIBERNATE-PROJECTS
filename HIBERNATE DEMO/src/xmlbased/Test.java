package xmlbased;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory sf=cfg.buildSessionFactory();
		
		Session s=sf.openSession();
		
		User u=new User();
		u.setId(2);
		u.setName("DEF");
		
		Transaction tx=s.beginTransaction();
		
		s.save(u);
		tx.commit();
		
		System.out.println("data saved successfully");
	}

}
