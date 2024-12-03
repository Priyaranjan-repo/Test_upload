package com.qa.JavaDemoPrg;

public class ArrayShift {

	public static void main(String[] args) {

		// ouput = fast to last digit //20 30 40 50 60 10
		int arr[] = { 10, 20, 30, 40, 50, 60 };

		// store ele in temp varaiv

		int temp = arr[0];

		// shift second to 1st
		for (int i = 1; i < arr.length; i++) {
			arr[i - 1] = arr[i];// 20,30,40,0

		}
		// strore temp varaible in to last position
		arr[arr.length - 1] = temp;

		for (int i : arr) {
			System.out.print(i + " ");

		}
	}

}
