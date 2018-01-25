package com.nt.domain;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user_table")
public class User {
	@Id
	private int uid;
	private String  uname;
	private Set<PhoneNumber>phone;
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public Set<PhoneNumber> getPhone() {
		return phone;
	}
	public void setPhone(Set<PhoneNumber> phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "User [uid=" + uid + ", uname=" + uname + ", phone=" + phone + "]";
	}
	

}
