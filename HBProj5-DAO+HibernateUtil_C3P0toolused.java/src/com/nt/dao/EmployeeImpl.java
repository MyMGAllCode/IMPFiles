package com.nt.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.nt.domain.EmpDetail;
import com.nt.util.HibernateUtil;

public class EmployeeImpl implements  EmployeeDAO {

	@Override
	public boolean insertData(int no, String fname, String lname, String mail) {
		Session session=null;
		Transaction tx=null;
		session=HibernateUtil.getSession();
		EmpDetail empDetails=new EmpDetail();
		empDetails.setNo(no);
		empDetails.setFname(fname);
		empDetails.setLname(lname);
		empDetails.setMail(mail);
		session=HibernateUtil.getSession();
		try{
			tx=session.beginTransaction();
			
			session.save(empDetails);
			tx.commit();
			return true;
		}catch(Exception e){ 
			tx.rollback();
			return false;
		}
	}
		
	

	/*@Override
	public EmpDetail retreiveData(int no) {
		Session session=null;
		Transaction tx=null;
		session=HibernateUtil.getSession();
		EmpDetail details=null;
		details=session.get(EmpDetail.class, no);
		
		return details;
	}
*/
	@Override
	public boolean modifyEmail(int no,String newEmail) {
		Session session=null;
		Transaction tx=null;
		session=HibernateUtil.getSession();
		EmpDetail details=null;
		details=session.get(EmpDetail.class, no);
		details.setMail(newEmail);
		try{
		tx=session.beginTransaction();
		
		session.update(details);
		
		tx.commit();
		return true;
		}catch(Exception e)
		{
			tx.rollback();
			return false	;
			
			
		}
		
	}
	/*
	@Override
	public boolean deleteRecord(int no) {
		// TODO Auto-generated method stub
		return false;
	}*/

}
