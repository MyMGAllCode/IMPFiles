package com.nt.test;

import java.util.List;

import org.hibernate.Filter;
import org.hibernate.Query;
import org.hibernate.Session;

import com.nt.domain.EmpDetails;
import com.nt.util.HibernateUtil;

public class FilterTest {
	public static void main(String[] args) {
		Session ses=null;
		
		ses=HibernateUtil.getSession();
	Filter filter=ses.enableFilter("FILTER_BY_RANGE");
	
	
	filter.setParameter("min", 1000);
	filter.setParameter("max", 1300);
	Query query=ses.createQuery("from EmpDetails");
	List<EmpDetails>list =query.list();
	for(EmpDetails ed :list)
	System.out.println(ed);

}// main
}// class
