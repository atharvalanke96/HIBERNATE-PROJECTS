package com.model;

public class Student {

	private int sid;
	private String sname;
	private Batch bh;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public Batch getBh() {
		return bh;
	}
	public void setBh(Batch bh) {
		this.bh = bh;
	}
}
