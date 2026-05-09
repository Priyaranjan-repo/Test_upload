package java8Prgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortArray {
	
	
	public static void main(String[] args) {
	
		
		
	List<Integer> unsortedList =  Arrays.asList(10,3,4,89,23,5);
	
	
	List<Integer> sortedList = unsortedList
	.stream()
	.sorted()
	.collect(Collectors.toList());
	
	
	System.out.println(sortedList);
	

}
}
