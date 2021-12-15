package com.Entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Department {

	@Id
	private int did;
	private String dname;
	@OneToMany(cascade = CascadeType.ALL)
	private Set<Employee> empl;
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public Set<Employee> getEmpl() {
		return empl;
	}
	public void setEmpl(Set<Employee> empl) {
		this.empl = empl;
	}
}
