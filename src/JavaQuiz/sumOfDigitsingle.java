package JavaQuiz;

public class sumOfDigitsingle {

	public static void main(String[] args) {

		int n = 19761;

		int sum = 0;
		int rem = 0;
		while (n > 9) {
			

			sum = 0;
		
			while(n>0) {
			rem= n%10;
			sum= sum+rem;
			n= n/10;
		}
		n= sum;
	}
		System.out.println(sum);

	}

}