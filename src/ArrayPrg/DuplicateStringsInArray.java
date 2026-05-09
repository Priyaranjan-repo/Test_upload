package ArrayPrg;
import java.util.HashMap;
import java.util.Map;

public class DuplicateStringsInArray {
    public static void main(String[] args) {
        String[] arr = {"apple", "banana", "apple", "orange", "banana", "grape"};

        Map<String, Integer> freqMap = new HashMap<>();
        

        for (String str : arr) {
         
        	freqMap.put(str, freqMap.getOrDefault(str,0)+1);
        }

               System.out.println("Duplicate elements:");
        
        
        for (Map.Entry<String, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " occurs " + entry.getValue() + " times");
            }
        }
    }
}
