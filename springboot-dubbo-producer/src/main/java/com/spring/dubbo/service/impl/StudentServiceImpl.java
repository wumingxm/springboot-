package com.spring.dubbo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Service;
import com.spring.dubbo.dao.StudentDao;
import com.springboot.dubbo.service.StudentService;
import com.springboot.dubbo.vo.StudentVO;

@Service(interfaceClass=StudentService.class)
@Component
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDao studentDao;
	
	@Override
	public List<StudentVO> findStudentList(StudentVO stu) {
	   List<StudentVO> result= studentDao.findStudentList(stu); 
	   return result;
	}

	@Override
	public StudentVO findStudentById(Integer id ) {
	   return studentDao.findStudentById(id);
	}

	@Override
	public void addStudent(StudentVO studentVO) {
		// TODO Auto-generated method stub
		studentDao.addStudent(studentVO);
	}

	@Override
	public void updateStudent(StudentVO studentVO) {
		studentDao.updateStudent(studentVO);
	}

	@Override
	public void deleteStudent(StudentVO studentVO) {
		// TODO Auto-generated method stub
		studentDao.deleteStudent(studentVO);
	}

}
