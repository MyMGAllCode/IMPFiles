package com.nt.dao;

public class Programmer_ProjectDAOFactory {
	public static Programmer_ProjectDAO getInstance()
	{
		return new Programmer_ProjectDAOImpl();
	}

}
