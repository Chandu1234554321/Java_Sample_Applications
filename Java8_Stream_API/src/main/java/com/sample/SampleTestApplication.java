package com.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.RestController;
import com.sample.bean.Department;
import com.sample.bean.Employee;

@RestController

@SpringBootApplication
public class SampleTestApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context= SpringApplication.run(SampleTestApplication.class, args);
	    Employee emp=context.getBean(Employee.class);
	    emp.setEmpName("Sekhar");
	    emp.setEmpId(100);
	    System.out.println("============EMP Name============="+emp.getEmpName());
	    System.out.println("============EMPID==========="+emp.getEmpId());
	    Department dept=emp.getDepartment();
	    emp.getEmpId();
	    emp.getEmailId();
	    dept.setDeptId(1000);
	    System.out.println("=======DEPT ID=========="+dept.getDeptId());
	}
	
	/*@RequestMapping("/welcome")
	public String getMessage()
	{
		System.out.println("============Welcome=============");
		
		return "Welcome to Sample!";
	}*/

}
