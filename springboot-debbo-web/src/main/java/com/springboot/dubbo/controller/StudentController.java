package com.springboot.dubbo.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.dubbo.common.json.JSONObject;
import com.alibaba.dubbo.config.annotation.Reference;
import com.springboot.dubbo.service.StudentService;
import com.springboot.dubbo.vo.StudentVO;

@Controller
public class StudentController {
	@Reference
	private StudentService studentService;
	@RequestMapping("findStudentList")
	public	ModelAndView findStudentList (ModelAndView modelAndView) {
		List<StudentVO> result = studentService.findStudentList(new StudentVO());
	 	modelAndView.addObject("students", result);
	 	JSONObject  header = new JSONObject();
	 	header.put("sname", "姓名");
	 	header.put("id", "学号");
	 	header.put("sage", "年龄");
	 	header.put("ssex", "性别");
	 	modelAndView.addObject("header",header);
		modelAndView.setViewName( "studentManagement");
	 	return  modelAndView;
	}
	@RequestMapping("findStudents")
	public	ModelAndView findStudents (ModelAndView modelAndView) {
		modelAndView.setViewName( "/jsp/studentManagement.jsp");
	 	return  modelAndView;
	}
}
