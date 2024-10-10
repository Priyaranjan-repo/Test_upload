package JAVAPROGRAM;

public class StringConcat{

	public static void main(String[] args) {

		String x = "abc";
		String y = "abc";

		String z = x.concat(y);

		System.out.println(x);// abc
		System.out.println(y);// abc
		System.out.println(z);// abcabc
	}
}
