package com.Pojo;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Student {

	@Id
	private int sid;
	private String sname;
	@ManyToOne(cascade = CascadeType.ALL)
	private Cjc cj;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public Cjc getCj() {
		return cj;
	}
	public void setCj(Cjc cj) {
		this.cj = cj;
	}
}
