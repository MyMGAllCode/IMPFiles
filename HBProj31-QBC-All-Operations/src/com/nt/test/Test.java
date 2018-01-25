package com.nt.test;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import com.nt.domain.EmpDetails;
import com.nt.util.HibernateUtil;

public class Test {
	public static void main(String[] args) {
		Session ses=null;
		
		ses=HibernateUtil.getSession();
	
		Criteria criteria =ses.createCriteria(EmpDetails.class);
		
		//QBC logics With Conditions 
		
	/*Criterion con=Restrictions.between("no", 1000, 2000);
	criteria.add(con);*/
		
		// QBC logic with multiple conditions 
		
		/*Criterion con1=Restrictions.ge("no", 1000);
		
		Criterion con2=Restrictions.le("no", 1000);
		Criterion con3=Restrictions.ilike("mail" ,"%gmail.com");
		//Prepare AND condition
		Criterion andCon=Restrictions.and(con1, con2);
		//Prepare Or condition

		Criterion orCon=Restrictions.or(andCon ,con3);
		
		// Add final condition tofinal criteria Obj
		
		criteria.add(orCon);*/
		
		// QBC logics with Conditions and Orders 
		
		// Prepare Condition
		/*Criterion con=Restrictions.in("lname", new String[]{"kumar","Prajapati"});
		//Add Conditions 
		criteria.add(con);
		Order order=Order.desc("lname");
		//Add Order 
		criteria.addOrder(order);
		*/
		// QBC logic With SQL condition based criteria object 
		
		/*//Prepare condition
		Criterion con=Restrictions.sqlRestriction("lastname like 'kumar' ");
		// Add criteria 
		criteria.add(con);
*/
	

		
	
	
	List<EmpDetails>list =criteria.list();
	
	
	for(EmpDetails ed:list){
		System.out.println(ed);
		
	}
	

}// main
}// class
