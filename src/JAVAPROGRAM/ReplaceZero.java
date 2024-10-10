package JAVAPROGRAM;

import java.util.Scanner;

public class ReplaceZero
{

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();

		String str = Integer.toString(num);
		int len = str.length();
		String str1 = "";

		// logic
		for (int i = 0; i < len; i++) {
			if (str.charAt(i) == '0') {
				str1 = str1 + '5';
			} else {
				str1 = str1 + str.charAt(i);
			}
		}
		System.out.println("Converted the number is: " + str1);
	}
}

/*
 * int a = 100056740, count = 0, d; int num = a; while (num > 0) { count++; num
 * = num / 10; } int arr[] = new int[count]; int i = count - 1; while (a > 0) {
 * d = a % 10; a = a / 10; if (d == 0) { d = 5; arr[i--] = d; } for (int j = 0;
 * j < count; j++) { System.out.print(arr[j] + " ");
 * 
 * } } } }
 */
