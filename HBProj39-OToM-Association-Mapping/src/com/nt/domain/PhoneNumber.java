package com.nt.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="phoneNumber_table")
public class PhoneNumber {
	@Id
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
