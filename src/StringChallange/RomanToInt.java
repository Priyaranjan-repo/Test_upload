package StringChallange;

import java.util.HashMap;

public class RomanToInt {

	public static void main(String[] args) {

		String input = "VIII";

		HashMap<Character, Integer> romanMap = new HashMap<Character, Integer>();

		romanMap.put('I', 1);
		romanMap.put('V', 5);
		romanMap.put('X', 10);

		int result = 0;
		int prevoiusValue = 0;

		for (int i = input.length() - 1; i >= 0; i--) {

			char currChar = input.charAt(i);
			int currValue = romanMap.get(currChar);

			if (currValue >= prevoiusValue) {
				result = result + currValue;

			} else {
				result = result - currValue;
			}
			prevoiusValue = currValue;

		}
		System.out.println("Integer format for" + input + " " + result);

	}

}
