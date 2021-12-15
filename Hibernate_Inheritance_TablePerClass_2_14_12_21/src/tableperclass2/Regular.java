package tableperclass2;

import javax.persistence.Entity;

@Entity
public class Regular extends Employee{

	private float salatry;
	private int bonus;
	public float getSalatry() {
		return salatry;
	}
	public void setSalatry(float salatry) {
		this.salatry = salatry;
	}
	public int getBonus() {
		return bonus;
	}
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	
}
