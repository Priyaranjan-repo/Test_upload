package JAVAPROGRAM;

import java.util.HashMap;
import java.util.Map;

public class ReverseEachw {
	// Count no of vowel and print each vowel no of time present in string
	// String s= "I am a good boy";
	// total vowel-> 6,i=1,a=2,o=3,y=1 index for loop,str.charAt(i)=='a'||,
	// put map and found occurance

	public static void main(String[] args) {

		String s = "i am a good boy";

		Map<Character, Integer> map = new HashMap<Character, Integer>();

		int count = 0;

		for (int i = 0; i < s.length(); i++) {

			if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
					|| s.charAt(i) == 'u') {
				count++;

				if (map.containsKey(s.charAt(i))) {
					map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
				} else {
					map.put(s.charAt(i), 1);
				}
			}
		}
		System.out.println("Total vowel is : " + count);
		System.out.println(map);
	}

}
