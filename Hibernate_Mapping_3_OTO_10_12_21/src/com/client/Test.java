package com.client;

import org.hibernate.Session;

import com.Pojo.Employee;
import com.Pojo.Aadharcard;
import com.config.HibernateUtil;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Session session=HibernateUtil.getSessionFactory().openSession();
		
		Aadharcard ac=new Aadharcard();
		ac.setaid(5678);
		ac.setaname("OLD CARD");
		
		Employee emp=new Employee();
		emp.setEmpid(4218);
		emp.setEmpname("ATHARVA");
		emp.setac(ac);
		ac.setE(emp);
		
		session.save(emp);
		session.beginTransaction().commit();
		session.close();
	}

}
