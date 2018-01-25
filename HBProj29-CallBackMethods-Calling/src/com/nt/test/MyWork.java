package com.nt.test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.hibernate.jdbc.Work;

public class MyWork implements Work{

	@Override
	public void execute(Connection connection) throws SQLException {
		

		PreparedStatement ps=connection.prepareStatement("select * from employee");
	ResultSet rs=ps.executeQuery();
	
	while(rs.next())
		System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getInt(5));
	
	
		
	}
	
		
		
		
	}

	

