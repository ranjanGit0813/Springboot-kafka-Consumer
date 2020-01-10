package com.ranjan.SpringbootkafkaConsumerexample.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer{
	
	@KafkaListener(topics="Test_Kafka", groupId ="group_id")
	public void consume(String message) {
		
		System.out.println("Consumed message: "+message);
		
	}

}
