package com.qa.JavaDemoPrg;

import java.util.Arrays;

public class ShiftZeroFront {

	public static void main(String[] args) {

		int a[] = { 10, 0, 20, 0, 30, 0, 40, 50, 60 };

		System.out.println(Arrays.toString(a));

		for (int i = 0; i < a.length; i++) {

			for (int j = 0; j < a.length - 1; j++) {

				if (a[j] != 0) {
					int temp = a[j + 1];
					a[j + 1] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}

}

//		
////			zero(a);
//		for (int i = 0; i < a.length; i++) {
//			System.out.print(" " + a[i]);
//		}
////		
//		
//		public static void zero(int arr[]) {
//
//			int count = 0;
//			int len = arr.length;
//
//			for (int i = 0; i < len; i++) {
//
//				if (arr[i] != 0) {
//					arr[count++] = arr[i];
//				}
//
//			}
//			while (count < len) {
//				arr[count++] = 0;
//
//			}
//		}
