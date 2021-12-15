package joinedtable2;

import org.hibernate.Session;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Session session =HibernateUtil.getSessionFactory().openSession();
		
		Contract c=new Contract();
		c.setEid(123);
		c.setEname("ATHARVA");
		c.setSalary(50000);
		c.setDuration("8 hours");
		
		Regular r=new Regular();
		r.setEid(456);
		r.setEname("JAID");
		r.setPayment("60000");
		r.setBonus(5000);
		
		session.save(r);
		session.save(c);
		session.beginTransaction().commit();
	}

}
