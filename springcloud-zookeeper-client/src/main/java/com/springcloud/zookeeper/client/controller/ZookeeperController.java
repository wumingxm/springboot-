package com.springcloud.zookeeper.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springcloud.zookeeper.client.inteface.ZookeeperService;

@RestController
public class ZookeeperController {
	@Autowired
	private ZookeeperService zookeeperService;
	@RequestMapping("/getUser")
	
	public String getUser() {
		return zookeeperService.getUser();
	}
}
