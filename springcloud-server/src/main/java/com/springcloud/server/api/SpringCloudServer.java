package com.springcloud.server.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringCloudServer {
	public static void main(String[] args) {
		SpringApplication.run(SpringCloudServer.class, args);
	}
}
