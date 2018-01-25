package com.nt.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.NamedNativeQuery;
@Entity
@Table(name="My_User")

public class EmpDetails {
	@Id
	@Column(name="uname")
	private String uname;
	
	
	@Column(name="pass")
	private String pass;
	@Column(name="name")
	private String name;
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "EmpDetails [uname=" + uname + ", pass=" + pass + ", name=" + name + "]";
	}
	
	

	
	}


