package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Student_tbl")
public class Student {

@Id
@Column(name="rno")
private int rollno;

@Column(name="nm")
private String name;

@Column(name="mb")
private String mobno;

public int getRollno() {
	return rollno;
}

public void setRollno(int rollno) {
	this.rollno = rollno;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getMobno() {
	return mobno;
}

public void setMobno(String mobno) {
	this.mobno = mobno;
}
}
