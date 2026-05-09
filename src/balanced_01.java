import java.util.Stack;

public class balanced_01 {

	public static void main(String[] args) {

		String input = "()";

		System.out.println(checkParanthesis(input));

	}

	private static boolean checkParanthesis(String input) {

		char[] inputArr = input.toCharArray();

		Stack<Character> st = new Stack();

		for (char currChar : inputArr) {

			if (currChar == '(') {
				st.push(currChar);
			} else if (currChar == ')') {
				if (st.isEmpty()) {
					return false; // mismatched occured ! no opening brackets pending

				} else {
					Character topChar = st.pop();
					if (topChar != '(') {
						return false;
					}

				}

			}

		}

		return st.isEmpty();

	}

}
