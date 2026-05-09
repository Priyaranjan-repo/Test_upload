package practice;
import java.util.*;

public class FirstNonRepeated {
    public static void main(String[] args) {

        String str = "aabbcddeff";
        char result = getFirstNonRepeated(str);

        System.out.println("First non-repeated character: " + result);
    }

    public static char getFirstNonRepeated(String str) {

        Map<Character, Integer> map = new LinkedHashMap<>();

        // Count frequency
        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Find first non-repeated
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
        	
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        return '_'; // if not found
    }
}