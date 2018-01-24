/*Approach1 */
package com.nt.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.nt.domain.EmpDetails;

public class UpdateTest {
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
 details =new EmpDetails();
 details.setNo(1004);
 details.setFname("Sursh");
 try{
	 tx=ses.beginTransaction();
	 ses.update(details);
tx.commit();	 
 }catch(Exception ex){
	 tx.rollback();
 }
	
	
}}
