package defaulttable;

import org.hibernate.Session;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Session session=HibernateUtil.getSessionFactory().openSession();
		
		Batsman bt=new Batsman();
		bt.setFirstname("ATHARVA");
		bt.setLastname("LANKE");
		bt.setBattingHand("RIGHT HAND");
		bt.setHeighestScore(100);
		
		Bowler bo=new Bowler();
		bo.setFirstname("JASPRIT");
		bo.setLastname("BUMRAH");
		bo.setBowlerHand("RIGHT ARM");
		bo.setHeighestWicket(150);
		
		session.save(bt);
		session.save(bo);
		
		session.beginTransaction().commit();
	}

}
