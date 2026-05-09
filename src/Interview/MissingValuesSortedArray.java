package Interview;

public class MissingValuesSortedArray {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 4, 5, 7, 10 }; // Example sorted array

		System.out.println("Missing numbers in the array:");
		findMissingNumbers(arr);

	}

	public static void findMissingNumbers(int[] arr) {
		if (arr == null || arr.length < 2) {
			System.out.println("Not enough elements to find missing values.");
			return;
		}

		for (int i = 0; i < arr.length - 1; i++) {
			int current = arr[i];
			int next = arr[i + 1];

			// If the difference is more than 1, numbers are missing
			for (int j = current + 1; j < next; j++) {
				System.out.print(j + " ");
			}
		}
	}

}
