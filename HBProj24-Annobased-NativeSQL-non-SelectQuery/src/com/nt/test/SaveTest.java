package com.nt.test;
import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.nt.domain.Student_Details;
import com.nt.util.HibernateUtil;

public class SaveTest {
	public static void main(String[] args) {

		Session session = null;
		Transaction tx=null;
		SQLQuery query=null;
		session=HibernateUtil.getSession();
		
		query=session.createSQLQuery("INSERT INTO STUDENT_DETAILS VALUES(:sid,:sname,:email,:saddrs )");
		query.setInteger("sid",1008);

		query.setString("sname","SK");
		
		query.setString("email", "sk@gmail.com");
		query.setString("saddrs", "BHOPAL");
		try{
			tx=session.beginTransaction();
		int count=	query.executeUpdate();
		tx.commit();
		System.out.println("Student Record Inserted Successfully");
		}
		catch(Exception e)
		{
			tx.rollback();
			System.out.println("Record Not Inserted ");
		}
		
		
		

			
		
		// close session
		HibernateUtil.closeSession();
		// close Session Factory
		HibernateUtil.closeSessionFactory();

	}// Main
}// Class
