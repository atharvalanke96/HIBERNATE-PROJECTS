package com.Pojo;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Aadharcard {

	@Id
	private int aid;
	private String aname;
	
	@OneToOne(cascade=CascadeType.ALL)
	private Employee e;
	public Employee getE() {
		return e;
	}
	public void setE(Employee e) {
		this.e = e;
	}
	public int getaid() {
		return aid;
	}
	public void setaid(int aid) {
		this.aid = aid;
	}
	public String getaname() {
		return aname;
	}
	public void setaname(String aname) {
		this.aname = aname;
	}
	
}
