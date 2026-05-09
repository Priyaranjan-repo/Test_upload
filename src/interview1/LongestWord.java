package interview1;

public class LongestWord {
	public static void main(String[] args) {
		String str = "i learn java programming";

		String[] words = str.split(" ");
		String longest = "";
		
		String smallest = words[0];

		for (String wd : words) {

			if (wd.length()>longest.length()) {

				longest = wd;
			}
			else if(wd.length()<=smallest.length()) {
				smallest = wd;
			}
		}

		System.out.println("Longest word: " + longest);
		System.out.println("smallest word: " + smallest);
	}
}
