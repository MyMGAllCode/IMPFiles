package com.nt.test;

	import org.hibernate.Session;
	import org.hibernate.SessionFactory;
	import org.hibernate.Transaction;
	import org.hibernate.cfg.Configuration;

	import com.nt.domain.EmpDetails;


	public class SaveOrUpdateTest {
	public static void main(String[] args) {
		
		
		Configuration cfg=null;
		SessionFactory factory=null;
		Session ses=null;
		EmpDetails details=null;
		Transaction tx=null;
		
		///Activate HB FW
		
		cfg=new Configuration();
		
		// Read Both cfg and mapping file
		cfg=cfg.configure("/com/nt/cfgs/hibernate.cfg.xml");
		
		// Build SessionFactory
		factory=cfg.buildSessionFactory();
		//Build Session
		ses=factory.openSession();
		
		/*Approach SaveUpdate()  */
	details=new EmpDetails();
	details.setNo(1001);
	 

	
	 try{
		 
		 tx=ses.beginTransaction();
		 
		 ses.saveOrUpdate(details);//This is optional 
		 System.out.println("Object is Saved or Updated");
	tx.commit();	 
	 }//try
	 catch(Exception ex){
		 tx.rollback();
	 }
	

	
	}//main
	}//class






