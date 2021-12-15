package com.client;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;

import com.Entity.Department;
import com.Entity.Employee;
import com.config.HibernateUtil;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session=HibernateUtil.getSessionFactory().openSession();

		
		
		Employee e1=new Employee();
		e1.setEmpid(1234);
		e1.setEmpname("YOGESH");
		
		Employee e2=new Employee();
		e2.setEmpid(4567);
		e2.setEmpname("NITISH");
		
		
		Department d=new Department();
		d.setDid(2);
		d.setDname("MECHANICAL");
		
		
		
		e1.setDept(d);
		e2.setDept(d);
		
		Set<Employee> empl=new HashSet<>();
		empl.add(e1);
		empl.add(e2);
		
		d.setEmpl(empl);
		
		session.save(d);
		//session.save(e2);    
		session.beginTransaction().commit();
		
		session.get(Employee.class,4567);
		for(Employee emp:empl)
		{
			System.out.println(emp.getEmpid());
			System.out.println(emp.getEmpname());
		}
		
		
		
	}

}
