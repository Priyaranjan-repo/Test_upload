package JAVAPROGRAM;

public class Demo {

	public static void main(String[] args) {

		String s1 = new String("Test");

		String s2 = new String("Test");
		
		String s3="Test";
		String s4 ="Test";

		System.out.println(s1 == s2);// false
		// both object pointing to heap memory
		
			System.out.println(s3 == s4); //true  -- two string ref pointing to same object in memory.

	}
}
