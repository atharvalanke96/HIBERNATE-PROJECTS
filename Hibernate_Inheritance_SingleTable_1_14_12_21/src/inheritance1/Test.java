package inheritance1;

import org.hibernate.Session;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Session session= HibernateUtil.getSessionFactory().openSession();
		
		Karvenagar k=new Karvenagar();
		k.setId(1);
		k.setSname("NITISH");
		k.setCname("JAVA FULL STACK");
		k.setRegular("REGULAR BATCH");
		
		Akurdi a=new Akurdi();
		a.setId(2);
		a.setSname("JAID");
		a.setCname("WEB FULL STACK");
		a.setWeekend("WEEKEND BATCH");
		
		session.save(k);
		session.save(a);
		
		session.beginTransaction().commit();
	}

}
