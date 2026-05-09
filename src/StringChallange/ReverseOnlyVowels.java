package StringChallange;

public class ReverseOnlyVowels {

	public static void main(String[] args) {

		String str = "Hello";
		String vowelsString = "aeiouAEIOU";

		char[] inputArray = str.toCharArray();

		int left = 0;
		int right = inputArray.length - 1;

		while (left < right) {

			if (vowelsString.indexOf(inputArray[left]) == -1) {
				left++;

			} else if (vowelsString.indexOf(inputArray[right]) == -1) {
				right--;
			}

			else {

				char temp;
				temp = inputArray[left];
				
				inputArray[left] = inputArray[right];
				
				inputArray[right] = temp;

				left++;
				right--;

			}
		}
		System.out.println(str);
		System.out.println("output:" + new String(inputArray));
	}

}
