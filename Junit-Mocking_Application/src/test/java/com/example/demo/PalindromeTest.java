package com.example.demo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.ValueSource;

public class PalindromeTest {
	
	static PalindromeCheck palindorme=null;
	static EvenOrOdd even=null;
	
	@BeforeAll
	public static void init()
	{
		palindorme=new  PalindromeCheck();
		even=new EvenOrOdd();
	}
	
	@ParameterizedTest
	@ValueSource(strings= {"racecar","radar","madam","ashok"})
	public void palindromeTest(String str)
	{
		boolean b=palindorme.isPalindrome(str);
		assertTrue(b);
	}
	@ParameterizedTest
	@CsvFileSource(resources= "/data.csv",numLinesToSkip = 1)
	public void evenOrOdd(String input,String expected)
	{
		String b=even.evenOrOdd(Integer.parseInt(input));
		assertEquals(b,expected);
	}

}
