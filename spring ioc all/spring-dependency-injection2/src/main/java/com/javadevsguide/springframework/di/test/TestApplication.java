package com.javadevsguide.springframework.di.test;

import org.springframework.context.ApplicationContext;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.javadevsguide.springframework.di.config.AppConfiguration;
import com.javadevsguide.springframework.di.field.CustomerController;

public class TestApplication {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfiguration.class);
		CustomerController  customerController = applicationContext.getBean(CustomerController.class);
		customerController.processMsg("save Customer ");
	}
}
