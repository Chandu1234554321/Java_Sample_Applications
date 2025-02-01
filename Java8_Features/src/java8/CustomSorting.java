package java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CustomSorting{
	
public static void main(String args[])
{
	
	List<Person>  personLit=new ArrayList<Person>();
	
	personLit.add(new Person("Chandu",33));
	personLit.add(new Person("Gopal",31));
	personLit.add(new Person("Siva",34));
	personLit.add(new Person("Ramu",36));
	
	Comparator<Person> sortByid=(p1,p2)->p1.getName().compareTo(p2.getName());
	
	personLit.stream().sorted(sortByid).limit(2);
	
	Collections.sort(personLit, Comparator.comparing(Person::getName).thenComparingInt(Person::getAge)
		    );
	
	personLit.stream().map(x -> x.getName()).forEach(System.out::println);
	
	
	
	
	
}
}
