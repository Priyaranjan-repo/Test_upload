package com.qa.JavaPractice;

public class RemoveSpclChar {

	public static void main(String[] args) {

		String removechar = "This@#$))is!##$&&an#&*In((*^$*(terview$*$";

		String aftre = removechar.replaceAll("[^a-zA-Z]", " ");
		System.out.println(aftre);

	}

}
