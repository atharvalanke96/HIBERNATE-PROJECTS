package defaulttable;

import javax.persistence.Entity;

@Entity
public class Bowler extends TeamIndia{

	private String BowlerHand;
	private int HeighestWicket;
	public String getBowlerHand() {
		return BowlerHand;
	}
	public void setBowlerHand(String bowlerHand) {
		BowlerHand = bowlerHand;
	}
	public int getHeighestWicket() {
		return HeighestWicket;
	}
	public void setHeighestWicket(int heighestWicket) {
		HeighestWicket = heighestWicket;
	}
}
