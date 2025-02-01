package com.example.demo;

import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SbSpringDataBatchApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbSpringDataBatchApplication.class, args);
	}
}
