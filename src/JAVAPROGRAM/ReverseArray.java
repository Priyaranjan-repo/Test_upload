package JAVAPROGRAM;

public class ReverseArray {

	public static void main(String[] args) {

		int arr[] = { 14, 26, 13, 24, 83, 19, 129 };

		for (int i = arr.length - 1; i >= 0; i--) {

			System.out.println(arr[i]);
		}
	}
}

//		int i = 0, j = arr.length - 1, temp;
//		while (i < j) {
//			temp = arr[i];
//			arr[i] = arr[j];
//			arr[j] = temp;
//			i++;
//			j--;
//
//		}
//		System.out.print(Arrays.toString(arr));
