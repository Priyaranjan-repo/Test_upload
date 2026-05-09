package practice;

import java.util.Scanner;

public class gkj {

	public static void main(String[] args) {

//		String s = "pushparaj";
//		char c = 'p';
//		int count = 0;
//
//		for (int i = 0; i < s.length(); i++) {
//
//			if (s.charAt(i) == c) {
//				count++;
//			}
//
//		}
//		System.out.println(count);
//
//	}
//}
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String :");
		String str = sc.nextLine();

		System.out.println("Enter Character :");
		char c = sc.next().charAt(0);
		int ocurrence = 0;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == c) {
				ocurrence++;
			}
		}

		System.out.println("Number of occurrenced of Char " + c + " is " + ocurrence);

	}
}