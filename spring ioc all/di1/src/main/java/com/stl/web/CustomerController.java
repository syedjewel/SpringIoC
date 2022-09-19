package com.stl.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.stl.service.ICustomerService;

@Component
public class CustomerController {

	@Autowired
	private ICustomerService iCustomerService;
	
	
	public void saveCustomer() {
		
		iCustomerService.save("masum");
	}

}
