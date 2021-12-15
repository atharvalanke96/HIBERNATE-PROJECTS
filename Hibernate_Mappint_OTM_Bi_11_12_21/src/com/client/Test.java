package com.client;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;

import com.Entity.Student;
import com.Entity.Teacher;
import com.config.HibernateUtil;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Session session=HibernateUtil.getSessionFactory().openSession();
		
		Student s1=new Student();
		s1.setSid(789);
		s1.setSname("YOGESH");
		
		Student s2=new Student();
		s2.setSid(741);
		s2.setSname("NITISH");
		
		Set<Student> st=new HashSet<>();
		st.add(s1);
		st.add(s2);
		
		Teacher t=new Teacher();
		t.setTid(102);
		t.setTname("PN");
		t.setStud(st);
		
		s1.setTea(t);
		s2.setTea(t);
		
		session.save(s1);
		session.save(s2);
		session.beginTransaction().commit();
		
	}

}
