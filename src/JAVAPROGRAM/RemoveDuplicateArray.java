package JAVAPROGRAM;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateArray {

	public static void main(String[] args) {

		int[] arr = { 2, 3, 3, 11, 11, 44, 21, 13, 4, 50, 50 };

		Set<Integer> set = new HashSet<Integer>();

		for (int i = 0; i < arr.length; i++) {

			if (!set.add(arr[i])) {

				System.out.println("Duplicate element is:" + arr[i]);
			}
		}
	}
}
