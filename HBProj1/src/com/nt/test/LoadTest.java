	package com.nt.test;
	import org.hibernate.Session;
	import org.hibernate.SessionFactory;

	import org.hibernate.cfg.Configuration;

	import com.nt.domain.EmpDetails;

public class LoadTest {
		public static void main(String[] args) {
			Configuration cfg=null ;
			SessionFactory factory=null;
			Session ses=null;
			EmpDetails details=null;
		
			// Activate HB 
			cfg=new Configuration();
			
			// Read both file CFG and Mapping file
			cfg=cfg.configure("/com/nt/cfgs/hibernate.cfg.xml");
			
			// Build Session Factory 
		
			factory=cfg.buildSessionFactory();
			
			// Build Session 
			ses=factory.openSession();
			
			
		
			details=ses.load(EmpDetails.class, 1006);
			
			System.out.println("----------------------------------------");
			System.out.println(details);//Object not found exception
			System.out.println("A Proxy Object will be load  that exit in database or not ");
			
			System.out.println("----------------------------------------");
			
		
			
			
				
			System.out.println("Details of Employeeis"+details.getNo()+","+details.getFname()+""+details.getLname()+""+details.getMail());
			
			
			//close session
			ses.close();
			// close Session Factory
			factory.close();
		}// Main
	}//Class


