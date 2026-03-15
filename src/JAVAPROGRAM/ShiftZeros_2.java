package JAVAPROGRAM;

public class ShiftZeros {

	public static void moveZero(int[] arr) {
		int len = arr.length;
		int count = 0;

		for (int i = 0; i < len; i++) {
			if (arr[i] != 0) {
				arr[count++] = arr[i];
			}
		}
		while (count < len) {
			arr[count++] = 0;
		}
		// for (int j = 0; j < len; j++) {
		// System.out.print(" " + arr[j]);
	}

	public static void main(String[] args) {
		int arr[] = { 1, 7, 5, 0, 0, 4, 0, 2, 9, 0, 3, 12 };
		moveZero(arr);

		System.out.println("After shift zeros at end");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" " + arr[i]);

		}
	}

}

/*
 * public static void main(String[] args) {
 * 
 * int arr[] = { 2, 9, 0, 3, 0, 0, 6, 0, 1, 7 }; int len = arr.length; int count
 * = 0;
 * 
 * for (int i = 0; i < len; i++) { if (arr[i] != 0) { arr[count++] = arr[i]; } }
 * while (count < len) { arr[count++] = 0; } for (int j = 0; j < len; j++) {
 * System.out.print(" " + arr[j]); } }
 */
// for(int i=0;i <len; i++) {

/*
 * public static int[] shiftZero(int[] a) {
 * 
 * if (a.length == 1) {
 * 
 * return a; } int newArray[] = new int[a.length]; int count = 0; for (int num :
 * a) { if (num != 0) { newArray[count] = num; count++; } } return newArray; }
 * 
 * public static void main(String[] args) {
 * 
 * int arr[] = { 1, 0, 2, 5, 0, 4, 8, 7 };
 * 
 * System.out.println(Arrays.toString(shiftZero(arr))); } }
 */
