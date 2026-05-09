package interview1;
import java.util.HashMap;
import java.util.Map;

public class MaxMinCharFrequency {
    public static void main(String[] args) {
        String str = "successes  ";
        str = str.replaceAll("\\s+", ""); // Remove spaces if any
System.out.println(str);
        HashMap<Character, Integer> charCountMap = new HashMap<>();

        // Count frequency of each character
        for (char ch : str.toCharArray()) {
            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
        }

        // Initialize min and max
        char maxChar = ' ';
        char minChar = ' ';
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            int count = entry.getValue();
            char ch = entry.getKey();

            if (count > max) {
                max = count;
                maxChar = ch;
            }
            if (count < min) {
                min = count;
                minChar = ch;
            }
        }

        System.out.println("Maximum occurring character: '" + maxChar + "' occurred " + max + " times");
        System.out.println("Minimum occurring character: '" + minChar + "' occurred " + min + " times");
    }
}
