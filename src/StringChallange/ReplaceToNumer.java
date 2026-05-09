package StringChallange;

public class ReplaceToNumer {

	public static void main(String[] args) {

		String s = "opentextfrttrt";
		char charToReplace = 't'; // output =open1ex2;

//check char is not present retuern -1
		if (s.indexOf(charToReplace) == -1) {
			System.out.println("Given char not available in input string");

		}
		// logic to replace character ioccurance in string.
		int cnt = 1;

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);

			if (ch == charToReplace) {
				s = s.replaceFirst(s.valueOf(charToReplace), String.valueOf(cnt));

				cnt++;
			}

		}
		System.out.println(s);

	}
}
