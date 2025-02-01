package com.example.demo.controller;

import java.util.Date;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.JobParametersInvalidException;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.repository.JobExecutionAlreadyRunningException;
import org.springframework.batch.core.repository.JobInstanceAlreadyCompleteException;
import org.springframework.batch.core.repository.JobRestartException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

class CustomerController {
	
	 @Autowired
	    private JobLauncher jobLauncher;
	    @Autowired
	    private Job job;

	    @PostMapping("/importCustomers")
	  //  @Scheduled(fixedDelay=5000,initialDelay=5000)
	    public void importCsvToDBJob() {
	        JobParameters jobParameters = new JobParametersBuilder()
	                .addLong("startAt", System.currentTimeMillis()).toJobParameters();
	        try {
	            jobLauncher.run(job, jobParameters);
	        } catch (JobExecutionAlreadyRunningException | JobRestartException | JobInstanceAlreadyCompleteException | JobParametersInvalidException e) {
	            e.printStackTrace();
	        }
	        System.out.println("##########################"+new Date().toString());
	    }

}
