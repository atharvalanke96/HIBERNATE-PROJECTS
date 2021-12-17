package com.Impl;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.Operations.Operations;
import com.Pojo.Pojo;
import com.config.HibernateUtil;

public class Student implements Operations{
	Scanner sc=new Scanner(System.in);
	Pojo p=new Pojo();

	@Override
	public void insertdata() {
	
		// TODO Auto-generated method stub
		System.out.println("ENTER STUDENT ID:");
		p.setSid(sc.nextInt());
		System.out.println("ENTER STUDENT NAME:");
		p.setSname(sc.next());
		SessionFactory sf=HibernateUtil.getSessionFactory();
		Session session=sf.openSession();
		session.save(p);
		session.beginTransaction().commit();
		
	}

	@Override
	public void deletedata() {
		// TODO Auto-generated method stub
		
		SessionFactory sf=HibernateUtil.getSessionFactory();
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		System.out.println("ENTER STUDENT ID TO DELETE RECORD");
		int i=sc.nextInt();
		Query q=session.getNamedNativeQuery("deleteObject");
		q.setParameter(0, i);
		q.executeUpdate();
		tx.commit();
	}

	@Override
	public void retrievedata() {
		// TODO Auto-generated method stub
	
		SessionFactory sf=HibernateUtil.getSessionFactory();
		Session session =sf.openSession();
//		List<Pojo>l =session.getNamedNativeQuery("findAll").getResultList();
//		l.forEach(p->
//		{
//			System.out.println(p.getSid());
//			System.out.println(p.getSname());
//		}
//		);
		
		Pojo p=(Pojo) session.getNamedNativeQuery("findSingleObject").setParameter(0, 1234).getSingleResult();
		System.out.println(p.getSid());
		System.out.println(p.getSname());
	}

	@Override
	public void updatedata() {
		// TODO Auto-generated method stub
	
		SessionFactory sf=HibernateUtil.getSessionFactory();
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		Query q=session.getNamedNativeQuery("updateObject");
		System.out.println("ENTER NEW STUDENT NAME:");
		String nm=sc.next();
		System.out.println("ENTER STUDENT ID:");
		int i=sc.nextInt();
		q.setParameter(0, nm);
		q.setParameter(1, i);
		q.executeUpdate();
		tx.commit();
	}

}
