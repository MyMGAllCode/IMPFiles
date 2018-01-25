package com.nt.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Filter;
import org.hibernate.annotations.FilterDef;
import org.hibernate.annotations.ParamDef;
@Entity
@Table(name="Employee")
@FilterDef(name="FILTER_BY_RANGE",parameters={@ParamDef(name="min" ,type="int"),@ParamDef(name="max", type="int")})
@Filter(name="FILTER_BY_RANGE",condition= "EID>=:min and EID<=:max")
public class EmpDetails {
	@Id
	@Column(name="EID")
	private int no;
	@Column(name="FIRSTNAME")
	private String fname;
	@Column(name="LASTNAME")
	private String lname;
	@Column(name="EMAIL")
	private String mail;
	
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
	@Override
	public String toString() {
		return "EmpDetails [no=" + no + ", fname=" + fname + ", lname=" + lname + ", mail=" + mail + "]";
	}
	
	
	

	
	}


