package com.nt.dao;

import java.util.HashSet;
import java.util.Set;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.nt.domain.PhoneNumber;
import com.nt.domain.User;
import com.nt.util.HibernateUtil;

public class OToMDAOImpl implements OToMDAO {

	@Override
	public void saveData() {
		Session ses=null;
		User user=null;
		PhoneNumber phoneNumber1=null;
		Transaction tx=null;
		
		
		user=new User();
		user.setUid(1001);
		user.setUname("Dharmendra");
		phoneNumber1=new PhoneNumber();
		phoneNumber1.setPhoneNumber(999999999);
		phoneNumber1.setOperator("Relince");
		
		PhoneNumber phoneNumber2=new PhoneNumber();
		phoneNumber2.setPhoneNumber(999998888);
		phoneNumber2.setOperator("Aiirtel");
		Set<PhoneNumber>childs=new HashSet<>();
		childs.add(phoneNumber1);
		childs.add(phoneNumber2);
		
		user.setPhone(childs);
		
		/////////////Create Another User And Phone Numbers 
		User user1=null;
		PhoneNumber phoneNumber3=null;
		PhoneNumber phoneNumber4=null;
		
		phoneNumber3=new PhoneNumber();
		phoneNumber3.setPhoneNumber(777777777);
		phoneNumber3.setOperator("Vodaphone");
		
		phoneNumber4=new PhoneNumber();
		phoneNumber4.setPhoneNumber(666666666);
		phoneNumber4.setOperator("Telenor");
		Set<PhoneNumber>childs2=new HashSet<>();
		childs2.add(phoneNumber3);childs2.add(phoneNumber4);
		user1=new User();
		user1.setUid(1002);
		user1.setUname("Suresh");
		user1.setPhone(childs2);
		ses=HibernateUtil.getSession();
		
		
		try{
			tx=ses.beginTransaction();
			ses.save(user);
			ses.save(user1);
			tx.commit();
			System.out.println("Data is saved successfully");
		}
		catch (Exception e) {
			tx.rollback();
			System.out.println("Data is  not saved ");
			
		}

		
	
		
		
		
	}

}
