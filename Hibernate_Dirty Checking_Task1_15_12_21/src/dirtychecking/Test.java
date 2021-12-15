package dirtychecking;

import org.hibernate.Session;

public class Test {

	public static void main(String[] args) {
		
		Session session=HibernateUtil.getSessionFactory().openSession();
		
		Student s=new Student();
		s.setId(1);
		s.setName("ABC");
		s.setAddress("PUNE");
		
		session.save(s);
		s.setName("PQR");
		
		session.beginTransaction().commit();
	}
}
