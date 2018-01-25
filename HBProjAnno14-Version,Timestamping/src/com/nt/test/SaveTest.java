package com.nt.test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.nt.domain.EmpDetails;
import com.nt.util.HibernateUtil;


public class SaveTest {
	public static void main(String[] args) {
		
		Session session=null;
		EmpDetails details=null;
		
		Transaction tx=null;
		// Activate HB 
		
		
		
		// Build Session 
		
		session=HibernateUtil.getSession();
		// Prepare object for Domain Class having Data
//		details=new EmpDetails();
		details=session.get(EmpDetails.class , 1);
	
	
//details.setFname("Dharmendra");details.setLname("Kumar Prajapati");details.setMail("dkp@gmail.com");
		
		//details=session.get(EmpDetails.class, 1212);
		
		
	// Save Obj using ses.persist(-)
		
	
		
		try{
			details.setMail("Rikki@gmail.com");
		tx=session.beginTransaction();
		
			//session.save(details);
			tx.commit();
			System.out.println("Object is saved/Record is inserted\n");
			//System.out.println("Generated Id is:::"+generatedId); 
			
		}catch(Exception ex)
		{
			tx.rollback();
			System.out.println("Some Exception Occurs:"+ex.getMessage());
		}
		
		//close sessiondetails=new EmpDetails();
		HibernateUtil.closeSession();
		// close Session Factory
		
	}// Main
}//Class
