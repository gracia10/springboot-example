package com.community.config;

import org.h2.server.web.WebServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// 빈을 통해 H2 콘솔 사용하기(수동설정)

@Configuration
public class DataSourceConfig {
	
	@Bean
	public ServletRegistrationBean h2servletRegisteration() {
		ServletRegistrationBean registerBean = new ServletRegistrationBean(new WebServlet());
		registerBean.addUrlMappings("/console/*");
		return registerBean;
	}
}
