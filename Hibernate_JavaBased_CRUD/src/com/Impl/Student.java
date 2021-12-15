package com.Impl;

import java.util.Scanner;

import org.hibernate.Session;
import com.Service.Operations;
import com.config.HibernateUtil;
import com.model.Pojo;

public class Student implements Operations{

	Scanner sc=new Scanner(System.in);
	Pojo p=new Pojo();
	//Session session=HibernateUtil.getSessionFactory().openSession();
	//Transaction tx;
	
	@Override
	public void insertdata() {
		// TODO Auto-generated method stub
		
		System.out.println("ENTER STUDENT ROLL NO");
		p.setSrno(sc.nextInt());
		System.out.println("ENTER STUDENT NAME");
		p.setSname(sc.next());
		System.out.println("ENTER STUDENT AGE");
		p.setAge(sc.nextInt());
		Session session=HibernateUtil.getSessionFactory().openSession();
		session.save(p);
		session.beginTransaction().commit();
		System.out.println(p);
	}

	@Override
	public void updatedata() {
		// TODO Auto-generated method stub
		System.out.println("ENTER STUDENT ROLL NO");
		int r=sc.nextInt();
		Session session=HibernateUtil.getSessionFactory().openSession();
		Pojo p=session.get(Pojo.class, r);
		System.out.println("ENTER STUDENT NAME");
		p.setSname(sc.next());
		System.out.println("ENTER STUDENT AGE");
		p.setAge(sc.nextInt());
		
		session.update(p);
		session.beginTransaction().commit();
		
	}

	@Override
	public void deletedata() {
		// TODO Auto-generated method stub
		System.out.println("ENTER STUDENT ROLL NO");
		p.setSrno(sc.nextInt());
		Session session=HibernateUtil.getSessionFactory().openSession();
		session.delete(p);
		session.beginTransaction().commit();
		
	}

	@Override
	public void retrievedata() {
		// TODO Auto-generated method stub
		System.out.println("ENTER STUDENT ROLL NO");
		int r=sc.nextInt();
		Session session=HibernateUtil.getSessionFactory().openSession();
		Pojo p=session.get(Pojo.class, r);
		System.out.println("STUDENT ROLL NO IS = "+p.getSrno());
		System.out.println("STUDENT NAME IS  = "+p.getSname());
		System.out.println("STUDENT AGE IS = "+p.getAge());
	}

}
