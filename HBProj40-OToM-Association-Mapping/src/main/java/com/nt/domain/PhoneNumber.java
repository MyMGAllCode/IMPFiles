package com.nt.domain;
public class PhoneNumber {
private long phoneNumber;
private String operator;


public long getPhoneNumber() {
	return phoneNumber;
}
public void setPhoneNumber(long phoneNumber) {
	this.phoneNumber = phoneNumber;
}
public String getOperator() {
	return operator;
}
public void setOperator(String operator) {
	this.operator = operator;
}
@Override
public String toString() {
	return "PhoneNumber [phoneNumber=" + phoneNumber + ", operator=" + operator + "]";
}

	

}
