package com.qa.JavaPractice;

public class StringPoolcheck {

	public static void main(String[] args) {

		String s1 = "342";
		String s2 = "456";

		int sum = Integer.valueOf(s1) + Integer.valueOf(s2);
		int sum1 = Integer.parseInt(s1);
		int sum2 = Integer.parseInt(s2);

		System.out.println(sum);
		System.out.println(sum1);
		System.out.println(sum2);

		String n1 = "java";
		String n2 = "java";
		String n3 = n1;

		String sg = new String("java");
		String sg1 = new String("java");

		System.out.println(n1 == n2);// true
		System.out.println(n1 == n3); // true
		System.out.println(n2 == n3); // true
		System.out.println(sg == sg1);// false
		System.out.println(sg1 == sg);// false

	}

}
// String s ="hellow world";  how many object will created.  1 object created.
//String str= new String("hellow world");2 object will created.