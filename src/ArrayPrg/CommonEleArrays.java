package ArrayPrg;

import java.util.HashSet;

public class CommonEleArrays {
	public static void main(String[] args) {

		int[] array1 = { 1, 2, 3, 4, 5, 6 };
		int[] array2 = { 4, 5, 6, 7, 8, 9 };

		findCommonElements(array1, array2);
	}

	public static void findCommonElements(int[] arr1, int[] arr2) {
		HashSet<Integer> set = new HashSet<>();
		HashSet<Integer> commonElements = new HashSet<>();

		// Add elements of first array to HashSet
		for (int num : arr1) {
			set.add(num);
		}

		// Check common elements
		for (int num : arr2) {
			if (set.contains(num)) {
				commonElements.add(num);
			}
		}

		// Print common elements
		System.out.println("Common Elements: " + commonElements);
	}

}
