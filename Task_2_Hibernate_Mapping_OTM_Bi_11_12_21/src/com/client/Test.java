package com.client;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;

import com.Entity.Mobile;
import com.Entity.Simcard;
import com.config.HibernateUtil;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Session session=HibernateUtil.getSessionFactory().openSession();
		
		Simcard s1=new Simcard();
		s1.setSimno(567);
		s1.setSimname("AIRTEL");
		
		Simcard s2=new Simcard();
		s2.setSimno(789);
		s2.setSimname("JIO");
		
		Set<Simcard> simc=new HashSet<>();
		simc.add(s1);
		simc.add(s2);
		
		
		Mobile m=new Mobile();
		m.setMno(96577);
		m.setMname("ASUS");
		m.setSim(simc);
		
		s1.setMob(m);
		s2.setMob(m);
		
		session.save(s1);
		session.save(s2);
		session.beginTransaction().commit();
		
	}

}
