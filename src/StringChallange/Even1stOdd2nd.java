package StringChallange;

import java.util.Arrays;

public class Even1stOdd2nd {

	// sum of
	public static void main(String[] args) {

		
		int arr[] = { 2, 5, 8, 7, 1, 3, 6, 4, 5, 9 };
		
		
		// Shift all even no. in left and odd no. to the r8.

		for (int i = 0; i < arr.length; i++) {

			
		for (int j = 0; j < arr.length - 1; j++) {

		
			if (arr[j] % 2 != 0 || (arr[j] % 2 == 1)) {

					// swap

					int t = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = t;

				}

			}

		}
		System.out.println(Arrays.toString(arr));

	}
}
