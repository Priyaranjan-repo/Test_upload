package JAVAPROGRAM;

public class Factorial1 {

	public static void main(String[] args) {
		FactNumber();

	}

	static void FactNumber() {
		int fact = 1;
		int n = 5;
		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}
		System.out.println("factorial no is n:" + fact);

	}

}
