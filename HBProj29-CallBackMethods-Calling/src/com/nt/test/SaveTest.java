package com.nt.test;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.jdbc.ReturningWork;
import org.hibernate.jdbc.Work;

import com.nt.util.HibernateUtil;

public class SaveTest {
	public static void main(String[] args) {

		Session session = null;
	int count=0;

		Transaction tx = null;
		Query query = null;
		

		// Activate HB  Build Session 
		
		session = HibernateUtil.getSession();
		/*------- Using CallBacks Methods doWork without Annonymous Class      ------- */
		session.doWork(new MyWork());
		/*------- Using CallBacks Methods doReturningWork withAnnonymous Class      ------- */
int result= session.doReturningWork(new ReturningWork<Integer>() {

	@Override
	public Integer execute(Connection con) throws SQLException {
		int count=0;
		PreparedStatement ps=con.prepareStatement("insert into employee values(?,?,?,?,?)");
		ps.setInt(1, 5556);
		ps.setString(2, "DkpCallBack");
		ps.setString(3, "Prajapati");
		ps.setString(4, "dkp@gmail.com");
		ps.setInt(5, 5);
		
		count =ps.executeUpdate();
		return count;
	}
});
			
		
		if(result==1)
			System.out.println("Record Has Successfully inserted ");
		else 
			System.out.println("Record not Inserted ");
			
			
			
			
			
	
		
		
		
		
		
		
		
		
		
		
		// close session
		HibernateUtil.closeSession();
		// close Session Factory
		HibernateUtil.closeSessionFactory();

	}// Main
}// Class
