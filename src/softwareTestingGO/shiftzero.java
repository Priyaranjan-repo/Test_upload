package softwareTestingGO;

import java.util.Arrays;

public class shiftzero {

	public static void main(String[] args) {

		// [1, 7, 5, 0, 0, 4, 0, 2, 0, 3, 12]
		// [1, 7, 5, 4, 2, 3, 12, 0, 0, 0, 0]

		int arr[] = { 1, 7, 5, 0, 0, 4, 0, 2, 0, 3, 12 };

		System.out.println(Arrays.toString(arr));

		for (int n = 0; n < arr.length; n++) {

			for (int i = 0; i < arr.length - 1; i++) {

				if (arr[i] == 0) { // front 0

					int temp = arr[i + 1];
					arr[i + 1] = arr[i];
					arr[i] = temp;
				}

			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
