package com.sample.bean;

import java.util.Comparator;

public class IdComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee e1, Employee e2) {
		// TODO Auto-generated method stub
		if(e1.getEmpId()==e2.getEmpId())
		{
			return (e1.getEmpName().compareTo(e2.getEmpName()));
		}else if(e1.getEmpId()>e2.getEmpId())
		{
			return 1;
		}
		else
			return -1;
	}

}
