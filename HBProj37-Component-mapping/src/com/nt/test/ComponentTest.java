package com.nt.test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.nt.domain.JobType;
import com.nt.domain.Person;
import com.nt.util.HibernateUtil;

public class ComponentTest {
	public static void main(String[] args) {
		Session ses=null;
		Transaction tx=null;
		JobType jtype=new JobType();
		Person person=new Person();
		jtype.setJob("Clerk");
		jtype.setDepartment(10001);
		jtype.setSalary(50000);
		person.setPid(11111);
		person.setPjob(jtype);
		person.setPname("Dharmendra");
		ses=HibernateUtil.getSession();
		tx=ses.beginTransaction();
		try{
			ses.save(person);
			tx.commit();
			System.out.println("Record Has Saved Successfullys");
		}//try
		catch(Exception e){
			
	tx.rollback();
	System.out.println("Record Not Saved ");
		
		
	}
	}//Main
}//Class
