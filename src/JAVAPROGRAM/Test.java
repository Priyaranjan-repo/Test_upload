package JAVAPROGRAM;

public class Test {

	public static void main(String[] args) {

		String a = "demo";
		String b = "demo";
		String c = new String("demo");
		String d = new String("demo");

		System.out.println(a == b);// false
		System.out.println(a == c);// false
		System.out.println(a.equals(c));

	}

}
