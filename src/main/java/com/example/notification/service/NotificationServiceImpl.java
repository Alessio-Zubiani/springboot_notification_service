package com.example.notification.service;

import com.example.notification.event.OrderPlacedEvent;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j

@Service
@RequiredArgsConstructor
public class NotificationServiceImpl {
	

	@KafkaListener(topics = "order-placed")
	public void readMessage(OrderPlacedEvent orderPlacedEvent) {
		log.info("Got message from [order-placed] topic: {}", orderPlacedEvent);
	}
	
}
