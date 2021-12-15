package com.Pojo;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Person {

	@Id
	private int pid;
	private String pname;
	
	@OneToOne(cascade = CascadeType.ALL,mappedBy = "p")
	private PanCard pn;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public PanCard getP() {
		return pn;
	}
	public void setP(PanCard pn) {
		this.pn = pn;
	}
	
}
