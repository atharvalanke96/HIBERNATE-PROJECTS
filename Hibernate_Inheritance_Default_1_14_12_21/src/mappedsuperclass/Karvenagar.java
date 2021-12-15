package mappedsuperclass;

import javax.persistence.Entity;

@Entity
public class Karvenagar extends Cjc{

	private String Regular;

	public String getRegular() {
		return Regular;
	}

	public void setRegular(String regular) {
		Regular = regular;
	}
}
