package ArrayPrg;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeSortedArraysStreams {
	public static void main(String[] args) {
		int[] array1 = { 1, 3, 5, 7 };
		int[] array2 = { 2, 4, 6, 8, 10 };

		
		int[] mergedArray = IntStream.concat(Arrays.stream(array1), Arrays.stream(array2)).sorted().toArray();

		
		System.out.println("Merged Sorted Array: " + Arrays.toString(mergedArray));
	}
}
