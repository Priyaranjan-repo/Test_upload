package StringChallange;

public class ReverseNo {

	public static void main(String[] args) {

		int num = 23984;
		int revNo = 0;
		int digit;
		
		while (num != 0) {

		digit = num % 10;

		revNo = revNo * 10 + digit;

		num /= 10;

//		num = num / 10;
		}
		System.out.println(revNo);

	}
}
