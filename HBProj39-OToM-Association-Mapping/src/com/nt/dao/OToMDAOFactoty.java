package com.nt.dao;

public class OToMDAOFactoty {
	public static OToMDAO getInstance()
	
	{
		return new OToMDAOImpl();
	}

}
