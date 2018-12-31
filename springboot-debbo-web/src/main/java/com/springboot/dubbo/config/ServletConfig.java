package com.springboot.dubbo.config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.springboot.dubbo.filter.UserFilter;
import com.springboot.dubbo.servlet.StudentServlet;

@Configuration
@SuppressWarnings(value = { "unchecked"})
public class ServletConfig {
	@Bean
	public ServletRegistrationBean getRegistraionBean() {
		@SuppressWarnings("unchecked")
		ServletRegistrationBean registration  = new ServletRegistrationBean(new StudentServlet(),"/studentServlet");
		return registration;
	}
	@Bean
	public FilterRegistrationBean getFilterRegistraionBean() {
		@SuppressWarnings("unchecked")
		FilterRegistrationBean registration  = new FilterRegistrationBean(new UserFilter());
		registration.addUrlPatterns("/user");
		return registration;
	}
}
