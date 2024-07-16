package com.abc.service;

import java.util.Set;

import com.abc.dto.CustomerDTO;


public interface CustomerService {

	CustomerDTO saveCustomer(CustomerDTO customer);
	
	CustomerDTO findCustomerById(long customerId);
	
	Set<CustomerDTO> findAllCustomers();
}
