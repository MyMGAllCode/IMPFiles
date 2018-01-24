
	/*Approach2 */
	package com.nt.test;

	import org.hibernate.Session;
	import org.hibernate.SessionFactory;
	import org.hibernate.Transaction;
	import org.hibernate.cfg.Configuration;

	import com.nt.domain.EmpDetails;



	public class UpdateObjectApproach2 {
	public static void main(String[] args) {
		
		
		Configuration cfg=null;
		SessionFactory factory=null;
		Session ses=null;
		EmpDetails details=null;
		Transaction tx=null;
		
		///Activate HB FW
		
		cfg=new Configuration();
		
		// Read Both cfg nad mapping file
		cfg=cfg.configure("/com/nt/cfgs/hibernate.cfg.xml");
		
		// Build SessionFactory
		factory=cfg.buildSessionFactory();
		//Build Session
		ses=factory.openSession();
	 details=ses.get(EmpDetails.class, 1002);
	 
	if(details!=null)
	{
	 try{
		 
		 tx=ses.beginTransaction();
		 details.setMail("abc@gmail.com");
		 details.setFname("Suresh");
		 ses.update(details);//This is optional 
	tx.commit();	 
	 }catch(Exception ex){
		 tx.rollback();
	 }
		
	}//if
	else
		System.out.println("Object Not Found");
	}//main
	}//class


