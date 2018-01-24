package com.nt.test;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;


import com.nt.util.HibernateUtil;

public class SaveTest {
	public static void main(String[] args) {

		Session session = null;
	int count=0;

		Transaction tx = null;
		Query query = null;
		

		// Activate HB

		// Build Session

		session = HibernateUtil.getSession();
		/*		------- Named HQL Queries placed query in Mapping file  Copied Data from one Table to Another Table by HQL using Insert    ------- */
		
		
		query=session.getNamedQuery("COPY_EMP_TO_NGO");
		query.setInteger("min", 1003);
		query.setInteger("max",1005);
		try{
			tx=session.beginTransaction();
			count=query.executeUpdate();
			tx.commit();
			
				System.out.println("Data Copied ");
		}
		catch(Exception E)
		{
			tx.rollback();
			System.out.println("Data Not Copied ");
		}
		// close session
		HibernateUtil.closeSession();
		// close Session Factory
		HibernateUtil.closeSessionFactory();

	}// Main
}// Class
