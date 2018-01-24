package com.nt.test;

import java.util.Iterator;
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
		
		
		/*
		query=session.createQuery("from EmpDetails where lname in (?,?,:community)"); //HB HQL Style
		query.setString(0, "singh");
		query.setString(1, "Prajapati");
		query.setString("community", "kumar");*/
		
		/*query=session.createQuery("from EmpDetails where mail like ?1");//JPA Style
		query.setString("1", "%gmail.com");
		*/
		//List<EmpDetails>list=query.list();
		
		
	
		
		
		/*//UsingIterator 
		 * 
		 * 

		Iterator<EmpDetails> iterator = query.iterate();
		
		
		while(iterator.hasNext())
		{
			EmpDetails ed=iterator.next();
			System.out.println(ed);
			
			
		}*/
		// Using Prepare query with sub Query
		query=session.createQuery("from EmpDetails where no=(select max(no) from EmpDetails)"); //HB HQL Style
		
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
