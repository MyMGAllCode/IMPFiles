package com.nt.test;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;

import org.hibernate.Session;
import org.hibernate.jdbc.ReturningWork;

import com.nt.util.HibernateUtil;

public class Test {
	public static void main(String[] args) {
		Session ses=null;
		
		ses=HibernateUtil.getSession();
		
		String result=ses.doReturningWork(new ReturningWork<String>() {
			
		@Override
			public String execute(Connection con) throws SQLException {
				
			String rs=null;
			CallableStatement cs=null;
			cs=con.prepareCall("{call  P_ATHUNTICATE(?,?,?)}");
			
			cs.setString(1, "dkp");
			cs.setString(2, "dkp@12345");
			cs.registerOutParameter(3, Types.VARCHAR);
		// Execute PL/SQL Procedure 
			cs.executeQuery();
			String rslt=null;
			rslt =cs.getString(3);
			return rslt;
			
			
		
	
			}//Execute 
			
		
		}//Inner Class
		
				);// Method Call
		System.out.println(result);


}// main
}// class
