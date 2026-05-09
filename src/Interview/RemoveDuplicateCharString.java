package Interview;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateCharString {

    public static void main(String[] args) {
    	
        String input = "aabbccddeeffrrd";
        
        StringBuilder result = new StringBuilder();

         Set<Character> set = new HashSet<>();

        for (char ch : input.toCharArray()) {
            
        	if (!set.contains(ch)) {
                set.add(ch);
                result.append(ch);
            }
        }
        System.out.println("Original: " + input);
        System.out.println("Without duplicates: " + result);
    }
}
