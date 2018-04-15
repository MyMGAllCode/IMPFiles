package com.test.service;

import java.util.List;

import com.test.dto.StudentDto;

public interface StudentService {
	public List<StudentDto> getStudentInfoDTO(Integer id);
	

}
