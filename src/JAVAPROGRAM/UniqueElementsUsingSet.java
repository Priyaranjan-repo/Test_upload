package JAVAPROGRAM;

import java.util.HashSet;
import java.util.Set;

public class UniqueElementsUsingSet {

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 2, 3, 5, 6, 1 };
		int[] uniqueElements = findUniqueElements(array);

		System.out.println("Unique elements in the array:");
		for (int element : uniqueElements) {
			System.out.print(element + " ");
		}
	}

	public static int[] findUniqueElements(int[] arr) {
		Set<Integer> uniqueSet = new HashSet<>();
		Set<Integer> duplicateSet = new HashSet<>();

		// Iterate through the array and add elements to uniqueSet if not seen before
		// If an element is already in uniqueSet, add it to duplicateSet
		for (int num : arr) {
			if (!duplicateSet.contains(num)) {
				if (!uniqueSet.add(num)) {
					uniqueSet.remove(num);
					duplicateSet.add(num);
				}
			}
		}

		// Remove elements present in duplicateSet from uniqueSet
		uniqueSet.removeAll(duplicateSet);

		// Convert uniqueSet to an array
		int[] uniqueElements = uniqueSet.stream().mapToInt(Integer::intValue).toArray();

		return uniqueElements;
	}
}
