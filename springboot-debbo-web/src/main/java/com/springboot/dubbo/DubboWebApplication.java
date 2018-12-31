package com.springboot.dubbo;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.EnableLoadTimeWeaving;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubboConfig;
import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;

@SpringBootApplication
@ServletComponentScan(basePackages= {"com.springboot.servlet","com.springboot.dubbo.filter"})
@EnableDubboConfiguration
public class DubboWebApplication {
	public static void main(String[] args) {
		SpringApplication springApplication = new SpringApplication(DubboWebApplication.class);
		//设置日志
		springApplication.setBannerMode(Banner.Mode.OFF);
		SpringApplication.run(DubboWebApplication.class, args);
	}
}
