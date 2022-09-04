package com.di.service;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
public class CustomerService implements ICustomerService {

	private String customerAddress;

	public String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	public void save(String customerName) {
		System.out.println(customerName);
		
	}
	
}
