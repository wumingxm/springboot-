package com.springcloud.service.impl;

import org.springframework.stereotype.Service;

import com.springcloud.service.ZookeeperService;

@Service
public class ZookeeperServiceImpl implements ZookeeperService{

	@Override
	public String getUser() {
		return "张三";
	}

}
