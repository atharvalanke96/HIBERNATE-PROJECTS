package com.Pojo;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Project {

	@Id
	private int pid;
	private String pname;
	
	@OneToOne(cascade=CascadeType.ALL)
	private Employee e;
	public Employee getE() {
		return e;
	}
	public void setE(Employee e) {
		this.e = e;
	}
	public int getaid() {
		return pid;
	}
	public void setaid(int aid) {
		this.pid = aid;
	}
	public String getaname() {
		return pname;
	}
	public void setaname(String aname) {
		this.pname = aname;
	}
	
}
