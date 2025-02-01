package com.example.demo.config;

import org.springframework.batch.core.Step;
import org.springframework.batch.core.job.builder.JobBuilder;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.batch.core.step.builder.StepBuilder;
import org.springframework.batch.item.data.RepositoryItemWriter;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.LineMapper;
import org.springframework.batch.item.file.mapping.BeanWrapperFieldSetMapper;
import org.springframework.batch.item.file.mapping.DefaultLineMapper;
import org.springframework.batch.item.file.transform.DelimitedLineTokenizer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.task.SimpleAsyncTaskExecutor;
import org.springframework.core.task.TaskExecutor;
import org.springframework.transaction.PlatformTransactionManager;

import com.example.demo.bean.Customer;
import com.example.demo.repo.CustomerRepository;

@Configuration
public class CSVBatchConfig {
	
	@Autowired
	CustomerRepository custRepo;
	  	
	@Bean
	public FlatFileItemReader<Customer> cutomReader(){
	FlatFileItemReader<Customer> itemReader=new FlatFileItemReader<>();
	
	itemReader.setResource(new FileSystemResource("src/main/resources/customers.csv"));
	itemReader.setName("csv-reader");
	itemReader.setLinesToSkip(1);
	itemReader.setLineMapper(lineMapper());
	
	return itemReader;
	}
	//Create Mapper
	public LineMapper<Customer> lineMapper()
	{
		DefaultLineMapper  lineMapper=new DefaultLineMapper<>();
		
		DelimitedLineTokenizer lineTokenizer =new DelimitedLineTokenizer();
		lineTokenizer.setDelimiter(",");
		lineTokenizer.setStrict(false);
		lineTokenizer.setNames("custid","firstName","LastName","Email","Gender");
		lineTokenizer.setDelimiter(",");
		BeanWrapperFieldSetMapper<Customer>  fieldSetKMapper=new BeanWrapperFieldSetMapper();
		fieldSetKMapper.setTargetType(Customer.class);
		lineMapper.setLineTokenizer(lineTokenizer);
		lineMapper.setFieldSetMapper(fieldSetKMapper);
		return lineMapper;
	}
	//Create processor
    @Bean
    public CustomerProcesser customerProcessor()
    {
    		return new CustomerProcesser();
    }
    // Create writer
    public RepositoryItemWriter<Customer>  customerWriter()
    {
    	RepositoryItemWriter<Customer> repoWriter=new RepositoryItemWriter<>();
    	repoWriter.setRepository(custRepo);
    	repoWriter.setMethodName("save");
    	
    	return repoWriter;
    	
    }
    //Create step
   
	@Bean
    public Step step1(JobRepository jobRepository,PlatformTransactionManager transactionManager)
    {
    	return new StepBuilder("step-1",jobRepository).<Customer,Customer>chunk(10,transactionManager)
    			.reader(cutomReader())
    			.processor(customerProcessor())
    			.writer(customerWriter())
    			.build();
    }
    //Create Job
    @Bean
    public org.springframework.batch.core.Job job(JobRepository jobRepository,PlatformTransactionManager transactionManager)
    {
    	return new  JobBuilder("startAt111",jobRepository)
                .incrementer(new RunIdIncrementer())
                .flow(step1(jobRepository,transactionManager))
                .end()
                .build();

    }
    @Bean
    public TaskExecutor taskExecutor() {
        SimpleAsyncTaskExecutor asyncTaskExecutor = new SimpleAsyncTaskExecutor();
        asyncTaskExecutor.setConcurrencyLimit(10);
        return asyncTaskExecutor;
    }
}
