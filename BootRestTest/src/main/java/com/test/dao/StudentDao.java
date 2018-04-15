package com.test.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.test.domain.ClassName;
@Repository
public interface StudentDao  extends CrudRepository<ClassName, Long>{
	@Query("SELECT s.id ,s.name, c.classname, c.course from Student s , ClassName c where c.id=s.id and s.id=:id ")
	//public List<Object[]> getStudentInfo(@Param("id") Integer id,Pageable pageable);
	public Page<Object[]> getStudentInfo(@Param("id") Integer id,Pageable pageable);
	
	

}
