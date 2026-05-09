package ArrayPrg;

import java.util.Arrays;
import java.util.Collections;

public class ReverseSortStream {

	public static void main(String[] args) {
		int[] arr = { 5, 2, 8, 1, 9, 3 };

		// Sorting using streams
		int[] sortedDesc = Arrays.stream(arr).boxed() // Convert int to Integer
				.sorted(Collections.reverseOrder()) // Sort in descending order
				.mapToInt(Integer::intValue) // Convert back to int
				.toArray();

		
		System.out.println("Sorted in Reverse Order: " + Arrays.toString(sortedDesc));

	}
}
