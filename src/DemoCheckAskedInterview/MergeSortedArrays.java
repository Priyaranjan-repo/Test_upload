package DemoCheckAskedInterview;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class MergeSortedArrays {

	public static int[] mergeSortedArrays(int[] arr1, int[] arr2) {
		Set<Integer> mergedSet = new TreeSet<>(); // TreeSet removes duplicates & keeps sorting

		for (int num : arr1) {
			mergedSet.add(num);
		}

		for (int num : arr2) {
			mergedSet.add(num);
		}

		// Convert Set to int[]
		int[] result = new int[mergedSet.size()];
		int i = 0;
		for (int num : mergedSet) {
			result[i++] = num;
		}

		return result;
	}

	public static void main(String[] args) {
		int[] arr1 = { 1, 3, 5, 7 };
		int[] arr2 = { 2, 3, 6, 7, 8 };

		int[] merged = mergeSortedArrays(arr1, arr2);

		System.out.println("Merged Array (no duplicates): " + Arrays.toString(merged));
	}
}
