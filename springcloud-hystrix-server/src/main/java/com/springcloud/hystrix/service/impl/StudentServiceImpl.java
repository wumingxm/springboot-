package com.springcloud.hystrix.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springcloud.hystrix.dao.StudentDao;
import com.springcloud.service.StudentService;
import com.springcloud.vo.StudentVO;
@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDao studentDao;
	
	public List<StudentVO> findStudentList(StudentVO stu) {
		// TODO Auto-generated method stub
		return studentDao.findStudentList(stu); 
	}

	public  StudentVO findStudentById(Integer id) {
		return studentDao.findStudentById(id);
	}

	public void addStudent(StudentVO studentVO) {
		// TODO Auto-generated method stub
		studentDao.addStudent(studentVO);
	}

	public void updateStudent(StudentVO studentVO) {
		// TODO Auto-generated method stub
		studentDao.updateStudent(studentVO);
	}

	public void deleteStudent(StudentVO studentVO) {
		// TODO Auto-generated method stub
		
	}

	

}
