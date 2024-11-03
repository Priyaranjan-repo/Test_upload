package com.qa.JavaPractice;

public class RemoveSpclChar {

	public static void main(String[] args) {

		String removechar = "This@#$)3546468)is!##$&&an#&*In((*^$*(terview$*$";

		String alpha = removechar.replaceAll("[^a-zA-Z]", "");// remove spcl char

		String number = removechar.replaceAll("[^0-9]", " ");// remove apha
		System.out.println(alpha);
		System.out.println(number);

	}

}
