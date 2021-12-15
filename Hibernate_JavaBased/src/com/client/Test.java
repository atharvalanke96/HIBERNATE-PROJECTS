package com.client;

import org.hibernate.Session;

import com.Impl.Student;
import com.config.HibernateUtil;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Session session=HibernateUtil.getSessionFactory().openSession();
		Student s=new Student();
		s.setId(1);
		s.setName("ATHARVA");
		session.save(s);
		session.beginTransaction().commit();
		System.out.println(s);
	}

}
