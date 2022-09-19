package com.javadevsguide.springframework.di.field;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.javadevsguide.springframework.di.service.ICustomerService;

@Component
public class CustomerController {
	
	    @Autowired
		private ICustomerService iCustomerService;

		public void processMsg(String customerName) {
			iCustomerService.save(customerName);
		}
}
