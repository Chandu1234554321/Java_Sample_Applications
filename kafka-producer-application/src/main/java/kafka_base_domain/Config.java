package kafka_base_domain;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class Config {
	
	@Value("${spring.kafka.topic.name}")
	private String topicName;
	
	@Bean
	public NewTopic buildTopic()
	{
		return TopicBuilder.name(topicName).partitions(5).build();
	}

}
