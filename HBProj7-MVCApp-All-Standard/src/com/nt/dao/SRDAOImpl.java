package com.nt.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.nt.bo.StudentBO;
import com.nt.util.HibernateUtil;

public class SRDAOImpl implements SRDAO {

	@Override
	public int insert(StudentBO srBO) {
		Session session=null;
		Transaction tx=null;
		int count=0;
		session=HibernateUtil.getSession();
		try{
			tx=session.beginTransaction();
			session.save(srBO);
			tx.commit();
			
			count=1;
		}//try
		catch(Exception e){
			tx.rollback();
			return count;
			
		}//catch
	
		
	HibernateUtil.closeSession();
	//HibernateUtil.closeSessionFaactory();
	return count;
		
		
		
		
		
	}//method
	

}
