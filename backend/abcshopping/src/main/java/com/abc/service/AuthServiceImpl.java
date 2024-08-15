package com.abc.service;

import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abc.dto.AdminDTO;
import com.abc.dto.CustomerDTO;
import com.abc.dto.UserDTO;
import com.abc.entity.Admin;
import com.abc.entity.Customer;
import com.abc.entity.User;
import com.abc.exception.InvalidLoginException;
import com.abc.exception.ResourceNotFoundException;
import com.abc.repository.UserRepository;

@Service
public class AuthServiceImpl implements AuthService {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private ModelMapper modelMapper;
	
	@Override
	public UserDTO login(String usernameEmail, String password) {
		
		Optional<User> optionalUser = userRepository.findByUsernameOrEmail(usernameEmail,usernameEmail);
		
		if(optionalUser.isEmpty()) {
			throw new ResourceNotFoundException("User not existing");
		}
		
		User user = optionalUser.get();
		
		if(!user.getPassword().equals(password)) {
			throw new InvalidLoginException("Login failed");
		}
		
		UserDTO userDTO = modelMapper.map(user, UserDTO.class);
		return userDTO;
	}

	@Override
	public CustomerDTO registerAsCustomer(CustomerDTO customerDTO) {
		
		Customer customer = modelMapper.map(customerDTO, Customer.class);
		
		customer =userRepository.save(customer);
		
		return modelMapper.map(customer, CustomerDTO.class);
	}

	@Override
	public AdminDTO registerAsAdmin(AdminDTO adminDTO) {
		
		Admin admin = modelMapper.map(adminDTO, Admin.class);
		
		admin = userRepository.save(admin);
		
		return modelMapper.map(admin, AdminDTO.class);
	}

}
