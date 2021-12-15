package inheritance2;

import org.hibernate.Session;

public class Test {

	public static void main(String[] args) {
		
		Session session =HibernateUtil.getSessionFactory().openSession();
		Contract c=new Contract();
		c.setEid(1);
		c.setEname("ATHARVA");
		c.setPayment(60000);
		c.setDuration("6 MONTHS");
		
		Regular r=new Regular();
		r.setEid(2);
		r.setEname("YOGESH");
		r.setSalatry(50000);
		r.setBonus(10000);
		
		session.save(r);
		session.save(c);
		
		session.beginTransaction().commit();
	}
}
