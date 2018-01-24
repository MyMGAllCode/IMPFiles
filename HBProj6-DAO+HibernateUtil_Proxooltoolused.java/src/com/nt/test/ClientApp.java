package com.nt.test;

import com.nt.dao.EmployeeDAO;
import com.nt.dao.EmployeeDAOFactroy;
import com.nt.domain.EmpDetail;
import com.nt.util.HibernateUtil;

public class ClientApp {
	public static void main(String[] args) {
		EmployeeDAO dao=null;
		dao=EmployeeDAOFactroy.getInstaance();
		
		/// Call the method to insert data into database
	/*	
	boolean result=	dao.insertData(10111, "Dharmendra", "Prajapati", "dkp@gmail.com");
	if(result==true)
		System.out.println("Data is Inserted Successfully");
	else 
		System.out.println("Registration is faialed");
	
	*/
	boolean result=dao.modifyEmail(10111,"abc@gmail.com");
		if(result==true)
		System.out.println("Employee No 1011 Updated");
		else 
			System.out.println("Employee No 1011 Not Updated");
	
HibernateUtil.closeSession();//Clossing Session 
HibernateUtil.CloseSessionFactory();//Clossing  SessionFactory
	
	
	}

}
;
