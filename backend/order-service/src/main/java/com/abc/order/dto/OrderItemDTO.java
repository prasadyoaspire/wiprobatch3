package com.abc.order.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderItemDTO {

	private long id;
	private double itemTotal;
	private int quantity;
	private long productId;
}
