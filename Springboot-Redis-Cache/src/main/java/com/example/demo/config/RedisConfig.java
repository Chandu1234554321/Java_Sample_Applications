package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.JdkSerializationRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

@Configuration
public class RedisConfig {
	
	
	@Bean
	public JedisConnectionFactory jedisConnectionFactory()
	{
		RedisStandaloneConfiguration redisStandConfig=new RedisStandaloneConfiguration();
		
		redisStandConfig.setHostName("127.0.0.1");
		redisStandConfig.setPort(6379);
		return new JedisConnectionFactory(redisStandConfig);
		
	}
	@Bean
	public RedisTemplate<String,Object> redisTemplate()
	{
		
		RedisTemplate<String,Object>  redisTemplate=new RedisTemplate<>();
		redisTemplate.setConnectionFactory(jedisConnectionFactory());
		redisTemplate.setKeySerializer(new StringRedisSerializer());
		redisTemplate.setHashKeySerializer(new StringRedisSerializer());
		redisTemplate.setHashKeySerializer(new JdkSerializationRedisSerializer());
		redisTemplate.setValueSerializer(new JdkSerializationRedisSerializer());
		
		redisTemplate.setEnableTransactionSupport(true);
		
		return redisTemplate;
		
	}
	
	

}
