package com.nt.test;







	import org.hibernate.Session;
	import org.hibernate.SessionFactory;
	import org.hibernate.Transaction;
	import org.hibernate.cfg.Configuration;

	import com.nt.domain.EmpDetails;



	public class DeleteObject {
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
		/*Approach1 Without loading object  
		details=new EmpDetails();
		details.setNo(1003);
		 try{
			 
			 tx=ses.beginTransaction();
			
			 ses.delete(details);//This is optional
			 System.out.println("Object Deleted");
		tx.commit();	 
		 }catch(Exception ex){
			 tx.rollback();
			 System.out.println("Object Not Deleted");
		 }
			*/
		
		/*Approach2 loading object  */
	details=ses.get(EmpDetails.class, 1003);
	 
	if(details!=null)
	{
	 try{
		 
		 tx=ses.beginTransaction();
		 
		 ses.delete(details);//This is optional 
		 System.out.println("Object Deleted");
	tx.commit();	 
	 }catch(Exception ex){
		 tx.rollback();
	 }
	
	}//if
	else
		System.out.println("Object Not Found");
	}//main
	}//class




