package com.qa.JavaPractice;

public class ReveseLastToFast {

	public static void main(String[] args) {

		// revesrse last to fast without chage sentence
		String s = "Toady is java interview  ";

		// Output ="interview java is Today"

		String wordArry[] = s.split(" ");

		for (int i = wordArry.length - 1; i >= 0; i--) {

			System.out.print(" " + wordArry[i]);

		}

	}

}
