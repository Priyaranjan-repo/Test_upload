package JAVAPROGRAM;

public class SecondLargestArry {

	public static void main(String[] args) {

		int[] numbers = { 12, 45, 8, 23, 56, 7, 34, 19, 67 };

		int secondHighest = findSecondHighest(numbers);

		System.out.println("Second highest number in the array is: " + secondHighest);
	}

	public static int findSecondHighest(int[] arr) {
		if (arr.length < 2) {
			System.out.println("Array should have at least two elements.");
			return -1; // Indicates an error or invalid input
		}

		int highest = Integer.MIN_VALUE;
		int secondHighest = Integer.MIN_VALUE;

		for (int num : arr) {

			if (num > highest) {
				secondHighest = highest;
				highest = num;
			} else if (num > secondHighest && num < highest) {
				secondHighest = num;
			}
		}

		return secondHighest;
	}
}
