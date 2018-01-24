package com.nt.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.nt.domain.EmpDetail;
import com.nt.util.MysqlHibernateUtil;
import com.nt.util.OracleHibernateUtil;

public class TranferDAOImpl implements TransferDAO {

	@Override
	public void transferEmployee(int no) {
		Session sesOracle=null;
		Session sesMysl=null;
		Transaction tx=null;
		sesOracle=OracleHibernateUtil.getSession();
		EmpDetail empDetails=new EmpDetail();
		empDetails=(EmpDetail)sesOracle.get(EmpDetail.class,no);
		
		sesMysl=MysqlHibernateUtil.getSession();
		try{
			tx=sesMysl.beginTransaction();
			
			sesMysl.save(empDetails);
			tx.commit();
			System.out.println("Record is saved into MYSQL Successful");

		}catch(Exception e){ 
			tx.rollback();
		System.out.println("Record is saved into MYSQL Failed");
		e.printStackTrace();
		}
		
		MysqlHibernateUtil.closeSession();
		OracleHibernateUtil.closeSession();
	}	

}
