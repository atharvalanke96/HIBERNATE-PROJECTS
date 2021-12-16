package com.Impl;

import java.util.List;
import java.util.Scanner;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.Service.Operations;
import com.config.HibernateUtil;
import com.model.Pojo;

public class Employee implements Operations{

	Scanner sc=new Scanner(System.in);
	Pojo p=new Pojo();
	
	@Override
	public void insertdata() {
		// TODO Auto-generated method stub
		System.out.println("ENTER EMPLOYEE ID");
		p.setEid(sc.nextInt());
		System.out.println("ENTER EMPLOYEE NAME");
		p.setEname(sc.next());
		System.out.println("ENTER EMPLOYEE SALARY");
		p.setEsalary(sc.nextDouble());
		Session session=HibernateUtil.getSessionFactory().openSession();
		session.save(p);
		session.beginTransaction().commit();
		//System.out.println(p);
	}

	@Override
	public void deletedata() {
		// TODO Auto-generated method stub
	
		SessionFactory sf=HibernateUtil.getSessionFactory();
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		System.out.println("SELECT EMPLOYEE ID TO DELETE RECORD:");
		int id=sc.nextInt();
		String hql="delete from Pojo where eid=?";
		Query<Pojo> q=session.createQuery(hql);
		q.setParameter(0, id);
		q.executeUpdate();
		tx.commit();
		
	}

	@Override
	public void retrievedata() {
		// TODO Auto-generated method stub
		SessionFactory sf=HibernateUtil.getSessionFactory();
		Session session=sf.openSession();
		//Transaction tx=session.beginTransaction();
		String hql="from Pojo";
		Query<Pojo> e=session.createQuery(hql);
		List<Pojo>l=e.getResultList();
		for(Pojo emp:l)
		{
			System.out.println(emp.getEid());
			System.out.println(emp.getEname());
			System.out.println(emp.getEsalary());
			
		}
	}

	@Override
	public void updatedata() {
		// TODO Auto-generated method stub
		SessionFactory sf=HibernateUtil.getSessionFactory();
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		String hql="update Pojo set ename=?, esalary=? where eid=?";
		Query<Pojo> q=session.createQuery(hql);
		System.out.println("ENTER EMPLOYEE ID:");
		int id=sc.nextInt();
		System.out.println("ENTER NEW NAME:");
		String nm=sc.next();
		System.out.println("ENTER NEW SALARY:");
		double sal=sc.nextDouble();
		q.setParameter(0, nm);
		q.setParameter(1, sal);
		q.setParameter(2, id);
		
		q.executeUpdate();
		tx.commit();
		
		//String hql="insert into Employee (eid,ename,esalary) select eid,ename, esalary from Pojo";
	}

}
