package com.abc.dto;

import java.time.LocalDate;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerDTO {

	private long id;	
	private String customerName;
	private LocalDate dob;
	private String mobile;
	private String email;
	private String city;	
	private Set<OrderDTO> orders;
	
}
