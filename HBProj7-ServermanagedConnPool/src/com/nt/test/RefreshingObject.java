



	/*Approach1 */
	package com.nt.test;

	import org.hibernate.Session;
	import org.hibernate.SessionFactory;
	import org.hibernate.Transaction;
	import org.hibernate.cfg.Configuration;

	import com.nt.domain.EmpDetails;


	public class RefreshingObject {
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
	 details=(EmpDetails)ses.get(EmpDetails.class, 1005);
	 
	System.out.println(details.getLname());//Show the Onject Data before refreshing
	
	 try{
		 
		Thread.sleep(40000);//Modify record at this duration 
		 
		
	 
	 }catch(Exception ex){
		
	 }
	 ses.refresh(details);
	 System.out.println(details.getLname());
		

	}//main
	}//class





