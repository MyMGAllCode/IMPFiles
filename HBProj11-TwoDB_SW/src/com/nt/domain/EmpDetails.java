package com.nt.domain;

public class EmpDetails {
	private int no;
	private String fname;
	private String lname;
	private String mail;
	
	private java.sql.Timestamp lastupdatetime;
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	
	public java.sql.Timestamp getLastupdatetime() {
		return lastupdatetime;
	}
	public void setLastupdatetime(java.sql.Timestamp lastupdatetime) {
		this.lastupdatetime = lastupdatetime;
	}

}
