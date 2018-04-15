package com.test.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.test.dao.StudentDao;
import com.test.dto.StudentDto;

@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	StudentDao stddao;
	@Override
	public List<StudentDto> getStudentInfoDTO(Integer id) {
		List<Object[]>ist=new ArrayList<Object[]>();
		List<StudentDto>stdDTOList=new ArrayList<StudentDto>();
		System.out.println("id:"+id);
		Pageable topTen=new PageRequest(3, 3);
	
		Page<Object[]>list=stddao.getStudentInfo(id,topTen);
		System.out.println("list"+list);
		for(Object[] obj:list)
		{StudentDto sdto=new StudentDto();
		sdto.setId((int) obj[0]);
		sdto.setName((String) obj[1]);
		sdto.setClassname((String) obj[2]);
		sdto.setCourse((String) obj[3]);
		stdDTOList.add(sdto);
		}
		System.out.println("Class list is :"+stdDTOList.size());
		
		return stdDTOList;
	}

}
