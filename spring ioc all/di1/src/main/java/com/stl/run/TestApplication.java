package com.stl.run;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.stl.mi.AppConfiguration;
import com.stl.web.CustomerController;

public class TestApplication {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfiguration.class);
		CustomerController  cc = applicationContext.getBean(CustomerController.class);
		cc.saveCustomer();
	}
}
