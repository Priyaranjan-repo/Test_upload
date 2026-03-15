package StringChallange;

public class AddWithX {// in vowel add X  //  asked inyerview altermetrix   aqdd x in voewl

	public static void main(String[] args) {

		String name = "HelloJAvA";

		name = name.toLowerCase();

		StringBuilder sb = new StringBuilder();
		
		for (char ch : name.toCharArray()) {

			if (isVowels(ch)) {

				sb.append('x');
			} else {
				sb.append(ch);
			}
		}
		System.out.println(sb.toString());

	}
	static boolean isVowels(char ch) {

		if (ch == 'a' || ch == 'e' || ch == 'I' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
				|| ch == 'O' || ch == 'U') {
			return true;
		} else {
			return false;
		}

	}
}
