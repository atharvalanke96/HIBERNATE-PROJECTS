package com.Pojo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
@NamedQueries({
@NamedQuery(name="findALL" ,query="from Pojo"),
@NamedQuery(name="findSingleObject" , query="from Pojo where sid=?"),
@NamedQuery(name="updateObject", query="update Pojo set sname=? where sid=?"),
@NamedQuery(name="deleteObject", query="delete from Pojo where sid=?")
})
@Entity
public class Pojo {

	@Id
	private int sid;
	private String sname;
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
	
	
}
