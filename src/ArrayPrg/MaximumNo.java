package ArrayPrg;

public class MaximumNo {

	public static void main(String[] args) {

		int a[] = { 160, 207, 30, 98, 6675 };

		int max = a[0];
		int min = a[0];

		for (int i = 0; i < a.length; i++) {

			if (a[i] > max) {
				max = a[i];
			}

			else if (a[i] < min) {
				min = a[i];
			}
		}
		System.out.println(max);

		System.out.println(min);

	}

}
