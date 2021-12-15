package com.Pojo;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
@Entity
public class Staff {

	@Id
	private int sfid;
	private String sfname;
	@ManyToMany(cascade = CascadeType.ALL)
	private Set<Student> st=new HashSet<Student>();
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
	public Set<Student> getSt() {
		return st;
	}
	public void setSt(Set<Student> st) {
		this.st = st;
	}
	
}
