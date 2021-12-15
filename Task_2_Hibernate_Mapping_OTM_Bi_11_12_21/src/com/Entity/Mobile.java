package com.Entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Mobile {

	@Id
	private int mno;
	private String mname;
	@OneToMany(cascade = CascadeType.ALL)
	private Set<Simcard> sim;
	public int getMno() {
		return mno;
	}
	public void setMno(int mno) {
		this.mno = mno;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public Set<Simcard> getSim() {
		return sim;
	}
	public void setSim(Set<Simcard> sim) {
		this.sim = sim;
	}
}
