package com.example.demo.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.Spliterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.bean.Employee;
import com.example.demo.repo.EmployeeRepo;



@Service
public class EmployeeService {
	
	EmployeeRepo  empRepo;
	
	public EmployeeService(EmployeeRepo  empRepo)
	{
		this.empRepo=empRepo;
	}
	
	public Employee saveEmployee(Employee employee)
	{
		Integer empid=employee.getEmpId();
		String empName=employee.getEmpName();
		Double empSala=employee.getSalary();
		
	    Employee emp=empRepo.save(employee);
	    
	    return emp;
		
	}
	public List<Employee> saveEmployeeAll(Iterable<Employee> employeeList)
	{
	    List<Employee> emp=(List<Employee>) empRepo.saveAll(employeeList);
	    		
	    return emp;
		
	}
	public Employee getEmployee(Integer empId)
	{
		   Optional<Employee>  employee=empRepo.findById(empId);
		   if(employee.isPresent())
		   {
		    return employee.get();
		   }
		   else
			   return new Employee();
	}
	public  List<Employee> getAllEmployees()
	{
		   Iterable<Employee>  employee=empRepo.findAll();
		   List empAllList=new ArrayList<>();
		   if(employee.iterator()!=null)
		   {
		     Iterator ite=employee.iterator();
		     while(ite.hasNext())
		     {  
		    	 Employee e=(Employee) ite.next(); 
		    	 empAllList.add(e);
		     }
		   }
		   return empAllList;
	}
	 
   public  String deleteEmployee(Integer employee)
	{

         String msg="";
		   try {
	            empRepo.deleteById(employee);
	             msg="Deleted Successfully";
		   }
	            catch(Exception ex){
	            	msg="Not Deleted Successfully";       	
	            }
		   
		  
		   return msg;
	}
   
    public  <empId> String deleteEmployeeByALlIds(Iterable<empId> emp)
 	{

          String msg="";
 		   try {
 			    
 			  Iterator ite=emp.iterator();
 			   
 			  System.out.println("############");
 			   
 			   List listids=new ArrayList();
 			   
 			   while(ite.hasNext())
 			   {
 				   Map<String, Integer> valueId=(Map<String, Integer>) ite.next();
 				   Set<Entry<String,Integer>> entrysetVal=valueId.entrySet();
 				   
 				   System.out.println("######222222222######"+entrysetVal);
 				  
 				   String s=entrysetVal.toString();
 				   
 				 String val=  s.substring(s.indexOf("=")+1,s.length()-1);
 				   
 				 listids.add(Integer.parseInt(val));  				   
 			   }
 			     System.out.println("######222222222######"+listids);
 			     
 	             empRepo.deleteAllById(listids);
 	             msg="Deleted Successfully";
 		   }
 	            catch(Exception ex){
 	            	msg="Not Deleted Successfully";       	
 	            }
 		   return msg;
 	}
    public  String deleteAll()
 	{
    	 String msg="";
    	 try {
    	 empRepo.deleteAll();
    	 msg="Deleted Successfully";
    	 }
    	 catch(Exception ex)
    	 {
    		 msg="Not Deleted Successfully";
    	 }
    	 return msg;
 	}
    
    public  List<Employee> getEmployeeBynameAndId(String empName,Integer empId)
   	{
      	 String msg="";
      	 List<Employee> empList=null;
      	 try {
      		 System.out.println("empName################"+empName);
      		System.out.println("empId################"+empId);
      	 empList=(List<Employee>) empRepo.getEmployee(empName, empId);
      	 msg="Deleted Successfully";
      	 }
      	 catch(Exception ex)
      	 {
      		 msg="Not Deleted Successfully";
      	 }
      	 return empList;
   	}
    public  List<Employee> getEmployeeBynameAndSal(String empName,Double salary)
   	{
      	 String msg="";
      	 List<Employee> empList=null;
      	 try {
      		 
      	 empList=(List<Employee>) empRepo.getEmpNameAndSal(empName, salary);
      	 msg="fetched Successfully";
      	 }
      	 catch(Exception ex)
      	 {
      		 msg="Not fetched Successfully";
      	 }
      	 return empList;
   	}
    public  List<Employee> getEmpBasedOnSal(Double sal)
   	{
      	 String msg="";
      	 List<Employee> empList=null;
      	 try {
      		
      	 empList=(List<Employee>) empRepo.findBySalaryGreaterThanEqual(sal);
      	 msg="Fetched Successfully";
      	 }
      	 catch(Exception ex)
      	 {
      		 msg="Not Fetched Successfully";
      	 }
      	 return empList;
   	}
    public  List<Employee> findByEmpName(String empName)
   	{
      	 String msg="";
      	 List<Employee> empList=null;
      	 try {
      		
      	 empList=(List<Employee>) empRepo.findByEmpName(empName);
      	 msg="Fetched Successfully";
      	 }
      	 catch(Exception ex)
      	 {
      		 msg="Not Fetched Successfully";
      	 }
      	 return empList;
   	}
    public  List<Employee> findBySalary(Double salary)
   	{
      	 String msg="";
      	 List<Employee> empList=null;
      	 try {
      		
      	 empList=(List<Employee>) empRepo.getSalary(salary);
      	 msg="Fetched Successfully";
      	 }
      	 catch(Exception ex)
      	 {
      		 msg="Not Fetched Successfully";
      	 }
      	 return empList;
   	}
    public  String deleteEmpById(Integer empId)
   	{
      	 String msg="";
      	
      	 try {
      		
          empRepo.deleteEmp(empId);
      	 msg="Deleted Successfully";
      	 }
      	 catch(Exception ex)
      	 {
      		 msg="Not Deleted Successfully";
      	 }
      	 return msg;
   	}
    public  String insertIntoEmp(Employee emp)
   	{
      	 String msg="";
      	
      	 try {
      		
          empRepo.insertEmployee(emp.getEmpId(),emp.getEmpName(),emp.getSalary());
      	 msg="Inserted  Successfully";
      	 }
      	 catch(Exception ex)
      	 {
      		 msg="Not Inserted Successfully";
      	 }
      	 return msg;
   	}
    
    public  List<Employee> getEmpwithPagination(int pageSize,int pageNum)
   	{
      	 String msg="";
      	List<Employee> empList=null;
      	
      	 try {
      		
         PageRequest  req= PageRequest.of(pageNum-1,pageSize);
      	 
         Page<Employee>  findAll=empRepo.findAll(req);
         
         empList =findAll.getContent();
          
         msg="Inserted  Successfully";
      	 }
      	 catch(Exception ex)
      	 {
      		 msg="Not Inserted Successfully";
      	 }
      	 return empList;
   	}
    public  List<Employee> getEmpwithQBE(String empName)
   	{
      	 String msg="";
      	 List<Employee> empList=null;
      	 
      	 Employee empObj=new Employee();
      	 empObj.setEmpName(empName);
      	 List<Employee>  findAll=null;
      	 
      	 try {
      		
          Example<Employee> of=Example.of(empObj);
      	 
          findAll=empRepo.findAll(of);
         
         msg="Inserted  Successfully";
      	 }
      	 catch(Exception ex)
      	 {
      		 msg="Not Inserted Successfully";
      	 }
      	 return findAll;
   	}
    public  List<Employee> getEmpwithSort()
   	{
      	 String msg="";
      	 List<Employee> empList=null;
      	 
      	 String column="empName";
      	 Sort sort=Sort.by(column);
      	 List<Employee>  findAll=null;
      	 
      	 try {
      	 
          findAll=empRepo.findAll(sort);
         
         msg="Inserted  Successfully";
      	 }
      	 catch(Exception ex)
      	 {
      		 msg="Not Inserted Successfully";
      	 }
      	 return findAll;
   	}
    
   
}
