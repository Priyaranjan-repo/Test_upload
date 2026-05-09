package Interview;

import java.util.Arrays;

public class ShiftZeroFront {
	public static void main(String[] args) {

		int arr[] = { 2, 0, 3, 0, 1, 0, 1, 9 };

		System.out.println(Arrays.toString(arr));

		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr.length - 1; j++) {

				if (arr[j] != 0) { // if (arr[j] == 0) {

					int b = arr[j + 1];

					arr[j + 1] = arr[j];

					arr[j] = b;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
