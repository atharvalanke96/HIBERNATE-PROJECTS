
package com.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Details {
@Id
private int eid;
private String ename;
private String emobno;
private double esalary;
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
public String getEmobno() {
	return emobno;
}
public void setEmobno(String emobno) {
	this.emobno = emobno;
}
public double getEsalary() {
	return esalary;
}
public void setEsalary(double esalary) {
	this.esalary = esalary;
}

}
