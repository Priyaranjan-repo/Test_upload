package DemoCheckAskedInterview;

public class MaxMin {

	public static void main(String[] args) {

		int arr[] = { 12, 34, 45, 23, 76, 345 };

		int max = arr[0];
		int min = arr[0];

		for (int i = 0; i < arr.length; i++) {

			if (max < arr[i]) {
				max = arr[i];
			} else if (min > arr[i]) {
				min = arr[i];
			}

		}
		System.out.println(max + " " + min);

	}
}
