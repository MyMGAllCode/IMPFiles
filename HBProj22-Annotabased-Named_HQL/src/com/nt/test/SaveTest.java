package com.nt.test;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import com.nt.domain.Student_Details;
import com.nt.util.HibernateUtil;

public class SaveTest {
	public static void main(String[] args) {

		Session session = null;
	
		Query query1 = null,query2=null;
		

		// Activate HB

		// Build Session

		session = HibernateUtil.getSession();
		/*		------- Named HQL Queries placed query in Mapping file  Copied Data from one Table to Another Table by HQL using Insert    ------- */
		
		
		query1=session.getNamedQuery("GET_STUDENT_BY_RANGE");
		
		query1.setInteger("min", 1003);
		query1.setInteger("max",1005);
		
		List<Student_Details>list=query1.list();
		System.out.println("------------xxxxxxx------------------");
		for(Student_Details sd:list)
		{
			
			System.out.println(sd.getSid()+" "+sd.getSname()+" "+sd.getSaddrs()+" "+sd.getEmail());
			System.out.println("...............");
		}
		
		// close session
		HibernateUtil.closeSession();
		// close Session Factory
		HibernateUtil.closeSessionFactory();

	}// Main
}// Class
