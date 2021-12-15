package com.Pojo;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class Staff {

	@Id
	private int sfid;
	private String sfname;
	@ManyToOne(cascade = CascadeType.ALL)
	private Cjc cj;
	public int getSfid() {
		return sfid;
	}
	public void setSfid(int sfid) {
		this.sfid = sfid;
	}
	public String getSfname() {
		return sfname;
	}
	public void setSfname(String sfname) {
		this.sfname = sfname;
	}
	public Cjc getCj() {
		return cj;
	}
	public void setCj(Cjc cj) {
		this.cj = cj;
	}
}
