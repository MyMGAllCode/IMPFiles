package com.nt.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.NamedNativeQuery;
@Entity
@Table(name="Employee")
@NamedNativeQuery(name="Call_Procedure", query="{call P_GET_EMP_BY_NAMECHAR(?,:nameinChar)}", callable=true, resultClass=com.nt.domain.EmpDetails.class )///This is HB Annotation because JPA Annotaion not having Callable property
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


