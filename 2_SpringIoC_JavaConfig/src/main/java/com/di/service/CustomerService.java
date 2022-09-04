package com.di.service;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


public class CustomerService implements ICustomerService {

	
	private String customerName;
	
	@Override
	public String getCustomerName() {
		// TODO Auto-generated method stub
		return customerName;
	}

	@Override
	public void setCustomerName(String customerName) {
		this.customerName=customerName;
		
	}

	
	
}
