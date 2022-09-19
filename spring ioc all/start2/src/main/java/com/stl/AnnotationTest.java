package com.stl;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationTest {
	
	public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld obj = (HelloWorld) context.getBean("hello");
        obj.setMessage("annotation hello world!!");
        obj.getMessage();
        context.close();
    }
	

}
