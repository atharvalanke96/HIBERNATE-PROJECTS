package com.Pojo;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class PanCard {

	@Id
	private int panid;
	private String panname;
	@OneToOne(cascade=CascadeType.ALL)
	private Person p;
	public Person getPn() {
		return p;
	}
	public void setPn(Person p) {
		this.p = p;
	}
	public int getPanid() {
		return panid;
	}
	public void setPanid(int panid) {
		this.panid = panid;
	}
	public String getPanname() {
		return panname;
	}
	public void setPanname(String panname) {
		this.panname = panname;
	}
}
