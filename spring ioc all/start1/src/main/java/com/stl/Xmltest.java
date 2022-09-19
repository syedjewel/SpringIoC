package com.stl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Xmltest {
	
	 public static void main(String[] args) {
	        ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
	        HelloWorld obj = (HelloWorld) context.getBean("hello");
	        obj.setMessage("xml hello world!!");
	        obj.getMessage();
	    }

}
