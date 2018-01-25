package com.nt.test;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.nt.domain.Person;
import com.nt.util.HibernateUtil;

public class ComponentRetreiveData {
	public static void main(String[] args) {
		Session ses=null;
		Transaction tx=null;
		
		// Get Session 
		ses=HibernateUtil.getSession();
		
		Query query=ses.createQuery("from Person  where pjob.department=:dept");
		query.setParameter("dept", 10002);
		List<Person>list=query.list();
		for(Person p:list){
			System.out.println(p);
		}
		
				
		
	}

}
