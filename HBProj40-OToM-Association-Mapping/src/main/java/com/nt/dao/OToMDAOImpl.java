package com.nt.dao;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.nt.domain.PhoneNumber;
import com.nt.domain.User;
import com.nt.util.HibernateUtil;

public class OToMDAOImpl implements OToMDAO {

	@Override
	public void saveData() {
		Session ses = null;
		User user = null;
		PhoneNumber phoneNumber1 = null;
		Transaction tx = null;

		user = new User();
		user.setUserId(1001);
		user.setUname("Dharmendra");
		phoneNumber1 = new PhoneNumber();
		phoneNumber1.setPhoneNumber(999999999);
		phoneNumber1.setOperator("Relince");

		PhoneNumber phoneNumber2 = new PhoneNumber();
		phoneNumber2.setPhoneNumber(999998888);
		phoneNumber2.setOperator("Aiirtel");
		Set<PhoneNumber> childs = new HashSet<>();
		childs.add(phoneNumber1);
		childs.add(phoneNumber2);

		user.setPhone(childs);

		///////////// Create Another User And Phone Numbers
		User user1 = null;
		PhoneNumber phoneNumber3 = null;
		PhoneNumber phoneNumber4 = null;

		phoneNumber3 = new PhoneNumber();
		phoneNumber3.setPhoneNumber(777777777);
		phoneNumber3.setOperator("Vodaphone");

		phoneNumber4 = new PhoneNumber();
		phoneNumber4.setPhoneNumber(666666666);
		phoneNumber4.setOperator("Telenor");
		Set<PhoneNumber> childs2 = new HashSet<>();
		childs2.add(phoneNumber3);
		childs2.add(phoneNumber4);
		user1 = new User();
		user1.setUserId(1003);
		user1.setUname("Suresh");
		user1.setPhone(childs2);
		ses = HibernateUtil.getSession();
		///////////// Save The data

		/*
		 * try{ tx=ses.beginTransaction(); ses.save(user); ses.save(user1);
		 * tx.commit(); System.out.println("Data is saved successfully"); }
		 * catch (Exception e) { tx.rollback();
		 * System.out.println("Data is  not saved ");
		 * 
		 * }
		 */

	}

	/////// Load the data  and display the data 
	@Override
	public void loadData() {
		// Get Session

		Session ses = HibernateUtil.getSession();

		Query query = ses.createQuery("FROM User");

		List<User> list = null;
		Set<PhoneNumber> phone = null;
		list = query.list();
		for (User u : list) {
			System.out.println("Users are " + u);
			// Getting phones for for a particular user Id
			phone = u.getPhone();
			for (PhoneNumber ph : phone) {
				System.out.println("Phones " + ph);
			}

		}

	}

	@Override
	public void addNewPhoneNumberToExistingUser() {
		Session ses=HibernateUtil.getSession();
	User user=ses.get(User.class, 1001);
		Set<PhoneNumber>phone=user.getPhone();
		PhoneNumber ph=new PhoneNumber();
		PhoneNumber ph1=new PhoneNumber();
		ph.setPhoneNumber(77775555);ph.setOperator("Telenor");
		ph1.setPhoneNumber(77774444);ph1.setOperator("Idea");
		
		Transaction tx=null;
		try{
			tx=ses.beginTransaction();
			phone.add(ph);phone.add(ph1);
		tx.commit();
		System.out.println("Phone nos. are saved in :"+user.getUserId());
		}
		catch(Exception e){
			tx.rollback();
		}
		
	}

	@Override
	public void deleteUserMobileAndUser() {
		Session ses=HibernateUtil.getSession();
		User user=ses.get(User.class, 1003);
		Set<PhoneNumber>child =null;
		child=user.getPhone();
		PhoneNumber ph=ses.get(PhoneNumber.class, (long)666666666);
		Transaction tx=null;
		try{
			tx=ses.beginTransaction();
			child.remove(ph);
			tx.commit();
			System.out.println("Data  Deleted  for ");
		}catch(Exception E)
		{System.out.println("Data Not Deleted  for ");
		
			tx.rollback();
		}
				
		
				
		
		
		
	}

}
