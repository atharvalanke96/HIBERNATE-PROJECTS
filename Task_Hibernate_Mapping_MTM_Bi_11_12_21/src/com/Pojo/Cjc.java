package com.Pojo;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Cjc {

	@Id
	private int Cid;
	private String caddress;
	@OneToMany(cascade = CascadeType.ALL)
	private Set<Staff> stf;
	@OneToMany(cascade = CascadeType.ALL)
	private Set<Student> stu;
	public int getCid() {
		return Cid;
	}
	public void setCid(int cid) {
		Cid = cid;
	}
	public String getCaddress() {
		return caddress;
	}
	public void setCaddress(String caddress) {
		this.caddress = caddress;
	}
	public Set<Staff> getStf() {
		return stf;
	}
	public void setStf(Set<Staff> stf) {
		this.stf = stf;
	}
	public Set<Student> getStu() {
		return stu;
	}
	public void setStu(Set<Student> stu) {
		this.stu = stu;
	}
	
	
}
