package inheritance1;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("CJC KARVENAGAR")
public class Karvenagar extends Cjc{

	public String regular;

	public String getRegular() {
		return regular;
	}

	public void setRegular(String regular) {
		this.regular = regular;
	}
}
