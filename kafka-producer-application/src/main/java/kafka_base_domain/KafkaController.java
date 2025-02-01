package kafka_base_domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaController {
	
	@Autowired
	private KafkaProducer  producer;
	
	@GetMapping("/publish/{message}")
	public ResponseEntity<?>  sendMessage(@PathVariable  String message)
	{
	     for(int i=0;  i<10000; i++) {
	    	 
	    	 producer.sendMessage(message+"::" + i);
	    	 
	     }
		return ResponseEntity.ok("Message published successfully !!");
		
		
	}

}
