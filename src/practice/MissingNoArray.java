package practice;

public class MissingNoArray {

	public static void main(String[] args) {

		int arr[] = { 6, 7 };

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] != i + 1) {

				System.out.println("Missing num is: " + (i + 1));
				break;
			}
		}
	}

}
