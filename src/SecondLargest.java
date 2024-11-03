
public class SecondLargest {

	public static void main(String[] args) {

		int b[] = { 44, 66, 99, 77, 33, 22 };

		System.out.println("Second Largest number is =" + getSecondLargest(b, 6));
	}

	public static int getSecondLargest(int a[], int total) {
		int temp;

		for (int d = 0; d < total; d++) {
			for (int e = d + 1; e < total; e++) {
				if (a[d] > a[e]) {
					temp = a[d];
					a[d] = a[e];
					a[e] = temp;
				}
			}
		}
		return a[total - 2];

	}
}
