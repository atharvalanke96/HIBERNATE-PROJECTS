package com.Pojo;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
@Entity
public class Employee {

	@Id
	private int eid;
	private String ename;
	@ManyToMany
	private Set<Project> p=new HashSet<Project>();
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public Set<Project> getP() {
		return p;
	}
	public void setP(Set<Project> p) {
		this.p = p;
	}
	
}
