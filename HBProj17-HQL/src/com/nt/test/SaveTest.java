package com.nt.test;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.nt.domain.EmpDetails;
import com.nt.util.HibernateUtil;


public class SaveTest {
	public static void main(String[] args) {
		
		Session session=null;
		EmpDetails details=null;
		
		Transaction tx=null;
		Query query=null;
		
		// Activate HB 
		
		
		
		// Build Session 
		
		session=HibernateUtil.getSession();
		
		//query=session.createQuery("from EmpDetails");
		
		query=session.createQuery(" from  EmpDetails where no=10001)");
		List<EmpDetails>list=query.list();
		
		for(EmpDetails ed:list)
		{
			
			System.out.println(ed);
			
			
		}
		
	
	
		//close session
		HibernateUtil.closeSession();
		// close Session Factory
		HibernateUtil.closeSessionFactory();
		
	}// Main
}//Class
