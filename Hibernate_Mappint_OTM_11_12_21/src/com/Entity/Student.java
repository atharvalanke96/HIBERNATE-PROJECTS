package com.Entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class Student {

	@Id
	private int sid;
	private String sname;
	@ManyToOne(cascade=CascadeType.ALL)
	private Teacher tea;
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
	public Teacher getTea() {
		return tea;
	}
	public void setTea(Teacher tea) {
		this.tea = tea;
	}
}
