package com.abc.order.service;

import org.springframework.stereotype.Component;

import com.abc.order.dto.CustomerDTO;
import com.abc.order.exception.ResourceNotFoundException;

@Component
public class CustomerApiCallBack implements CustomerApiClient {

	@Override
	public CustomerDTO getCustomerDetails(long customerId) {
		System.out.println("customer service is not available");
		return new CustomerDTO();		
	}

}
