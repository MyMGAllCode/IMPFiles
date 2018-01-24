package com.nt.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.nt.domain.EmpDetails;


public class SaveTest {
	public static void main(String[] args) {
		Configuration cfg=null ;
		SessionFactory factory=null;
		Session ses=null;
		EmpDetails details=null;
	
		Transaction tx=null;
		// Activate HB 
		cfg=new Configuration();
		//Using Programmatical Approach to seting the properties 
		cfg.setProperty("hibernate.connection.driver_calsss", "oracle.jdbc.driver.OracleDriver");
		cfg.setProperty("hibernate.connection.url", "jdbc:oracle:thin:@localhost:1521:xe");
		cfg.setProperty("hibernate.connection.username", "system");

		cfg.setProperty("hibernate.connection.passwaord", "manager");
		cfg.setProperty("show_sql","true");

		// Read  Mapping file
		cfg.addFile("com/nt/cfgs/employee.hbm.xml");
		
		// Build Session Factory 
	
		factory=cfg.buildSessionFactory();
		
		// Build Session 
		ses=factory.openSession();
		
		// Prepare object for Domain Class having Data
		details=new EmpDetails();	details.setNo(1008);details.setFname("Dharmendra");details.setLname("Kumar Prajapati");details.setMail("dkp@gmail.com");
		
	// Save Obj using ses.persist(-)
		
	
		
		try{
			
		tx=ses.beginTransaction();
		
			ses.persist(details);
			
			tx.commit();
			System.out.println("Object is saved/Record is inserted"); 
		}catch(Exception ex)
		{
			tx.rollback();
			System.out.println("Some Exception Occurs:"+ex.toString());
		}
		
		//close session
		ses.close();
		// close Session Factory
		factory.close();
	}// Main
}//Class
