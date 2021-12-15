package com.client;

import org.hibernate.Session;


import com.Pojo.Staff;
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
		
		Staff sf1=new Staff();
		sf1.setSfid(139);
		sf1.setSfname("AKSHAY");
		
		Staff sf2=new Staff();
		sf2.setSfid(140);
		sf2.setSfname("PRATIK");
		
		s1.getStf().add(sf1);
		s1.getStf().add(sf2);
		s2.getStf().add(sf1);
		
		sf1.getSt().add(s1);
		sf1.getSt().add(s2);
		sf2.getSt().add(s1);
		
		session.save(sf1);
		session.save(sf2);
		
		session.beginTransaction().commit();
	}

}
