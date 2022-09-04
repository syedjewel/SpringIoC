package com.di.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service

public class CustomerService implements ICustomerService {

	public void save(String customerName) {
		System.out.println("From Customer Serveice " + customerName);
		
	}
	
}
