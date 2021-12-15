package cachetask1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SessionFactory sf=HibernateUtil.getSessionFactory();
		Session session=sf.openSession();
		
//		Student s1=new Student();
//		s1.setId(1);
//		s1.setName("ABC");
//		s1.setAddress("PUNE");
//		
//		Student s2=new Student();
//		s2.setId(2);
//		s2.setName("PQR");
//		s2.setAddress("MUMBAI");
//		
//		session.save(s1);
//		session.save(s2);
		
		Student st=session.get(Student.class, 1);
		System.out.println(st.getId());
		System.out.println(st.getName());
		System.out.println(st.getAddress());
		
//		Student st1=session.get(Student.class, 2);
//		System.out.println(st.getId());
//		System.out.println(st.getName());
//		System.out.println(st.getAddress());
//		
//		Session session1=sf.openSession();
//		Student st2=session1.get(Student.class, 1);
//		System.out.println(st2.getId());
//		System.out.println(st2.getName());
//		System.out.println(st2.getAddress());
		
//		Student s3=new Student();
//		s3.setId(5);
//		s3.setName("XYZ");
//		s3.setAddress("DELHI");
//		session.save(s3);
		
		Session session2=sf.openSession();
		Student st3=session2.get(Student.class, 1);
		System.out.println(st3.getId());
		System.out.println(st3.getName());
		System.out.println(st3.getAddress());
		
		session.beginTransaction().commit();
	}

}
