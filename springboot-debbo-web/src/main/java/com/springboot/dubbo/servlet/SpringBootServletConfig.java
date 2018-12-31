package com.springboot.dubbo.servlet;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@SuppressWarnings("unchecked")
public class SpringBootServletConfig {
	
	@Bean
	public ServletRegistrationBean studentRegistBean() {
		return new ServletRegistrationBean(new UserServlet(),"/getUser");
	}
}
