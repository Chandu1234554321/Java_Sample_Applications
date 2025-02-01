package java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import java.util.Map;

public class DuplicateList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        List<Integer> intList=Arrays.asList(1,3,4,4,5,6,6,6,6);
        
        List<Integer> duplicateList=
       
         intList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting() ) )
        .entrySet()
        .stream()
        .filter( p -> p.getValue() > 1 )
        .map( Map.Entry::getKey )
        .collect( Collectors.toList());
        
        System.out.println(duplicateList);

	}

}
