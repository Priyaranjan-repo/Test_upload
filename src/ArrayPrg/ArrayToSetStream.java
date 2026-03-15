package ArrayPrg;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class ArrayToSetStream {

	public static void main(String[] args) {
		Integer[] numbers = { 1, 2, 3, 4, 5, 2, 3 }; // Set: [1, 2, 3, 4, 5]

		//Set<Integer> set = Arrays.stream(numbers).collect(Collectors.toSet());
		
		
		Set<Integer> set = new HashSet<Integer>(Arrays.asList(numbers));
		

		System.out.println("Set: " + set);
	}
}
