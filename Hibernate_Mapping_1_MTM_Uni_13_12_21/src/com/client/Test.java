package com.client;

import org.hibernate.Session;

import com.Pojo.Course;
import com.Pojo.Student;
import com.config.HibernateUtil;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Session session=HibernateUtil.getSessionFactory().openSession();
		
		Student s1=new Student();
		s1.setSid(1);
		s1.setSname("ATHARVA");
		
		Student s2=new Student();
		s2.setSid(2);
		s2.setSname("YOGESH");
		
		Course c1=new Course();
		c1.setCid(139);
		c1.setCname("JAVA");
		
		Course c2=new Course();
		c2.setCid(140);
		c2.setCname("PYTHON");
		
		s1.getC().add(c1);
		s1.getC().add(c2);
		s2.getC().add(c1);
		
		session.save(s1);
		session.save(s2);
		
		
		session.beginTransaction().commit();
 	}

}
