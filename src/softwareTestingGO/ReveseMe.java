package softwareTestingGO;

public class ReveseMe {

	public static void main(String[] args) {

		String input = "I am giving selenium interview";
		String word[] = input.split(" ");

		for (String s : word) {
			System.out.print(ReveseMe(s) + " ");
		}
	}

	public static String ReveseMe(String s1) {
		String reverse = " ";

		for (int i = 0; i < s1.length(); i++) {
			reverse = s1.charAt(i) + reverse;
		}
		return reverse;

	}
}
