package tableperclass;

import org.hibernate.Session;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Session session=HibernateUtil.getSessionFactory().openSession();
		
		Cjc c=new Cjc();c.setId(139);
		c.setCname("ALL COURSES");
		c.setSname("ALL STUDENTS");
		
		Karvenagar k=new Karvenagar();
		k.setId(5);
		k.setSname("YOGESH");
		k.setCname("JAVA");
		k.setRegular("REGULAR BATCH");
		
		Akurdi a=new Akurdi();
		a.setId(6);
		a.setSname("JAID");
		a.setCname("PYTHON");
		a.setWeekend("WEEKEND BATCH");
		
		session.save(a);
		session.save(k);
		session.save(c);
		session.beginTransaction().commit();
		
		
	}

}
