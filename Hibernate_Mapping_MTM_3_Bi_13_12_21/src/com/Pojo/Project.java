package com.Pojo;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
@Entity
public class Project {

	@Id
	private int pid;
	private String pname;
	@ManyToMany
	private Set<Employee> e=new HashSet<Employee>();
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
	public Set<Employee> getE() {
		return e;
	}
	public void setE(Set<Employee> e) {
		this.e = e;
	}
	
}
