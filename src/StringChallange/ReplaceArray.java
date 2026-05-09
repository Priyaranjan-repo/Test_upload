package StringChallange;

public class ReplaceArray {

	public static void main(String[] args) {

		
		String str = "1ab2"; // op = 1ba2

		int left = 0;

		int right = str.length() - 1;

		char[] charArray = str.toCharArray();

		while (left < right) {

			if (!Character.isLetter(charArray[left])) {
				left++;
			} else if (Character.isLetter(charArray[right])) {
				right--;
			} else {
				char temp;
				temp = charArray[left];
				charArray[left] = charArray[right];
				charArray[right] = temp;
				left++;
				right--;
			}

		}
		System.out.println("output " + new String(charArray));

	}

}
