package singletable;

import javax.persistence.Entity;

@Entity
public class Batsman extends TeamIndia{

	private String BattingHand;
	private int HeighestScore;
	public String getBattingHand() {
		return BattingHand;
	}
	public void setBattingHand(String battingHand) {
		BattingHand = battingHand;
	}
	public int getHeighestScore() {
		return HeighestScore;
	}
	public void setHeighestScore(int heighestScore) {
		HeighestScore = heighestScore;
	}
	
}
