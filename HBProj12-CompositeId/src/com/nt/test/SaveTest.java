package com.nt.test;


import com.nt.dao.Programmer_ProjectDAO;
import com.nt.dao.Programmer_ProjectDAOFactory;

import com.nt.util.HibernateUtil;


public class SaveTest {
	public static void main(String[] args) {
		
		Programmer_ProjectDAO dao=null;
		dao=Programmer_ProjectDAOFactory.getInstance();
		dao.save();
		
	
		//close session
		HibernateUtil.closeSession();
		// close Session Factory
		
	}// Main
}//Class
