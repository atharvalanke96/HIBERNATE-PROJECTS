	package com.serviceImpl;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.model.Details;
import com.service.Operations;

public class Employee implements Operations{
	
	Scanner sc=new Scanner(System.in);
	Details d=new Details();
	Session session;
	Transaction tx;
	
	
	public void connection()
	{
		Configuration cfg=new Configuration();
		cfg.configure("com/config/hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		session=sf.openSession();
		tx=session.beginTransaction();
	}

	@Override
	public void insertdata() {
		 connection();
	
		
	System.out.println("ENTER EMPLOYEE ID");
	d.setEid(sc.nextInt());
	System.out.println("ENTER EMPLOYEE NAME");
	d.setEname(sc.next());
	System.out.println("ENTER EMPLOYEE MOBNO");
	d.setEmobno(sc.next());
	System.out.println("ENTER EMPLOYEE SALARY");
	d.setEsalary(sc.nextDouble());
	session.save(d);
	tx.commit();
	}

	@Override
	public void updatedata() {
		connection();
	System.out.println("ENTER EMPLOYEE ID");	
	int i=sc.nextInt();
	Details d=session.get(Details.class, i)	;
	System.out.println("ENTER EMPLOYEE NEW NAME");
	d.setEname(sc.next());
	System.out.println("ENTER EMPLOYEE NEW SALARY");
	d.setEsalary(sc.nextDouble());
	session.update(d);
	tx.commit();
		
	}

	@Override
	public void deletedata() {
		connection();
		System.out.println("ENTER EMPLOYEE ID");
		d.setEid(sc.nextInt());
		session.delete(d);
		tx.commit();
		
	}

	@Override
	public void retrievedata() {
		connection();
		System.out.println("ENTER EMPLOYEE ID");
		int i=sc.nextInt();
		Details d=session.get(Details.class,i);
		System.out.println(d.getEid());
		System.out.println(d.getEname());
		System.out.println(d.getEmobno());
		System.out.println(d.getEsalary());
		//System.out.println(d);
		tx.commit();
		
	}

}
