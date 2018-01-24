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
	int count=0;

		Transaction tx = null;
		Query query = null,query1=null;
		

		// Activate HB

		// Build Session

		session = HibernateUtil.getSession();
		/*------- Named SQL Queries placed query in Mapping file     ------- */
		
		
		query=session.getNamedQuery("GET_EMP_DETAILS_RANGE");
		query.setInteger("min", 1003);
		query.setInteger("max",1005);
		
		List<EmpDetails>list=query.list();
		for(EmpDetails ed:list){
			System.out.println(ed);
		}
		
		query1=session.getNamedQuery("GET_EMPS_COUNT");
		List<Integer>list1=query1.list();
		
 count=list1.get(0);
 System.out.println("Total Employees are::"+count);
		// close session
		HibernateUtil.closeSession();
		// close Session Factory
		HibernateUtil.closeSessionFactory();

	}// Main
}// Class
