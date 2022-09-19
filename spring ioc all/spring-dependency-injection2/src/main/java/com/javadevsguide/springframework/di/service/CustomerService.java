package com.javadevsguide.springframework.di.service;

import org.springframework.stereotype.Service;

@Service
public class CustomerService implements ICustomerService {

	public void save(String customerName) {
		System.out.println(customerName);

	}

}
