package com.Pojo;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Student {

	@Id
	private int sid;
	private String sname;
	@ManyToOne(cascade = CascadeType.ALL)
	private Cjc cj;
	@ManyToMany(cascade = CascadeType.ALL)
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
	public Cjc getCj() {
		return cj;
	}
	public void setCj(Cjc cj) {
		this.cj = cj;
	}
	public Set<Staff> getStf() {
		return stf;
	}
	public void setStf(Set<Staff> stf) {
		this.stf = stf;
	}
}
