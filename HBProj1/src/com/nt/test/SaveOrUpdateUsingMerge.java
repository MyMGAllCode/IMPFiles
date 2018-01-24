package com.nt.test;



	import org.hibernate.Session;
	import org.hibernate.SessionFactory;
	import org.hibernate.Transaction;
	import org.hibernate.cfg.Configuration;

	import com.nt.domain.EmpDetails;


	public class SaveOrUpdateUsingMerge {
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
		 
		EmpDetails details1= (EmpDetails)ses.merge(details);
		 System.out.println("Object is Merged"+details1);
	tx.commit();	 
	 }//try
	 catch(Exception ex){
		 tx.rollback();
	 }
	

	
	}//main
	}//class








