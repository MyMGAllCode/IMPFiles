package com.nt.cid;

import java.io.Serializable;

public class Programmer_ProjectId implements Serializable {
	private int programmerId;
	private int projectId;
	
	
	////////////Setters and Getters
	public int getProgrammerId() {
		return programmerId;
	}
	public void setProgrammerId(int programmerId) {
		this.programmerId = programmerId;
	}
	public int getProjectId() {
		return projectId;
	}
	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}
	
	
}
