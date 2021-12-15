package com.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Configuration cfg=new Configuration();
		cfg.configure("com/config/hibernate.cfg.xml");
		
		SessionFactory sf=cfg.buildSessionFactory();
		
		Session session=sf.openSession();
	
		
		//Student st=new Student();
		//st.setRollno(789);
		/*st.setName("ATHARVA");
		st.setMobno("565656565");*/
		
		Transaction tx=session.beginTransaction();
		
		Student st=session.get(Student.class,963);
		System.out.println(st.getRollno());
		System.out.println(st.getName());
		System.out.println(st.getMobno());
		//tx.commit();
		System.out.println(st);
		//System.out.println("data updated successfully");
	}

}
