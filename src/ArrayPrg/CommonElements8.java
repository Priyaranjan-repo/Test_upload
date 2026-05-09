package ArrayPrg;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CommonElements8 {
	public static void main(String[] args) {
		// Initialize two arrays
		int[] array1 = { 1, 2, 3, 4, 5 };
		int[] array2 = { 3, 4, 5, 6, 7 };

		// Convert arrays to lists using Arrays.stream() and find common elements using
		// Java 8 Streams

		List<Integer> commonElements = Arrays.stream(array1).boxed() // Convert int[] to Integer stream
				.filter(value -> Arrays.stream(array2).anyMatch(element -> element == value)) // Check if the element
																								// exists in array2
				.collect(Collectors.toList()); // Collect the results into a list

		// Print the common elements
		System.out.println("Common Elements: " + commonElements);
	}
}
