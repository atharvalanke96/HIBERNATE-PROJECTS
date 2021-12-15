package xmlemployee;

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
		
		Employee e=new Employee();
		e.setEmpid(1234);
		e.setEmpname("ATHARVA");
		
		Transaction tx=s.beginTransaction();
		
		s.save(e);
		tx.commit();
		
		System.out.println("data saved on db");
	}

}
