package com.springcloud.server.api.controller;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableDiscoveryClient
public class UserController{
	@Value(value="${server.port}")
	private int port;
	@RequestMapping("/getUser")
	String getUser() {
		return "hellworld Eureka!"+port;
	}
	
}