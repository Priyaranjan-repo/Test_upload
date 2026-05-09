package StringChallange;

public class VoewlandConsonant {

	public static void main(String[] args) {

//voewl print asked 
		String s = "this is new line in java ";

		char[] chars = s.toCharArray();

		int vowel = 0;
		int consotantCount = 0;

		for (int i = 0; i < s.length(); i++) {

			char ch = s.charAt(i);

			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o'
					|| ch == 'u') {
				vowel++;

			} else {
				// else if(s.charAt(i)>='a' && s.charAt(i)<='z') {
				consotantCount++;
			}
		}

		System.out.println("vowel: " + vowel);

		System.out.println("Consotant: " + consotantCount);

	}

}
