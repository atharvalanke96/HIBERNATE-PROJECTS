package com.Employee;

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
	private Laptop lp;
	public Laptop getLp() {
		return lp;
	}
	public void setLp(Laptop lp) {
		this.lp = lp;
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
