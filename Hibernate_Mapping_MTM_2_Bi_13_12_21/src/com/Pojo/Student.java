package com.Pojo;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Student {

	@Id
	private int sid;
	private String sname;
	@ManyToMany(cascade = CascadeType.ALL,mappedBy = "st")
	private Set<Staff> stf=new HashSet<Staff>();
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
	public Set<Staff> getStf() {
		return stf;
	}
	public void setStf(Set<Staff> stf) {
		this.stf = stf;
	}
}
