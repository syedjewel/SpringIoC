package com.di.config;

import com.di.service.CustomerService;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;



@Configuration
@ComponentScan(basePackages={"com.di.controller","com.di.test","com.di.config"})
public class AppConfiguration {

	@Bean
	//@Scope("singletone")
	@Scope("prototype")
	public CustomerService customerService() {
		return new CustomerService();
	}

}
