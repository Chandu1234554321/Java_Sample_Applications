package com.sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import com.sample.bean.Employee;
import com.sample.bean.NameComparator;

public class SampleTestCoding {
	
	public static void main(String a[])
	{
		List<Integer>  arrList=Arrays.asList(1,2,3,4,4,5,1,2,3,4);
		
		String str12="abcabcfrde";
		
		List<String> strList= Arrays.asList(str12.split("")).stream().distinct().collect(Collectors.toList());
		
		System.out.println("##########strList##########3"+strList);
		
		List<Integer>  arrList_dis= arrList.stream().distinct().collect(Collectors.toList());
		arrList.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		
		System.out.println("##########3arrList_dis##########3"+arrList_dis);
				
		long secondList= arrList.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		
		System.out.println("#########secondList######"+secondList);
		
		HashMap map=new HashMap(); 
		
		map.put("Rama", 100);
		map.put("Sita", 400);
		map.put("Siva", 300);
		map.put("Govinda", 200);
		
		TreeMap map1=new TreeMap(map);
		

		System.out.println(map1);
		
		Employee e1=new Employee();
		
		e1.setEmpId(100);	
		e1.setEmpName("Ram");
		
		Employee e2=new Employee();
		e2.setEmpId(200);	e2.setEmpName("Sita");
		
		Employee e3=new Employee();
		e3.setEmpId(300);	e3.setEmpName("Siva");
		
		ArrayList list=new ArrayList();list.add(e3);
		list.add(e1);list.add(e2);
		
		Collections.sort(list,new NameComparator());
		
		for(int j=0; j<list.size(); j++)
		{
			Employee e=(Employee) list.get(j);
			System.out.println(e.getEmpName());
		}
		
		System.out.println(list);
		
		String s="sbcsbc";
		
		String[] strSplit = s.split(""); 
		 
		List<String>  litOfStrings=Arrays.asList("Chandra","Sekhar","Siva","Sekhar","Siva");
		
		String maxString=litOfStrings.stream().max(Comparator.comparing(String::length)).get();
		
		System.out.println("#############maxString123############"+maxString);
		
		litOfStrings=litOfStrings.stream().distinct().collect(Collectors.toList());
		
		Integer max=litOfStrings.stream().map(String::length).max(Integer::compareTo).get();
		
		System.out.println("#############max INt ###########"+max);
		
		List<Integer> listOfInt= litOfStrings.stream().map(String::length).collect(Collectors.toList());
		
		System.out.println("#############listOfInt###########"+listOfInt);
		
		//Max string in array.
	    
		 String val=litOfStrings.stream().max(Comparator.comparing(String::length)).get();
		
		 System.out.println("#############MAX###########"+val);
		
		@SuppressWarnings("unchecked")
		ArrayList<String> s1= new ArrayList(Arrays.asList(strSplit));
		
		Map<Object, Object> dupChars=s1.stream().collect(Collectors.groupingBy(Function.identity(), 
				Collectors.counting())).entrySet().stream().filter(e->e.getValue()>1).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
		
		System.out.println("############DupChars###########"+dupChars);
		
		String s4=s.substring(0,1).toUpperCase()+s.substring(1,s.length());	
		
		System.out.println("############ NameFormat ###########"+s4);
		
		String str="abc";
		String str1="";
		char ch[]=str.toCharArray();
		
		for(int i=0; i<ch.length; i++)
		{
			str1=ch[i]+str1;
		}
		System.out.println("str1##############"+str1);
		
	}

}
