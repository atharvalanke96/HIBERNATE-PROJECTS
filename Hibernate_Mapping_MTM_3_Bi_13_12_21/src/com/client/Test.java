package com.client;



import org.hibernate.Session;

import com.Pojo.Employee;
import com.Pojo.Project;
import com.config.HibernateUtil;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Session session = HibernateUtil.getSessionFactory().openSession();
		
		Employee e1=new Employee();
		e1.setEid(1);
		e1.setEname("ATHARVA");
		
		Employee e2=new Employee();
		e2.setEid(2);
		e2.setEname("YOGESH");
		
		Project p1=new Project();
		p1.setPid(1234);
		p1.setPname("JAVA DEVELOPMENT");
		
		Project p2=new Project();
		p2.setPid(4567);
		p2.setPname("PYTHON DEVELOPMENT");
		
		e1.getP().add(p1);
		e1.getP().add(p2);
		
		e2.getP().add(p1);
		e2.getP().add(p2);
		
		p1.getE().add(e1);
		
		p2.getE().add(e2);
		
		session.save(p1);
		session.save(p2);
		session.save(e1);
		session.save(e2);
		
		session.beginTransaction().commit();
	}

}
