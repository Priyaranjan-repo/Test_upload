
public class VoewlandConsonant {

	public static void main(String[] args) {

//voewl print asked 
		String s = "this is new line in java ";

		char[] chars = s.toCharArray();

		int count = 0;
		int consotantCount = 0;

		for (int i = 0; i < s.length(); i++) {
			// char [] ch= Character.toUpperCase(chars);

			if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
					|| s.charAt(i) == 'u') {
				count++;

			} else {
				// else if(s.charAt(i)>='a' && s.charAt(i)<='z') {
				consotantCount++;
			}
		}

		System.out.println("vowel: " + count);

		System.out.println("Consotant: " + consotantCount);

	}

}
