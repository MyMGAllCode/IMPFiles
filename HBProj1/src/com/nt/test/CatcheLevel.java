package com.nt.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.nt.domain.EmpDetails;

public class CatcheLevel {
	public static void main(String[] args) {

		Configuration cfg = null;
		SessionFactory factory = null;
		Session ses = null;
		EmpDetails details = null;
		Transaction tx = null;

		/// Activate HB FW

		cfg = new Configuration();

		// Read Both cfg and mapping file
		cfg = cfg.configure("/com/nt/cfgs/hibernate.cfg.xml");

		// Build SessionFactory
		factory = cfg.buildSessionFactory();
		// Build Session
		ses = factory.openSession();

	
		details = (EmpDetails) ses.get(EmpDetails.class, 1005);
		System.out.println(details.getFname());

		// Remove perticular Object from Cache
		ses.evict(details);
		
	details=(EmpDetails)ses.get(EmpDetails.class, 1005);
	//Clear All Cache Memory of the browser 
	ses.clear();
	System.out.println(details.getFname());

		try {

			tx = ses.beginTransaction();

			
		} // try
		catch (Exception ex) {
			tx.rollback();
		}

	}// main
}// class
