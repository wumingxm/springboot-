package com.spring.dubbo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.springboot.dubbo.vo.StudentVO;

@Mapper
public interface StudentDao {

	List<StudentVO>findStudentList(StudentVO studentVO);
	
	StudentVO findStudentById(Integer id);

	void addStudent(StudentVO studentVO);

	void updateStudent(StudentVO studentVO);

	void deleteStudent(StudentVO studentVO);

}
