package com.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Pojo {

	@Id
	private int srno;
	private String sname;
	private int age;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSrno() {
		return srno;
	}
	public void setSrno(int srno) {
		this.srno = srno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	
}
