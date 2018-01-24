package com.nt.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="Student_Details")

public class Student_Details {
	@Id
@Column(name="sid")
private int sid;
	@Column(name="sname")
private String sname;
	@Column(name="email")
private String email;
	@Column(name="saddrs")
private String saddrs;
	
	
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
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getSaddrs() {
	return saddrs;
}
public void setSaddrs(String saddrs) {
	this.saddrs = saddrs;
}
@Override
public String toString() {
	return "Student_Details [sid=" + sid + ", sname=" + sname + ", email=" + email + ", saddrs=" + saddrs + "]";
}

}
