package com.Pojo;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Cjc {

	@Id
	private int cid;
	private String caddress;
	@OneToMany(cascade = CascadeType.ALL)
	private Set<Student> st=new HashSet<Student>();
	@OneToMany(cascade = CascadeType.ALL)
	private Set<Staff> sf=new HashSet<Staff>();
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCaddress() {
		return caddress;
	}
	public void setCaddress(String caddress) {
		this.caddress = caddress;
	}
	public Set<Student> getSt() {
		return st;
	}
	public void setSt(Set<Student> st) {
		this.st = st;
	}
	public Set<Staff> getSf() {
		return sf;
	}
	public void setSf(Set<Staff> sf) {
		this.sf = sf;
	}
	
}
