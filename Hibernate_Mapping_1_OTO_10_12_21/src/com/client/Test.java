package com.client;

import java.util.Scanner;

import org.hibernate.Session;

import com.Pojo.PanCard;
import com.Pojo.Person;
import com.config.HibernateUtil;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		Session session=HibernateUtil.getSessionFactory().openSession();
		
		
		//To Create/Set Values
		PanCard pan=new PanCard();
		pan.setPanid(1234);
		pan.setPanname("ABC");
		
		
		Person p=new Person();
		p.setPid(1);
		p.setPname("ATHARVA");
		p.setP(pan);
		pan.setPn(p);
		
		session.save(p);
     	session.beginTransaction().commit();
		
		
		//To Retrieve Values
		/*Person p=session.get(Person.class, 987);
		System.out.println(p.getPid());
		System.out.println(p.getPname());
		System.out.println(p.getP().getPanid());
		System.out.println(p.getP().getPanname());*/
		
		
		//To Update Values
		//Person p=new Person();
		/*PanCard pan=new PanCard();
		System.out.println("ENTER PERSON ID");
		int i=sc.nextInt();
		Person p=session.get(Person.class, i);
		
	//	System.out.println("ENTER PAN ID");
	//	pan.setPanid(sc.nextInt());
		p.getP().setPanid(4334);
	//	System.out.println("ENTER PAN NAME");
	//	pan.setPanname(sc.next());
		
		session.update(p);
		session.beginTransaction().commit();*/
	}
}
