package kafka_base_domain;

import java.util.concurrent.CompletableFuture;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducer {

	private KafkaTemplate<String,String> kafkaTemplate;

	public  KafkaProducer(KafkaTemplate<String,String> kafkaTemplate)
	{
		this.kafkaTemplate=kafkaTemplate;
	}
	public void sendMessage(String message)
	{
		//CompletableFuture<SendResult<String,String>>kafkaTemplate.send("product-service",2,null,message);
		kafkaTemplate.send("Nandi",message);
	    
	}
}
