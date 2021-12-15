package mappedsuperclass;

import org.hibernate.Session;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Session session=HibernateUtil.getSessionFactory().openSession();
		
		Karvenagar k=new Karvenagar();
		k.setId(1);
		k.setSname("ATHARVA");
		k.setCname("JAVA");
		k.setRegular("REGULAR BATCH");
		
		Akurdi a=new Akurdi();
		a.setId(2);
		a.setSname("YOGESH");
		a.setCname("PYTHON");
		a.setWeekend("WEEKEND BATCH");
		
		session.save(a);
		session.save(k);
		session.beginTransaction().commit();
		
		
	}

}
