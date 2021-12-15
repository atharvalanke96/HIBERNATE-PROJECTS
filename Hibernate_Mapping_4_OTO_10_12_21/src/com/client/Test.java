package com.client;

import org.hibernate.Session;

import com.Pojo.Employee;
import com.Pojo.Project;
import com.config.HibernateUtil;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Session session=HibernateUtil.getSessionFactory().openSession();
		
		Project pg=new Project();
		pg.setaid(5120);
		pg.setaname("COLLECTION FRAMEWORK PROJECT");
		
		Employee emp=new Employee();
		emp.setEmpid(4218);
		emp.setEmpname("ATHARVA");
		emp.setPg(pg);
		pg.setE(emp);
		
		session.save(emp);
		session.beginTransaction().commit();
		session.close();
	}

}
