package com.di.controller;

import com.di.service.ICustomerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CustomerController {
	
	//@Autowired
	private ICustomerService iCustomerService;
	
	
	/*
	 * @Autowired public void setiCustomerService(ICustomerService iCustomerService)
	 * { this.iCustomerService = iCustomerService; }
	 */


	@Autowired
	
	public CustomerController(ICustomerService iCustomerService) {
		super();
		this.iCustomerService = iCustomerService;
	}
	

	public void saveData(String customerName) {
		
		iCustomerService.save(customerName);
	}
	



}
