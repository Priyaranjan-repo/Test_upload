
public class SortArrayManual {

	// Function to sort the array in ascending order
	public static void sortAscending(int[] array) {
		int n = array.length;

		// Bubble sort algorithm to sort in ascending order
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (array[j] > array[j + 1]) {
					// Swap array[j] and array[j + 1]
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}

		// Printing the array
		System.out.print("Array in Ascending Order: ");
		for (int i = 0; i < n; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

	// Function to sort the array in descending order
	public static void sortDescending(int[] array) {
		int n = array.length;

		// Bubble sort algorithm to sort in descending order
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (array[j] < array[j + 1]) {
					// Swap array[j] and array[j + 1]
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}

		// Printing the array
		System.out.print("Array in Descending Order: ");
		for (int i = 0; i < n; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// Sample array
		int[] array = { 3, 5, 2, 1, 4 };

		// Sorting in Ascending Order
		sortAscending(array);

		// Sorting in Descending Order
		sortDescending(array);
	}
}
