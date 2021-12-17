package com.Pojo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
@NamedNativeQueries({
@NamedNativeQuery(name="findAll" , query="select * from Pojo", resultClass = Pojo.class),
@NamedNativeQuery(name="findSingleObject" , query="select * from Pojo where sid=?",resultClass = Pojo.class),
@NamedNativeQuery(name="updateObject", query="update Pojo set sname=? where sid=?"),
@NamedNativeQuery(name="deleteObject", query="delete from Pojo where sid=?")
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
