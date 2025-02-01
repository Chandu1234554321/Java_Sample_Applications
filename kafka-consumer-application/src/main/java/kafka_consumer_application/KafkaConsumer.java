package kafka_consumer_application;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;


@Service
public class KafkaConsumer {
	
	@KafkaListener(
			topics="${spring.kafka.topic.name}",
			groupId="${spring.kafka.consumer.group-id}")
	
	public void consume(ProductEvent prod) {
	
		System.out.println("Order Event received  in stock service##############"+prod.getProduct());
	}

}
