package ArrayPrg;

import java.util.ArrayList;
import java.util.List;

public class MissingNoSortArray {

	public static void main(String[] args) {
		int[] sortedArray = { 1, 2, 4, 7, 8, 10 }; // Example input

		List<Integer> missingNumbers = new ArrayList<>();

		
		
		for (int i = 0; i < sortedArray.length - 1; i++) {

			int current = sortedArray[i];

			int next = sortedArray[i + 1];

			// Check if there is a gap between consecutive numbers

			for (int j = current + 1; j < next; j++) {

			
				missingNumbers.add(j);
			}
		}

		// Print missing numbers
		System.out.println("Missing Numbers: " + missingNumbers);
	}
}
