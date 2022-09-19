package com.stl.service;

import org.springframework.stereotype.Service;

@Service
public class CustomerService implements ICustomerService {

	public void save(String customername) {
		System.out.println("save--->>"+customername);
		
	}

}
