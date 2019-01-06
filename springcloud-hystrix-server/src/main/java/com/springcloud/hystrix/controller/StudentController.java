package com.springcloud.hystrix.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springcloud.service.StudentService;
import com.springcloud.vo.StudentVO;

@RestController
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@RequestMapping("findStudentList")
	public List<StudentVO> findStudentList(StudentVO stu) {
		// TODO Auto-generated method stub
		return studentService.findStudentList(stu); 
	}
}
