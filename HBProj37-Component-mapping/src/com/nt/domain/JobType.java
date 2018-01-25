package com.nt.domain;

public class JobType {
	private String job;
	
	private int department;
	private int salary;
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public int getDepartment() {
		return department;
	}
	public void setDepartment(int department) {
		this.department = department;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "JobType [job=" + job + ", department=" + department + ", salary=" + salary + "]";
	}
	

}
