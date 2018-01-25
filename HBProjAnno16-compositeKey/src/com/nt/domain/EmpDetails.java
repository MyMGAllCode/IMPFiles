package com.nt.domain;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
@Entity
@Table(name="EMPCOMPOSITE")

public class EmpDetails  {
	@EmbeddedId
	private EmpProjId Id;
	@Column
	private String ename;
	@Column
	private String projname;
	public EmpProjId getId() {
		return Id;
	}
	public void setId(EmpProjId id) {
		Id = id;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getProjname() {
		return projname;
	}
	public void setProjname(String projname) {
		this.projname = projname;
	}
	
	
	}


