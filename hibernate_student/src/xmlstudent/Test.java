package xmlstudent;

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
		
		Student st=new Student();
		st.setRollno(419);
		st.setName("ATHARVA");
		st.setSubj("JAVA");
		
		Transaction tx=s.beginTransaction();
		s.save(st);
		tx.commit();
		
		System.out.println("DATA ADDED IN DB SUCCESSFULLY");
		
	}

}
