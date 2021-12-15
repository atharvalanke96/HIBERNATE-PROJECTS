package com.client;

import org.hibernate.Session;

import com.Pojo.Employee;
import com.Pojo.Laptop;
import com.config.HibernateUtil;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Session session=HibernateUtil.getSessionFactory().openSession();
		
		Laptop lp=new Laptop();
		lp.setlid(2);
		lp.setLname("DELL");
		
		Employee emp=new Employee();
		emp.setEmpid(4219);
		emp.setEmpname("JAID");
		emp.setLp(lp);
		lp.setE(emp);
		
		session.save(emp);
		session.beginTransaction().commit();
	}

}
