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
		
		Projection pj_no=Projections.property("no");
		Projection pj_mail=Projections.property("mail");
		///Add Projections into Projections list 
		
		ProjectionList pj_list=Projections.projectionList();
		
		pj_list.add(pj_no);
		pj_list.add(pj_mail);
		
		//Add Projection list into Criteria 
		
		criteria.setProjection(pj_list);
		// prepare Criterion obj 
		
		Criterion con=Restrictions.like("mail", "%gmail.com");
		//addd Cond into Criteria 
		
		criteria.add(con);
		
		
		
		
	
	
	List<Object []>list =criteria.list();
	
	
	for(Object row[]:list){
		for(Object val:row)
		System.out.println(val);
		
	}
	

}// main
}// class
