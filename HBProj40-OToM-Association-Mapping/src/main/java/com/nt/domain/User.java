package com.nt.domain;

import java.util.Set;
public class User {

	private int userId;
	private String  uname;
	private Set<PhoneNumber>phone;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
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
		return "User [userId=" + userId + ", uname=" + uname + ", phone=" + phone + "]";
	}
	
	
}