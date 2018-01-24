package com.nt.test;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.nt.domain.EmpDetails;
import com.nt.util.HibernateUtil;

public class SaveTest {
	public static void main(String[] args) {

		Session session = null;
		EmpDetails details = null;

		Transaction tx = null;
		Query query = null;

		// Activate HB

		// Build Session

		session = HibernateUtil.getSession();

		/*------- Using Prepare query for getting multiple specified values from every
		// every record using Object Array -------*/
		
		/*query = session.createQuery("select no,fname,mail from EmpDetails where mail like:domain");
		query.setString("domain", "%@gmail.com");

		List<Object[]> list = query.list();
		for (Object[] row : list) {
			for (Object val : row) {

				System.out.println(val);
			}
		}*/
		
		/*------- Retrieving single record form table for every object using string
		array/-------*/

	/*	query = session.createQuery("select mail from EmpDetails");
		List<String> list = query.list();
		for (String emails : list) {
			System.out.println(emails);
		}*/
		/*------- Aggregate  function based select query------- */

/*		query = session.createQuery("select count(*) from EmpDetails");
//In count(*)we can write here any column name in place of * like count(no) Result will be same
		List<Long> listcount = query.list();

		long count = listcount.get(0);
		System.out.println(count);*/
		
/*		------- Executing Non Select Query  Using executeUpdate()   ------- 

		query = session.createQuery("delete from EmpDetails where mail like :domain");

		query.setString("domain", "skp@gmail.com");
		try {

			tx = session.beginTransaction();

			int result = query.executeUpdate();
			if (result != 0)
				System.out.println("Record  Deleted ");
			else
				System.out.println("Record Not found ");
			tx.commit();

		} catch (Exception e) {
			tx.rollback();
			System.out.println("Record Not Deleted " + e.getMessage());

		}*/

		
		/*		------- Named HQL Queries placed query in Mapping file    ------- */
		
		
		query=session.getNamedQuery("GET_EMPDETILS_BY_ID_RANGE");
		query.setInteger("min", 1002);
		query.setInteger("max",1004);
		List<EmpDetails>list=query.list();
		for(EmpDetails ed:list)
		System.out.println(ed);
		

		
		// close session
		HibernateUtil.closeSession();
		// close Session Factory
		HibernateUtil.closeSessionFactory();

	}// Main
}// Class
