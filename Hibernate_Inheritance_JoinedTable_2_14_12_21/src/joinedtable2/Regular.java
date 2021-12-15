package joinedtable2;

import javax.persistence.Entity;

@Entity
public class Regular extends Employee{

	private String payment;
	private int bonus;
	public String getPayment() {
		return payment;
	}
	public void setPayment(String payment) {
		this.payment = payment;
	}
	public int getBonus() {
		return bonus;
	}
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
}
