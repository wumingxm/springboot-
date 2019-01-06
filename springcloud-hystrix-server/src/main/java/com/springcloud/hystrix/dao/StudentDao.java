package com.springcloud.hystrix.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.springcloud.vo.StudentVO;

@Mapper
public interface StudentDao {

	List<StudentVO>findStudentList(StudentVO studentVO);
	
	StudentVO findStudentById(Integer id);

	void addStudent(StudentVO studentVO);

	void updateStudent(StudentVO studentVO);

	void deleteStudent(StudentVO studentVO);

}
