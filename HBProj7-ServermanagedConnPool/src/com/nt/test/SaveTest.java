package com.nt.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.nt.domain.EmpDetails;
import com.nt.domain.Marks;

public class SaveTest {
	public static void main(String[] args) {
		Configuration cfg=null ;
		SessionFactory factory=null;
		Session ses=null;
		EmpDetails details=null;
		Marks mrks=null;
		Transaction tx=null;
		// Activate HB 
		cfg=new Configuration();
		
		// Read both file CFG and Mapping file
		cfg=cfg.configure("/com/nt/cfgs/hibernate.cfg.xml");
		
		// Build Session Factory 
	
		factory=cfg.buildSessionFactory();
		
		// Build Session 
		ses=factory.openSession();
		
		// Prepare object for Domain Class having Data
		details=new EmpDetails();	details.setNo(1005);details.setFname("Dharmendra");details.setLname("Kumar Prajapati");details.setMail("dkp@gmail.com");
		
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
