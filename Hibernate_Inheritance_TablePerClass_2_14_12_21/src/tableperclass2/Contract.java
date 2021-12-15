package tableperclass2;

import javax.persistence.Entity;

@Entity
public class Contract extends Employee{

	private float payment;
	private String duration;
	public float getPayment() {
		return payment;
	}
	public void setPayment(float payment) {
		this.payment = payment;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
}
