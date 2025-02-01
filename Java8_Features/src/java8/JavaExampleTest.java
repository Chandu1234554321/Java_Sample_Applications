package java8;

import java.util.Arrays;
import java.util.List;

public class JavaExampleTest {
	
	public static void main(String a[])
	{
		 List<Integer> list = Arrays.asList(-9, -18, 0, 25, 4); 
		  Integer var = list.stream().max(Integer::compare).get(); 
		  System.out.println("##################value#############"+var);
	}

}
