import java.util.Arrays;

public class ShiftZeoFront {

	public static void main(String[] args) {

		int a[] = { 12, 45, 0, 76, 20, 35, 18, 99, 0, 20, 14, 0 };

		System.out.println(Arrays.toString(a));
		for (int i = 0; i < a.length; i++) {

			for (int j = 0; j < a.length - 1; j++) {

				if (!(a[j] == 0)) {

					int temp = a[j + 1];
					a[j + 1] = a[j];
					a[j] = temp;

				}

			}

		}
		System.out.println(Arrays.toString(a));

	}

}
