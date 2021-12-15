package com.Entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Teacher {

	@Id
	private int tid;
	private String tname;
	@OneToMany(cascade=CascadeType.ALL)
	private Set<Student> st;
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public Set<Student> getStud() {
		return st;
	}
	public void setStud(Set<Student> stud) {
		this.st = stud;
	}
}
