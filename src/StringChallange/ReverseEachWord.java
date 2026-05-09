package StringChallange;

public class ReverseEachWord {

	public static void main(String[] args) {
		String ip = "Java is awesome";   //avaJ si emosewa 

		String[] words = ip.split(" ");

		for (String revWd : words) {

			System.out.print(reveseMe(revWd) + " ");

		}
	}

	public static String reveseMe(String s) {
		String rev = "";
		for (int i = 0; i < s.length(); i++) {
			rev = s.charAt(i) + rev;
		}

		return rev;
	}

	// System.out.println("Output: " + result.toString().trim());

}
