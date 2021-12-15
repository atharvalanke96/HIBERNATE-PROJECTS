package com.client;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;

import com.Pojo.Cjc;
import com.Pojo.Staff;
import com.Pojo.Student;
import com.config.HibernateUtil;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSessionFactory().openSession();

		Student s1=new Student();
		s1.setSid(1);
		s1.setSname("ATHARVA");
		
		Student s2=new Student();
		s2.setSid(2);
		s2.setSname("YOGESH");
		
		Set<Student> stud=new HashSet<>();
		stud.add(s1);
		stud.add(s2);
		
		Staff sf1=new Staff();
		sf1.setSfid(4);
		sf1.setSfname("AKSHAY");
		
		Staff sf2=new Staff();
		sf2.setSfid(5);
		sf2.setSfname("PRATIK");
		
		Set<Staff> stf=new HashSet<>();
		stf.add(sf1);
		stf.add(sf2);
		
		Cjc cj=new Cjc();
		cj.setCid(789);
		cj.setCaddress("NAGPUR");
		cj.setStu(stud);
		cj.setStf(stf);
		
		s1.setCj(cj);
		s2.setCj(cj);
		
		sf1.setCj(cj);
		sf2.setCj(cj);
		
		s1.getStf().add(sf1);
		s1.getStf().add(sf2);
		s2.getStf().add(sf1);
		s2.getStf().add(sf2);
		
		sf1.getStu().add(s1);
		sf1.getStu().add(s2);
		sf2.getStu().add(s1);
		sf2.getStu().add(s2);
		
		session.save(cj);
		session.save(sf1);
		session.save(sf2);
		session.save(s1);
		session.save(s2);
		
		Cjc cjc=session.get(Cjc.class,cj.getCid());
		System.out.println(cjc.getCid());
		System.out.println(cjc.getCaddress());
		
		for(Student stude:cjc.getStu())
		{
			System.out.println(stude.getSid());
			System.out.println(stude.getSname());
		}
		for(Staff staf:cjc.getStf())
		{
			System.out.println(staf.getSfid());
			System.out.println(staf.getSfname());
		}
		session.beginTransaction().commit();
	}

}
