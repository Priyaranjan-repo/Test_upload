package interview1;
import java.util.HashMap;
import java.util.Map;

public class LongestUniqueSubstringWithMap {
    public static void main(String[] args) {
        String s = "pwwkew";
        int length = lengthOfLongestSubstring(s);
        System.out.println("Length of Longest Substring Without Repeating Characters: " + length);
    }

    public static int lengthOfLongestSubstring(String s) {
        
    	Map<Character, Integer> map = new HashMap<>();
    	int maxLength = 0;
        
    	int start = 0; // Start index of current window
        for (int i = 0; i < s.length(); i++) {
            
        	char currentChar = s.charAt(i);
            // If character already seen, move start pointer
            
        	if (map.containsKey(currentChar)) {
                start = Math.max(map.get(currentChar) + 1, start);
            }

            map.put(currentChar, i); // Update the last seen index
            maxLength = Math.max(maxLength, i - start + 1);
        }

        return maxLength;
    }
}
