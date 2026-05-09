package practice;

public class jjcd {

//	Input  : I Am Not String
//	Output : g ni  rtS  toNmAI

	public static void main(String[] args) {

		revesePattern("I Am Not String");
	}

	public static void revesePattern(String str) {

		String wordArr[] = str.split(" ");

		StringBuffer allWord = new StringBuffer();
		for (String word : wordArr) {
			allWord.append(word);

		}
		System.out.println("string without spaces" + allWord);

		String reverseStr = allWord.reverse().toString();

		System.out.println("Revese string without spaces" + reverseStr);

		int startIndex = 0;
		int nextIndex = 0;

		StringBuffer finalStr = new StringBuffer();
		String tempStr = null;

		for (String word : wordArr) {

			nextIndex = nextIndex + word.length();
			tempStr = reverseStr.substring(startIndex, nextIndex);

			finalStr.append(tempStr + " ");
			startIndex = nextIndex;

		}

		System.out.println("\n Result :" + finalStr);

	}
}
