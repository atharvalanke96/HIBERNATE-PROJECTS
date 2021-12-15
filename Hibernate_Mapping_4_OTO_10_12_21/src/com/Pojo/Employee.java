package com.Pojo;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Employee {

	@Id
	private int empid;
	private String empname;
	
	@OneToOne(cascade=CascadeType.ALL)
	private Project pg;
	
	public Project getPg() {
		return pg;
	}
	public void setPg(Project pg) {
		this.pg = pg;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	
}
