package com.stl;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class Beantest {

	public static void main(String[] args) {

		XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("application-context.xml"));
		HelloWorld obj = (HelloWorld) factory.getBean("hello");

		obj.setMessage("bean factory--- hello world!!");
		obj.getMessage();
	}

}
