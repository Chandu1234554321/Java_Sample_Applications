package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
	
	static Calculator cal=null;
	
	@BeforeAll
	public static void beforeAll() {
		
		cal=new Calculator();
        System.out.println("###################"+cal.hashCode());
	}
	@BeforeEach
	public  void beforeEach() {
        System.out.println("########beforeEach###########");
	}
	@AfterEach
	public  void afetrEach() {
        System.out.println("########afetrEach###########");
	}
	@AfterAll
	public static void afterAll() {
		
		cal=null;
        System.out.println("#######Nullifing###########");
	}
	@Test
	@RepeatedTest(3)
	@DisplayName("Addition test case")
	public void testAdd()
	{	
		Integer result=cal.calculate(10,20);
		
		Integer expectedResult=30;
		
		assertEquals(result,expectedResult);
	}
	@Test
	@Order(1)
	@DisplayName("Multiplication test case")
	public void testMul()
	{
		Integer result=cal.multifly(10,20);
		
		Integer expectedResult=200;
		
		assertEquals(result,expectedResult);
	}

}
