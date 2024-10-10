package JAVAPROGRAM;

public class ShitZeroMiddle {

	public static void main(String[] args) {

		int arr[] = { 1, 0, 0, 3, 2, 0, 0 };

		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] != 0 && arr[j] != 0 && arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
	}
}
