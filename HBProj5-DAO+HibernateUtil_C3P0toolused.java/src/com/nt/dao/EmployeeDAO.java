package com.nt.dao;

import com.nt.domain.EmpDetail;

public interface EmployeeDAO {
	public boolean insertData(int no, String fname,String lname,String mail)
;
	//public EmpDetail retreiveData(int no);
	public boolean modifyEmail(int no,String newEmail);
	/*public boolean deleteRecord(int no);*/
	
	
	
}
