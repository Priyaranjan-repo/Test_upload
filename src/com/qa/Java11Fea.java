package com.qa;

import java.util.Arrays;
import java.util.List;

public class Java11Fea {
	
	public static void main(String[] args) {
		

	String str = "  Hello Java  ";
	System.out.println(str.isBlank());        // true if the string is empty or contains only white space
	System.out.println(str.strip());          // removes leading and trailing whitespaces
	System.out.println(str.stripLeading());   // removes leading whitespaces
	System.out.println(str.stripTrailing());  // removes trailing whitespaces
	System.out.println("Line1\nLine2".lines().count());  // count lines in a string
	
	
	
	
	System.out.println("var in Lambda Parameters");
	
	List<String> list = List.of("Java", "Python");
	list.forEach((var item) -> System.out.println(item));

	
	System.out.println(" collection to array -------------");
	
	
	List<String> list1 = List.of("A", "B", "C");
	String[] array = list1.toArray(String[]::new);
	////////////
	System.out.println(Arrays.toString(array));
	
	//java 8 features
	//Predicate<Integer> isEven = n -> n % 2 == 0;
//	Consumer<String> print = s -> System.out.println(s);
//	Supplier<String> supplier = () -> "Hello";
//	Function<String, Integer> length = s -> s.length();
//	
	//. Streams API
	//2. Functional Interfaces
	// 8. Collectors

	}
}
																							