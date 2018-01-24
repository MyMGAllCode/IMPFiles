package com.nt.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.nt.cid.Programmer_ProjectId;
import com.nt.domain.Programmer_Project;
import com.nt.util.HibernateUtil;

public class Programmer_ProjectDAOImpl implements Programmer_ProjectDAO {

	@Override
	public void save() {
		Session session=null;
		Transaction transaction =null;
		
		Programmer_ProjectId id=null;
		Programmer_Project cid=null;;
		
		//Create Programmer_ProjectId Obj
		
			id=new 	Programmer_ProjectId();
			id.setProgrammerId(222);
			id.setProjectId(333);
			//Create Programmer_Project obj
			
			cid=new Programmer_Project();
			cid.setId(id);
			cid.setProgrammerName("DKP	");
			cid.setProjectName("HB Project ");
			session=HibernateUtil.getSession();
			try{
				
			transaction=session.beginTransaction();
			session.save(cid);
			transaction.commit();
			System.out.println("Record Saved");
			}
			catch(Exception e)
			{
				transaction.rollback();
				System.out.println("Record Not Saved");
			}
			
			
			
		
	}

}
