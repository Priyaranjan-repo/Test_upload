package practice;

public class sumsingle {

	public static void main(String[] args) {

		System.out.println(getSingle(15456));

	}
	static int getSingle(int n) {

		int rem = 0;		
		int sum = 0;
		
		while (n > 9) {
			sum = 0;
			
			while (n > 0) {

				rem = n % 10;
				sum = sum + rem;
				n = n / 10;

			}
		n= sum;
		
}
		return sum;
	}
}
