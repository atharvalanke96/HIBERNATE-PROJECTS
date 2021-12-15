package com.Pojo;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
@Entity
public class Staff {

	@Id
	private int sfid;
	private String sfname;
	@ManyToOne(cascade = CascadeType.ALL)
	private Cjc cj;
	@ManyToMany(cascade = CascadeType.ALL)
	private Set<Student> stu=new HashSet<Student>();
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
	public Cjc getCj() {
		return cj;
	}
	public void setCj(Cjc cj) {
		this.cj = cj;
	}
	public Set<Student> getStu() {
		return stu;
	}
	public void setStu(Set<Student> stu) {
		this.stu = stu;
	}
}
