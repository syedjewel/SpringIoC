package com.di.test;

import com.di.config.AppConfiguration;
import com.di.controller.CustomerController;
import com.di.service.CustomerService;
import com.di.service.ICustomerService;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationUI {

	public static void main(String[] args) {
		
		  ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfiguration.class);
	        ICustomerService  icustomerService = applicationContext.getBean(ICustomerService.class);
	       icustomerService.save("Data Save");

	   
	      }
		
		
	}

