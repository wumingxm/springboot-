package com.spring.dubbo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;

@SpringBootApplication
@EnableDubboConfiguration
@MapperScan(basePackages="com.dubbo.dao")
public class DubboProducerApplication {
	public static void main(String[] args) {
		SpringApplication.run(DubboProducerApplication.class, args);
	}
}
