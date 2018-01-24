package com.nt.test;

import org.hibernate.Session;

import com.nt.dao.TransferDAO;
import com.nt.dao.TransferDAOFactroy;
import com.nt.util.MysqlHibernateUtil;
import com.nt.util.OracleHibernateUtil;

public class ClientApp {
	public static void main(String[] args) {
		TransferDAO dao=null;
		dao=TransferDAOFactroy.getInstaance();
		
		
	

dao.transferEmployee(1212);
		
	
OracleHibernateUtil.closeSession();//Clossing Session 
OracleHibernateUtil.CloseSessionFactory();//Clossing  SessionFactory
	
	
	}

}
;
