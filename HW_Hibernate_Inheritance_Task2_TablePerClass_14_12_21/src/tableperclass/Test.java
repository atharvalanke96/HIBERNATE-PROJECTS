package tableperclass;

import org.hibernate.Session;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Session session=HibernateUtil.getSessionFactory().openSession();
		
		Card cd=new Card();
		cd.setPid(1234);
		cd.setAmount(50000);
		cd.setCardno(159753);
		cd.setCardtype("VISA");
		
		Cheque cq=new Cheque();
		cq.setPid(789);
		cq.setAmount(60000);
		cq.setChqno(415698);
		cq.setChqtype("BEARER");
		
		Payment p=new Payment();
		p.setPid(456);
		p.setAmount(80000);
		
		session.save(cd);
		session.save(cq);
		session.save(p);
		
		session.beginTransaction().commit();
	}

}
