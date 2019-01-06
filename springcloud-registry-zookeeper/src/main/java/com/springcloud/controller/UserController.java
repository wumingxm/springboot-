package com.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springcloud.service.ZookeeperService;

@RestController
public class UserController {
	@Autowired
	private ZookeeperService zookeeperService;
	
	@RequestMapping("getUser")
	public String getUser() {
		return zookeeperService.getUser();
	}
}
