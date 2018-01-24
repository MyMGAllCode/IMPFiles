package com.nt.service;

import com.nt.bo.StudentBO;
import com.nt.dao.SRDAO;
import com.nt.dao.SRDAOFactory;
import com.nt.dto.StudentDTO;

public class StudentService {
	
	
	
	
	public String getResult(StudentDTO dto){
		 
		 int total=0;
		 float avg=0.0f;
		 String result=null;
		 SRDAO srdo=null;
		StudentBO bo=null;

		total=(dto.getM1())+( dto.getM2())+(dto.getM3());
		avg=total/3.0f;
		if(avg<45){
			result="Fail";
		
		}
		else 
			result="Pass";
		 
		bo=new StudentBO();
		bo.setSno(dto.getSno());
		bo.setSname(dto.getSname());
		bo.setTotal(total);
		bo.setAverage(avg);
		bo.setResult(result);
		srdo=SRDAOFactory.getInstance();
			int count =0;
			count =srdo.insert(bo);
			if(count==1)
				return result+"Student Registration Successfull";
			else 
				return result+"Student Registration Fail";

		
		
		
	}

}
