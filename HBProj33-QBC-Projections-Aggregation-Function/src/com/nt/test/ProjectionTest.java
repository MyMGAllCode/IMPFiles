package com.nt.test;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import com.nt.domain.EmpDetails;
import com.nt.util.HibernateUtil;

public class ProjectionTest {
	public static void main(String[] args) {
		Session ses=null;
		
		ses=HibernateUtil.getSession();
	
		Criteria criteria =ses.createCriteria(EmpDetails.class);
		
		// Prpare Projection for Specific Cols 
		
		Projection pj_count=Projections.count("no");
		Projection pj_max=Projections.max("no");
		Projection pj_min=Projections.min("no");
		///Add Projections into Projections list 
		
		ProjectionList pj_list=Projections.projectionList();
		
		pj_list.add(pj_count);
		pj_list.add(pj_max);
		pj_list.add(pj_min);
		
		
		//Add Projection list into Criteria 
		
		criteria.setProjection(pj_list);
		// prepare Criterion obj 
		
		
		
		
		
	
	List<Object []>list=criteria.list();
	
	Object []row=list.get(0);
	System.out.println("No of Records :"+row[0]);
	System.out.println("No of Max  Records :"+row[1]);
	System.out.println("No of Min  Records :"+row[2]);
	
	

}// main
}// class
