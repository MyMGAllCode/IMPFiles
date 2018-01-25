package com.nt.test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.nt.domain.EmpDetails;
import com.nt.domain.EmpProjId;
import com.nt.util.HibernateUtil;


public class SaveTest {
	public static void main(String[] args) {
		
		Session session=null;
		EmpDetails details=null;
		EmpProjId eid=null;
		
		
		Transaction tx=null;
		// Activate HB 
		eid=new EmpProjId();
		eid.setEid(1001);
		eid.setProjid(1111);
		
		// Build Session 
		
		session=HibernateUtil.getSession();
		// Prepare object for Domain Class having Data
	details=new EmpDetails();
		//details=session.get(EmpDetails.class , 1);
	
	
	details.setId(eid);details.setEname("Dharmednra");details.setProjname("Hb Annotation");
		//details=session.get(EmpDetails.class, 1212);
		
		
	// Save Obj using ses.persist(-)
		
	
		
		try{
			
		tx=session.beginTransaction();
		
			session.save(details);
			tx.commit();
			System.out.println("Object is saved/Record is inserted\n");
			
		}catch(Exception ex)
		{
			tx.rollback();
			System.out.println("Some Exception Occurs:"+ex.getMessage());
		}
		
		//close session
		HibernateUtil.closeSession();
		// close Session Factory
		
	}// Main
}//Class
