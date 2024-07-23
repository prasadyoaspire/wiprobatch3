package com.abc.email.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import com.abc.order.model.OrderEvent;

@Component
public class OrderConsumer {

	private static final Logger LOGGER = LoggerFactory.getLogger(OrderConsumer.class);

	@KafkaListener(topics = "${topic.name}", groupId = "${spring.kafka.consumer.group-id}")
	public void consume(OrderEvent event) {
		LOGGER.info(String.format("Order event received in email service => %s", event.toString()));

		// send an email to the customer
	}
}