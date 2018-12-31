package com.springboot.dubbo.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.springboot.dubbo.service.StudentService;
import com.springboot.dubbo.vo.StudentVO;

@RestController
public class StudentController {
	@Reference
	private StudentService studentService;
	
	@RequestMapping("findStudentList")
	 List<StudentVO> findStudentList(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
		List<StudentVO>result = studentService.findStudentList(new StudentVO());
		return result;
	}
}
