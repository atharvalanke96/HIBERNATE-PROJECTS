package defaulttable;

import javax.persistence.Entity;

@Entity
public class Cheque extends Payment{

	
	private int chqno;
	private String chqtype;
	public int getChqno() {
		return chqno;
	}
	public void setChqno(int chqno) {
		this.chqno = chqno;
	}
	public String getChqtype() {
		return chqtype;
	}
	public void setChqtype(String chqtype) {
		this.chqtype = chqtype;
	}
}
