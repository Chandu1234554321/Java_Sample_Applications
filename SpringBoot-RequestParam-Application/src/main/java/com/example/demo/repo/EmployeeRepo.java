package com.example.demo.repo;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.bean.Employee;

import jakarta.transaction.Transactional;

@Repository
public interface EmployeeRepo  extends  JpaRepository<Employee, Integer>{
	
	 @Query(value="Select * from c emp where emp.employeename=? and emp.employeeid=?",nativeQuery = true)
	 List<Employee> getEmployee(String empName ,Integer empId);
	 

	 @Query("from Employee where empName=:empName and salary=:salary")
	 List<Employee> getEmpNameAndSal(String empName ,Double salary);
	 
	  public List<Employee> findBySalaryGreaterThanEqual(Double sal);
	 
	  public List<Employee> findByEmpName(String empName);
	 
	  @Query("from Employee where salary=:salary")
	  public List<Employee> getSalary(Double salary);
	 
	 @Modifying
	 @Transactional
	 @Query("delete from Employee where empId=:eid")
	 public void deleteEmp(Integer eid);
	 
	 @Modifying
	 @Transactional
	 @Query(value="insert into employeedetails (employeeid,employeename,employeesalary) values(:employeeid,:employeename,:employeesalary)",nativeQuery=true)
	 public void insertEmployee(@Param("employeeid") Integer id,@Param("employeename") String name,@Param("employeesalary") Double sal);
	 
	 @Query("from Employee emp where emp.empName =:empName")
	 public void searchEmployee();
}
