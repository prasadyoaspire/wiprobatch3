package com.abc.entity;

import java.time.LocalDate;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
//@Table(name="customer_tbl")
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;	
	@Column(name="customer_name")	
	private String customerName;
	private LocalDate dob;
	private String mobile;
	private String email;
	private String city;
	
	@OneToMany(mappedBy = "customer")
	private Set<Order> orders;	
	
}
