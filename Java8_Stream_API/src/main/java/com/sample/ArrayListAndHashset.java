package com.sample;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeMap;

public class ArrayListAndHashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet  set=new HashSet();//Order is not preserved and remove duplicates.
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(40);
		set.add(50);
		set.add(50);
		
		System.out.println("########HashSet########"+set);
		
		ArrayList  list=new ArrayList(); //order is preserved and allows duplicates.
		list.add(10);
		list.add(40);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(40);
		
		System.out.println("#####ArrayList###########"+list);
		
		LinkedHashSet  hashSet=new LinkedHashSet();  //Order is preserved and remove duplicates
		
		hashSet.add(10);
		hashSet.add(20);
		hashSet.add(50);
		hashSet.add(30);
		hashSet.add(40);
		hashSet.add(50);
		hashSet.add(60);
		hashSet.add(60);
		
		
		System.out.println("#####Linked hashSet###########"+hashSet);
		
		TreeMap  map=new TreeMap();
		
		map.put(10,"hello");
		map.put(30,"Hi");
		map.put(20,"How");
		System.out.println("#####map###########"+map);
		
		
		
	}

}
