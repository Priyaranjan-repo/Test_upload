package JAVAPROGRAM;

import java.util.HashMap;
import java.util.Map;

public class UniqueElesInArray {

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 2, 3, 5, 6, 1 };
		int[] uniqueElements = findUniqueElements(array);

		System.out.println("Unique elements in the array:");

		for (int element : uniqueElements) {
			System.out.print(element + " ");
		}
	}

	public static int[] findUniqueElements(int[] arr) {
		Map<Integer, Integer> elementCount = new HashMap<>();

		// Count occurrences of each element
		for (int num : arr) {
			if (elementCount.containsKey(num)) {
				elementCount.put(num, elementCount.get(num) + 1);
			} else {
				elementCount.put(num, 1);
			}
		}

		// Find unique elements
		int count = 0;
		for (Map.Entry<Integer, Integer> entry : elementCount.entrySet()) {
			if (entry.getValue() == 1) {
				count++;
			}
		}

		int[] uniqueElements = new int[count];
		int index = 0;
		for (Map.Entry<Integer, Integer> entry : elementCount.entrySet()) {
			if (entry.getValue() == 1) {
				uniqueElements[index++] = entry.getKey();
			}
		}

		return uniqueElements;
	}
}
