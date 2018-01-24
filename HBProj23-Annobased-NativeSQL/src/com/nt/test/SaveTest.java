package com.nt.test;
import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;

import com.nt.domain.Student_Details;
import com.nt.util.HibernateUtil;

public class SaveTest {
	public static void main(String[] args) {

		Session session = null;
	
		

		// Activate HB

		// Build Session

		session = HibernateUtil.getSession();
		/*		------- NativeSQL  Queries its not HQL queries but is  db based queries  */
		
		SQLQuery sqlQuery=session.createSQLQuery("select *  from Student_Details ");
		
		List<Student_Details[]>list=sqlQuery.list();
		
		System.out.println("------------xxxxxxx------------------");
		
		
		for(Object sd[]:list)//Can't be caste Student_Details thats why taking data into obj form
		{
			for(Object value:sd){
			
			System.out.println(value+" ");
		
			
			
			}
			System.out.println("...............");
			}
			
		
		// close session
		HibernateUtil.closeSession();
		// close Session Factory
		HibernateUtil.closeSessionFactory();

	}// Main
}// Class
