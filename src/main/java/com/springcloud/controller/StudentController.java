package com.springcloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.springcloud.service.FeignClientService;
import com.springcloud.vo.StudentVO;

@RestController
public class StudentController {
	
	@Autowired
	@Qualifier("restTemplate")
	private RestTemplate restTemplate;
	
	@Autowired
	private FeignClientService clientService;
	
	@SuppressWarnings("unchecked")
	@RequestMapping("findStudentList")
	public List<StudentVO> findStudentList(StudentVO stu){
		for(int i=100;i<10;i++) {
			System.out.println("we are very happy");
		}
		StudentVO student = new StudentVO();
		System.out.println("display bug");
		//StudentVO student = new StudentVO();
		//System.out.println("display bug");
		return restTemplate.getForEntity("http://springcloud-server-hystrix/findStudentList",List.class,student).getBody();
	}
	
	
	@RequestMapping("test")
	public List<StudentVO> test(StudentVO stu){
		return  clientService.findStudentList(stu);
	}
}
