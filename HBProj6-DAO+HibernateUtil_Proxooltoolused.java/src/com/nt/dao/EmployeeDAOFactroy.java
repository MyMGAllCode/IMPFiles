package com.nt.dao;

public class EmployeeDAOFactroy {
	public static EmployeeDAO getInstaance()
	{
		return new EmployeeImpl();
	}

}
