package Interview;

import java.util.Arrays;
import java.util.Iterator;

public class ShiftZeroRight {

	public static void main(String[] args) {

	
		int a[] = { 2, 4, 0, 5, 0, 1, 0, 8, 3, 9 };

		System.out.println(Arrays.toString(a));
		for (int i = 0; i < a.length; i++) {

			for (int j = 0; j < a.length - 1; j++) {

				if (a[j] == 0) {
					int b = a[j + 1];
					a[j + 1] = a[j];
					a[j] = b;

				}
			}
		}
		System.out.println(Arrays.toString(a));

	}
}
