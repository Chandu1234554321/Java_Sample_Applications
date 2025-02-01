package com.example.demo.controller;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.bean.ContactUsEntity;
import com.example.demo.bean.Course;
import com.example.demo.bean.Employee;
import com.example.demo.repo.ContactRepo;
import com.example.demo.service.EmployeeService;

import jakarta.servlet.http.HttpServletResponse;
import reactor.core.publisher.Flux;


@RestController
public class EmployeeController {
	
	EmployeeService employeeService;
	
	ContactRepo  contactRepo;
	
	public EmployeeController(EmployeeService employeeService,ContactRepo  contactRepo)
	{
		this.employeeService=employeeService;
		 this.contactRepo=contactRepo;
	}
	
	@PostMapping(path="/save",consumes=MediaType.APPLICATION_JSON_VALUE,produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee)
	{
		Employee emp=employeeService.saveEmployee(employee);
	    if(emp!=null)
	    {  
	    	return new ResponseEntity<Employee>(emp,HttpStatus.OK);
	    }
	    else
	    {   
	    	return new ResponseEntity<Employee>(HttpStatus.BAD_REQUEST);
	    }
	    
	}
	@PostMapping(path="/saveAll" ,consumes = MediaType.APPLICATION_JSON_VALUE,produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Employee>> saveAll(@RequestBody List<Employee>  employeeList)
	{
		
		 System.out.println("##################################");
		 List<Employee>  empList=employeeService.saveEmployeeAll(employeeList);
		
		return  new ResponseEntity<List<Employee>>(empList,HttpStatus.OK);
		
	}
	@GetMapping(path="/getById/{empId}")
	public ResponseEntity<Employee> getEmplyeeById(@PathVariable("empId") Integer empId)
	{
	    Employee empList=employeeService.getEmployee(empId);
		
		return new ResponseEntity<Employee>(empList,HttpStatus.OK);
	}
	@GetMapping(path="/getAll")
	public ModelAndView getEmpoyee()
	{
		 List<Employee>  empList=employeeService.getAllEmployees();
		 
		 ModelAndView  modelview=new ModelAndView();
		 
		 modelview.setViewName("index");
		 
		 modelview.addObject("empList",empList);
		
		return modelview;
	}
	@GetMapping(path="/getEmpNameAndId/{empName}/{empId}")
	public ResponseEntity<List<Employee>> getEmployeeBynameAndId(@PathVariable String empName,@PathVariable Integer empId)
	{
		 List<Employee>  empList=employeeService.getEmployeeBynameAndId(empName, empId);
		
		return new ResponseEntity<List<Employee>>(empList,HttpStatus.OK);	
	}
	
	@DeleteMapping(path="/deleteById/{emp}")
	public ResponseEntity<String> deleteEmpoyee(@PathVariable Integer emp)
	{
		 String empList=employeeService.deleteEmployee(emp);
		
		return new ResponseEntity<String>(empList,HttpStatus.OK);	
	}
    @DeleteMapping(path="/deleteByAllIds")
	public <empId> ResponseEntity<String> deleteByALlIds(@RequestBody Iterable<empId> emp)
	{
		 String empList=employeeService.deleteEmployeeByALlIds(emp);
		
		return new ResponseEntity<String>(empList,HttpStatus.OK);	
	}
	@DeleteMapping(path="/deleteAll")
	public ResponseEntity<String> deleteAll()
	{
		String str=employeeService.deleteAll();
		return new ResponseEntity<String>(str ,HttpStatus.OK);	
	}
	@GetMapping(path="/getEmponSal/{sal}")
	public ResponseEntity<List<Employee>> getEmpBySal(@PathVariable  Double sal)
	{
		List<Employee> list =employeeService.getEmpBasedOnSal(sal);
		return new ResponseEntity<List<Employee>>(list ,HttpStatus.OK);	
	}
	@GetMapping(path="/getEmpOnName/{name}")
	public ResponseEntity<List<Employee>> getEmpBySal(@PathVariable  String name)
	{
		List<Employee> list =employeeService.findByEmpName(name);
		return new ResponseEntity<List<Employee>>(list ,HttpStatus.valueOf(200));	
	}
	@GetMapping(path="/getSalaty/{salary}")
	public ResponseEntity<List<Employee>> getEmpSalary(@PathVariable  Double salary)
	{
		List<Employee> list =employeeService.findBySalary(salary);
		return new ResponseEntity<List<Employee>>(list ,HttpStatus.OK);	
	}
	@GetMapping(path="/getSalaryAndName/{name}/{salary}")
	public ResponseEntity<List<Employee>> getEmpNameAndSalary(@PathVariable  String name,@PathVariable Double salary)
	{
		List<Employee> list =employeeService.getEmployeeBynameAndSal(name, salary);
		return new ResponseEntity<List<Employee>>(list ,HttpStatus.OK);	
	}
	@DeleteMapping(path="/deleteEmployeeById/{empId}")
	public ResponseEntity<String> deleteEmpById(@PathVariable  Integer empId)
	{
		String message =employeeService.deleteEmpById(empId);
		return new ResponseEntity<String>(message ,HttpStatus.OK);	
	}
	@PostMapping(path="/saveIntoEmp")
	public ResponseEntity<String> insertIntoEmp(@RequestBody Employee employee)
	{
		String message =employeeService.insertIntoEmp(employee);
		return new ResponseEntity<String>(message ,HttpStatus.OK);	
	}
	@GetMapping(path="/getEmpPagination/{pageSize}/{pageNum}")
	public ResponseEntity<List<Employee>> getEmpNameByPagination(@PathVariable  int pageSize,@PathVariable int pageNum)
	{
		List<Employee> list =employeeService.getEmpwithPagination(pageSize, pageNum);
		return new ResponseEntity<List<Employee>>(list ,HttpStatus.OK);	
	}
	@GetMapping(path="/getEMpByQBE/{empName}")
	public ResponseEntity<List<Employee>> getEmpNameByQBE(@PathVariable  String  empName)
	{
		List<Employee> list =employeeService.getEmpwithQBE(empName);
		return new ResponseEntity<List<Employee>>(list ,HttpStatus.OK);	
	}
	@GetMapping(path="/getEmpBySort")
	public ResponseEntity<List<Employee>> getEmpNameBySort()
	{
		List<Employee> list =employeeService.getEmpwithSort();
		return new ResponseEntity<List<Employee>>(list ,HttpStatus.OK);	
	}
	@GetMapping(path="/export-to-excel")
    public void exportIntoExcelFile(HttpServletResponse response) throws IOException {
        response.setContentType("application/octet-stream");
        DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss");
        String currentDateTime = dateFormatter.format(new Date());

        String headerKey = "Content-Disposition";
        String headerValue = "attachment; filename=student" + currentDateTime + ".xlsx";
        response.setHeader(headerKey, headerValue);

        List <ContactUsEntity> listOfStudents = contactRepo.getAllDetails();
       // ExcelGenerator generator = new ExcelGenerator(listOfStudents);
       // generator.generateExcelFile(response);
	}
	
}
