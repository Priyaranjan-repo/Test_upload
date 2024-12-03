package softwareTestingGO;

public class ReverseEach {

	public static void main(String[] args) {
		String input = "I am giving selenium interview";
		String word[] = input.split(" ");
		String op = "";

		for (int i = 0; i < word.length; i++) {

			op = op + new StringBuffer(word[i]).reverse().toString() + "";
		}
		System.out.println(op);

	}

}
