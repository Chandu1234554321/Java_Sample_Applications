package lamda;

import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@FunctionalInterface
interface Calculator
{
	
	default int mul(int d,int f) {
		return (d*f);
	}
   boolean findPrime(int k);
   
}
public class CalculatorImpl implements Calculator {
	
	  public int sum(int a,int b)
	  {
		  return (a+b);
	  }
	  public static void main(String args[])
	  {
		 
		  SimpleDateFormat   format=new SimpleDateFormat();
		  
		  LocalDate firstInYear = LocalDate.of(date1.getYear(),date1.getMonth(), 1);
		  
		  System.out.println("########firstInYear############"+firstInYear);

		  LocalDate secondFriday = firstInYear.with(TemporalAdjusters.nextOrSame(DayOfWeek.FRIDAY)).with(TemporalAdjusters.next(DayOfWeek.FRIDAY));
		  
		     System.out.println("#############secondFriday##########"+secondFriday);
		 
		     List<Integer> list = Arrays.asList(-9, -18, 0, 25, 4); 
			  
		     Integer var = list.stream().max(Integer::compare).get(); 
			  
			 System.out.println("##################value#############");
		}
	    public boolean findPrime(int k)
	    {
	    	boolean flag=true;
	    	for(int i=2; i<=k/2;  i++)
	    	{
	    		if(k<=1)
	    		{
	    			flag=false;
	    		}
	    		
	    		if(k%i==0)
	    		{
	    			flag=true;
	    			
	    			break;
	    		}
	    		else {
					flag= false;
				}	
	    	}
	    	return flag;  	
	    }
     }