package com.Entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Simcard {

	@Id
	private int simno;
	private String simname;
	@ManyToOne(cascade = CascadeType.ALL)
	private Mobile mob;
	public int getSimno() {
		return simno;
	}
	public void setSimno(int simno) {
		this.simno = simno;
	}
	public String getSimname() {
		return simname;
	}
	public void setSimname(String simname) {
		this.simname = simname;
	}
	public Mobile getMob() {
		return mob;
	}
	public void setMob(Mobile mob) {
		this.mob = mob;
	}
	
	}
