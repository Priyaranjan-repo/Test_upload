package JAVAPROGRAM;

public class anagramcheck {

	public static void main(String[] args) {
		anagramcheck ob = new anagramcheck();
		String Result = ob.isAnagram("a", "ab");
		String Result1 = ob.isAnagram("care", "race");
		System.out.println(Result);
		System.out.println(Result1);

	}

	private String isAnagram(String a, String b) {
		int count[] = new int[256];

		if (a.length() == b.length()) {
			for (int i = 0; i < a.length(); i++) {
				count[a.charAt(i)]++;
				count[b.charAt(i)]--;
			}
			for (int i = 0; i < count.length; i++) {
				if (count[i] != 0) {
					return " Not Anagram";
				}
			}
			return "  Anagram";
		}
		return "Not Anagram";
	}
}
