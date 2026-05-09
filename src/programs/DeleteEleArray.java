package programs;

import java.util.Arrays;

public class DeleteEleArray {

	public static void main(String[] args) {

//New array[1, 2, 4, 5]
		int a[] = { 1, 2, 3, 4, 5 };

		System.out.println("Original array" + Arrays.toString(a));
		int index = 2;

		int[] newArr = new int[a.length - 1];

		for (int i = 0, k = 0; i < a.length; i++) {

			if (i == index) {
				continue;
			}
			newArr[k++] = a[i];

		}
		System.out.println("New array" + Arrays.toString(newArr));

	}

}
