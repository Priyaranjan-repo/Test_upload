package ArrayPrg;

import java.util.Arrays;

public class StringArrayMerger {
	public static void main(String[] args) {
		// Step 1: Define two string arrays
		
		String[] array1 = { "Apple", "Banana", "Cherry" };
		String[] array2 = { "Date", "Fig", "Grape" };

		// Step 2: Create a merged array

		String[] mergedArray = new String[array1.length + array2.length];

		// Step 3: Copy elements from both arrays to the merged array

		System.arraycopy(array1, 0, mergedArray, 0, array1.length);

		System.arraycopy(array2, 0, mergedArray, array1.length, array2.length);

		// Step 4: Display the merged array
		System.out.println("Merged array: " + Arrays.toString(mergedArray));
	}

}
