package com.nt.test;


	import org.hibernate.Session;
	import org.hibernate.SessionFactory;

	import org.hibernate.cfg.Configuration;

	import com.nt.domain.EmpDetails;

	public class GetTest {
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
			
			// Prepare object for Domain Class having Data
			/*details=new EmpDetails();	details.setNo(1005);details.setFname("Dharmendra");details.setLname("Kumar Prajapati");details.setMail("dkp@gmail.com");
			mrks=new Marks();
			mrks.setSid(1005);mrks.setSubm1(95);mrks.setSubm2(85);mrks.setSubm3(88);
	*/
			// 
		// Save Obj using ses.persist(-)
			details=ses.get(EmpDetails.class, 1010);
			
			System.out.println("----------------------------------------");
			System.out.println(details);
			
			System.out.println("----------------------------------------");
			if(details!=null)
			{
		
			
			try{
				
			System.out.println("Details of Employeeis"+details.getNo()+","+details.getFname()+""+details.getLname()+""+details.getMail());
			}catch(Exception ex)
			{
				
				System.out.println("Some Exception Occurs:"+ex.toString());
			}
			}
			else 
				System.out.println("Object Not Found");
			//close session
			ses.close();
			// close Session Factory
			factory.close();
		}// Main
	}//Class




