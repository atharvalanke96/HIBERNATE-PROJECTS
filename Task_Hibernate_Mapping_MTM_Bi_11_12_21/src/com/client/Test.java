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
		
		/*session.save(sf1);
		session.save(sf2);*/
		session.get(Student.class, s1.getSid());
		for(Student st:stud)
		{
			System.out.println(st.getSid());
			System.out.println(st.getSname());
			System.out.println(st.getCj().getCid());
			System.out.println(st.getCj().getCaddress());
		}
		session.beginTransaction().commit();
	}

}
