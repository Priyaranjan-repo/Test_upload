package StringChallange;

public class ChangingKey {
	public static void main(String[] args) {

		String str = "abBacde";

		int count = 0;
		
		char lastkey = str.toCharArray()[0];
		
		lastkey = Character.toLowerCase(lastkey);

		// System.out.println(lastkey);

		
		for (int i = 0; i <= str.length() - 1; i++) {
		
			char currKey = str.toCharArray()[i];
			currKey = Character.toLowerCase(currKey);

			
			if (currKey != lastkey) {
				count++;

				
			}
			
			lastkey = currKey;

		}
		
		System.out.println("the total changing keys: " + count);
	}
}
