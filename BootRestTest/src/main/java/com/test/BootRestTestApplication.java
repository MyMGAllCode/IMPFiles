package com.test;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.test.dto.StudentDto;
import com.test.service.StudentService;

@SpringBootApplication
public class BootRestTestApplication {

	public static void main(String[] args) throws SQLException {
		ApplicationContext cxt=SpringApplication.run(BootRestTestApplication.class, args);
		DataSource ds=(DataSource) cxt.getBean(DataSource.class);
		Connection con=ds.getConnection();
		DatabaseMetaData dbm=con.getMetaData();
		System.out.println("dbm:"+dbm.getDatabaseProductName());
		StudentService Sservicr=cxt.getBean(StudentService.class);
		List<StudentDto>list = Sservicr.getStudentInfoDTO(1);
		for(StudentDto sd:list)
		{
		System.out.println(sd.getId()+sd.getName()+sd.getClassname()+sd.getCourse());
		}
		
		
	}
}
