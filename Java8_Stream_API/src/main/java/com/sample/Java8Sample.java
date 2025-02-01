package com.sample;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.Set;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import com.sample.bean.*;

public class Java8Sample {
	
	public static void main(String a[])
	{
		int arr6[]= {4,5,1,7,2,9,11,12,34,19,113,118,43,5,6};
		
		int arr8[]= {1,2,3,4,4,5,6,7,8,9,8};
		
		List<Integer> dupString=Arrays.stream(arr8).boxed().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).
		
		entrySet().stream().filter(m->m.getValue()>1).map(m->m.getKey()).collect(Collectors.toList());
		
		System.out.println("Diplicate nos in int Arraay############"+dupString);
		
		//FInd mid character in Array
		
		int len=arr6.length;
		
		int mid=len/2;
		
	//	Arrays.stream(arr6).boxed().collect(Collectors.toList()).stream().filter(x->x%2==0?(x==mid||x==mid-1):x=mid).
		
		
		
		//Starts with 1 and descending order and unique elements
		
		List<Integer>  unique_desc_ele=Arrays.stream(arr6).boxed().filter(s->String.valueOf(s).startsWith("1")).distinct().
		sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		
		System.out.println("############unique_desc_ele##########"+unique_desc_ele);
		
		//Multiply alternate numbers
		
		
		//Optional<Integer> mulList11=Arrays.stream(arr6).boxed().collect(Collectors.partitioningBy(x->x!=0)).values().stream().flatMap(x->x.stream()).collect(Collectors.toList()).stream().reduce((x,y)->x*y);
		
	//	System.out.println("##########mulList11###########"+mulList11.get());
		
		OptionalInt valMul=IntStream.range(0, arr6.length).filter(x->x%2==0).map(x-> arr6[x]).reduce((a8,b)-> (a8*b));
		 
		System.out.println("############3valMul##########"+valMul.getAsInt());
		
		String str14[]= {"123","abc","ABC","345","xyz","765","12"};
		
		List<String> numsString=Arrays.asList(str14).stream().filter(x->x.matches("[0-9]+")).collect(Collectors.toList());
		
		System.out.println("numsString@############"+numsString);
		
		//Find first non repeated character
		
		String str5="Hello";
		
		Arrays.stream(str5.split("")).sorted(Comparator.reverseOrder()).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting())).
		entrySet().stream().filter(z->z.getValue()==1).map(z->z.getKey()).findFirst().get();
		
	
		Character c11=str5.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting())).
		entrySet().stream().filter(x->x.getValue()==1).map(m->m.getKey()).findFirst().get();
		
		System.out.println("###First Unique characte#############  "+c11);
		//FInd sum of unique elements in array.
		int arr12[] = {9,6,7,8,1,1,6,8,8};
		
		
		Arrays.stream(arr12).boxed().collect(Collectors.toList()).stream().map(s->s+"").filter(s->s.startsWith("8")).collect(Collectors.toList());
		
		
		//Product of First two numbers
		
		int product=Arrays.stream(arr12).boxed().collect(Collectors.toList()).stream().limit(2).reduce((a8,b8)->(a8*b8)).get();
		
		System.out.println("##########product###############"+product);
		//Group Numbers by range//
		
		Map<Object, List<Integer>> groupNum= Arrays.stream(arr12).boxed().collect(Collectors.toList()).stream().collect(Collectors.groupingBy(x->x*10/10,Collectors.toList()));
		
		System.out.println("##########groupNum###############"+groupNum);
		
		int sum=Arrays.stream(arr12).mapToObj(y->y).distinct().reduce((a1,b1)->(a1+b1)).get();
		
		System.out.println("##########SUM###############"+sum);
		
		int arr11[] = {1,2,3,4,5,6,7,8,9};
		//Print arrays elements in reverse order
		
		  List<Integer> reverOrder= Arrays.stream(arr11).mapToObj(x->x).sorted(Collections.reverseOrder()).collect(Collectors.toList());
		
		  System.out.println("#######reverOrder##########"+reverOrder);
		//group odd and even numbers separately
		
		  List<List<Integer>> odd_even_num=  Arrays.stream(arr11).boxed().collect(Collectors.toList()).stream().collect(Collectors.groupingBy(x->x%2==0,Collectors.toList())).
					entrySet().stream().map(x->x.getValue()).collect(Collectors.toList());
			
	      System.out.println("odd_even_num#########"+odd_even_num);
		
		  String str4="Missippi";

		  Map<String, Long>   mappingCount=Arrays.stream(str4.split("")).sorted(Comparator.reverseOrder()).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()));
		  
		  System.out.println("############mappingCount#############"+mappingCount);
		  
		 
		
		//Find higetsr string lenght in goven sentence.
		
		String str2="I am Learning Stream API";
		String originalString="dabcadefg";
		List<String> nonDupString= Arrays.stream(originalString.split("")).distinct().collect(Collectors.toList());
		System.out.println("nonDupString#########"+nonDupString);
		String s=Arrays.stream(str2.split(" ")).max(Comparator.comparing(String::length)).get(); 
		
		//Find second highest length 
		
		String secondHeight= Arrays.stream(str2.split(" ")).sorted(Comparator.comparing(String::length).reversed()).skip(1).findFirst().get();
		 
		System.out.println("##########secondHeight###############"+secondHeight);
		
		//Find common elements in the give two arrays.
		
		String[] arr1= {"Java","Jenkins","Spring","Hibernate"};
		
		String[] arr2= {"Java","Hibernate","Jsf","Somesh"};
		
		Set<String> set=new HashSet();
		
		for(int i=0; i<arr1.length; i++)
		{
			for(int j=0; j<arr2.length; j++)
			{
				if(arr1[i]==arr2[j])
				{
			    	set.add(arr2[i]);
					break;
				}
			}
		}
		System.out.println("###############SET############"+set);
		//find first non repitate chars
		String str12="Hello how are you";
		
		Map<Character,Long> charCount=str12.chars().mapToObj(i->(char)i).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()));
		
		System.out.println("@@@@@@@charCount"+charCount);
		
		Optional<Character> repeatChar=charCount.entrySet().stream().filter(e->e.getValue()>1).map(e->e.getKey()).findFirst();
		
		System.out.println("####repeatChar#######"+ repeatChar.get());
		
		
		//FInd the words starts with S//
		
		List<String> strList=Arrays.asList("Rama","Siva","Rama","Sita","Sita","Siva");
		
		List<String> strStrtsWith=strList.stream().filter(str->str.startsWith("S")).collect(Collectors.toList());
		
		System.out.println("#######strStrtsWith#############"+strStrtsWith);
		
		//find no of same stings in arrays.
		Map<String,Long>	strMapList=	strList.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
				.entrySet().stream().filter(e->e.getValue()>=1).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));
		
		System.out.println("strMapList###########3"+strMapList);
		
		//Group employess based on DEPT;
		
	//	Map<String,List<Employee>>  empDeptBased=strList.stream().collect(Collectors.groupingBy(Employee::getDepartment));
		
		
		//Joiner examples 
		
		String str="How are you man";
		
		long countVowels=str.chars().filter((x)->{
			
			return (x=='a'|| x=='e'|| x=='i' ||x=='o' || x=='u');	
		}).count();
		
		System.out.println("########countVowels########"+countVowels);
		
		
		String str111=Arrays.asList(str.split(" ")).stream().collect(Collectors.joining("-"));
		
		System.out.println("str111##Joining#############"+str111);
		
		Integer arr[]= {1,2,3,4,5,6};
		String[] inputArray= {"Amit","ball","call","egg"};
		
		Supplier<Stream<String>>  inputStr=()-> Stream.of(inputArray);
				long count=inputStr.get().filter(x->"Amit".equals(x)).count();
		
				System.out.println("############COUNT###############"+count);
				
		List<Integer> inputCount=Arrays.asList(inputArray).stream().map(String::length).collect(Collectors.toList());
		
		String largest=Arrays.asList(inputArray).stream().max(Comparator.comparing(String::length)).get();
		
		System.out.println("#########largest#######"+largest);
		
		System.out.println("#########inputCount#######"+inputCount);
		
		List<Integer> numList=Arrays.asList(arr);
		
		Optional<Integer> value=numList.stream().reduce((a1,b)-> a1*b);
		
		System.out.println("######VALUE GET###########"+value.get());
		
		Employee e1=new Employee(100,"chandu","Bangalore",1000000.0,"admin");
		Employee e2=new Employee(200,"sekhar","Chennai",3440000.0,"Accounts");
		Employee e3=new Employee(300,"siva","Hyderabad",340000.0,"admin");
		Employee e4=new Employee(400,"Ramu","Pune",5000000.0,"Finance");
		
		List<Employee>  empList=new ArrayList();
		
		//EMp list having id greater than 100
		List<Employee> empIdlIst=empList.stream().filter(emp->emp.getEmpId()>100).collect(Collectors.toList());
		
		//getting only all empnames
		List<String> empNameList=empList.stream().map(Employee::getEmpName).collect(Collectors.toList());
		
		System.out.println("#########empNameList########"+empNameList);
		
		empList.add(e1);empList.add(e2);empList.add(e3);empList.add(e4);
		
		//Finding maximum Employee salary
		
		Optional<Employee> maxSalary=empList.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSal)));
		
		System.out.println("############MaxSalary###############"+maxSalary.get().getSal());
		
        Optional<Employee> minSalary=empList.stream().collect(Collectors.minBy(Comparator.comparingDouble(Employee::getSal)));
		
		System.out.println("############MinSalary###############"+minSalary.get().getSal());
		
        Double avgSalary=empList.stream().collect(Collectors.averagingDouble(Employee::getSal));
		
		System.out.println("############AVgSalary###############"+avgSalary);
		
		//Find the max salary of Each Department.
		
		Map<String, Optional<Employee>> empListMap= empList.stream().collect(Collectors.groupingBy(Employee::getDept,Collectors.reducing(BinaryOperator.maxBy(Comparator.comparing(Employee::getSal)))));
		
		System.out.println("############Max Salary for each department ###############"+empListMap);
		
		empListMap.forEach((key,val)->System.out.println("Key####"+ key +"  value#### "+val.get().getSal()));
				
		//Find the employees count in each departmrnt#######################ss	
		
		System.out.println("##Find the employees count in each departmrnt##");
		
		Map<String, List<Employee>>  dept_empcount=empList.stream().collect(Collectors.groupingBy(Employee::getDept));
		
		System.out.println("##########dept_empcount#############"+dept_empcount);
		
		dept_empcount.forEach((key,val)->System.out.println(key  +"  : "+val.size()));
		
		Comparator<Employee> groupComp=Comparator.comparing(Employee::getEmpName).thenComparing(Employee::getEmailId);
		
		empList.sort(groupComp);
		
		empList.forEach(emp->System.out.println(emp.getEmpName()+" ::: "+ emp.getEmailId()));
		
	    Map<String,List<Employee>> empMap =	empList.stream().collect(Collectors.groupingBy(Employee::getEmailId));
 		
		System.out.println("#######EMPMAP############"+empMap);
		
		empMap.forEach((key,val)->System.out.println("Name ::: "+key+" Belongs to "+val.get(0).getEmailId()));
		int[] input = {13,6,12,17};
		
		OptionalInt x = IntStream.of(1, -3, 5)
                .filter(z -> z % 2 == 0)
                .findFirst();
		
		int target = 30;
		printTargetIndexVal(target,input);
		//printTargetIndex(target,input);
		printTrainggle(5);
		findMissingNum();
        
	}
	public static void printTargetIndexVal(int target,int arr[])
	{
		int indexArr[] = new int[10];
		
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr.length; j++)
			{
				if((arr[i]+arr[j])==target)
				{
					indexArr[j]=j;
					indexArr[i]=i;
				}		
			}
		}
		System.out.println((indexArr[0]+" "+indexArr[1]));
	}
	public static void printTargetIndex(int target,int input[]) {
		 System.out.println("###############");
	  int pointerOne = 0;
	    int pointerTwo = input.length - 1;
	    int indexArr[] = new int[10];
	    while (pointerOne < pointerTwo) {
	        int sum = input[pointerOne] + input[pointerTwo];

	        if (sum == target) {
	        	indexArr[pointerOne]=pointerOne;
				indexArr[pointerTwo]=pointerTwo;
				break;
	        }
	        else if (sum < target) {
	        	indexArr[pointerOne]= pointerOne++;
	        	
	        } else {
	        	indexArr[pointerTwo]=  pointerTwo--;
	        
	        }
	    }
	    System.out.println("###############");
	    System.out.println((indexArr[0]+" "+indexArr[1]));
	}
	public static void printTrainggle(int n)
	{
		for(int i=0;  i<n; i++)
		{
			//to handle spaces
			for(int j=n-i; j>1; j--)
			{
				System.out.print(" ");
			}
	        for(int j=0; j<=i; j++)
	        {
	        	System.out.print("* ");
	        }
	        System.out.println();
	        
	        
		}
		
		
	}
	public static void findMissingNum()
	{
		int arr[]= {1,2,3,5,6,7,8,9,11,12,14};
		
		Arrays.sort(arr);
		int res=1;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]==res)
			{
				res++;
			}
			else
			{
				System.out.println(res);
			    break;
			}
		}
		
	}
}
