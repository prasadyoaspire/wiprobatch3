package com.abc.order.service;

import java.time.LocalDate;
import java.util.Set;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.abc.order.dto.OrderDTO;
import com.abc.order.dto.OrderItemDTO;
import com.abc.order.dto.ProductDTO;
import com.abc.order.entity.Order;
import com.abc.order.entity.OrderItem;
import com.abc.order.repository.OrderItemRepository;
import com.abc.order.repository.OrderRepository;

@Service
public class OrderServiceImpl implements OrderService {
	
	@Autowired
	private OrderRepository orderRepository;
	
	@Autowired
	private OrderItemRepository orderItemRepository;
	
	@Autowired
	private ModelMapper modelMapper;
	
	@Autowired
	private RestTemplate restTemplate;

	@Override
	public OrderDTO saveOrder(OrderDTO orderDTO) {
		
		//long customerId = orderDTO.getCustomerId();
		
		Set<OrderItemDTO> orderItemDTOs = orderDTO.getOrderItems();
		
		double orderAmount = 0;
		
		for(OrderItemDTO orderItemDTO : orderItemDTOs) {
			
			int qty = orderItemDTO.getQuantity();
			long productId = orderItemDTO.getProductId();
			
			//get the product details			
			ResponseEntity<ProductDTO> responseEntity =restTemplate.getForEntity("http://localhost:8082/product/"+productId, ProductDTO.class);
			
			ProductDTO productDTO = responseEntity.getBody();
			
			double itemTotal = qty* productDTO.getProductPrice();			
			
			orderItemDTO.setItemTotal(itemTotal);// we need to set the item total (productPrice * qty)	
			
			orderAmount = orderAmount+itemTotal;
			
		}
		
		orderDTO.setOrderAmount(orderAmount);
		orderDTO.setOrderDate(LocalDate.now());
		orderDTO.setOrderStatus("Success");
		
		//convert dto to entity
		Order order = modelMapper.map(orderDTO, Order.class);
		
		orderRepository.save(order);	
		
				
		//convert entity to dto
		OrderDTO newOrder = modelMapper.map(order, OrderDTO.class);
		
		return newOrder;
	}

	@Override
	public OrderDTO findOrderById(long orderId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<OrderDTO> findAllOrdersByCustomer(long customerId) {
		// TODO Auto-generated method stub
		return null;
	}

}
