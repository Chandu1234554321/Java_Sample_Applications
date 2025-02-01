 package com.sample;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrimeNumber {
	
	public static void main(String a[]) {
		
		List<Integer> numbers = Arrays.asList(0,1, 2, 3, 4, 5, 6, 7, 8, 9, 20);
        //Prime number 
        System.out.println(numbers.stream()
                             .filter(PrimeNumber::isPrime).collect(Collectors.toList()));
		
}
public static boolean isPrime(int num)
{
	
	for(int i=2;  i<=num/2;  i++)
	{
		if(num%i==0)
		{
			return false;
		}
	}
	return true;
	
  }
}