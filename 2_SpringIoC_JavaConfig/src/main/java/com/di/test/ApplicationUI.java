package com.di.test;

import com.di.config.AppConfiguration;
import com.di.service.CustomerService;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationUI {

	public static void main(String[] args) {
		
		  AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfiguration.class);
	        CustomerService  customerService = applicationContext.getBean(CustomerService.class);
	       customerService.setCustomerName("Customer  Name: Annotation Based Singletone");
			System.out.println(customerService.getCustomerName());
	       
	       CustomerService  customerService1 = applicationContext.getBean(CustomerService.class);
	       System.out.println(customerService1.getCustomerName());
	       
	       applicationContext.close();

	       
	      }
		
		
	}

