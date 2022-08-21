package com.di.service;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
public class CustomerService implements ICustomerService {

	private String scopeName;

	public void save(String customerName) {
		System.out.println(customerName);
		
	}

	public String getScopeName() {
		return scopeName;
	}

	public void setScopeName(String scopeName) {
		this.scopeName = scopeName;
	}

	
}
