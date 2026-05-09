package ArrayPrg;
import java.util.HashMap;
import java.util.Map;

public class FrequencyInArray {
    
	
	public static void main(String[] args) {
      
		int[] arr = {1, 2, 2, 3, 1, 4, 2, 3};

        Map<Integer, Integer> freqMap = new HashMap<>();

        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        System.out.println("Frequency of each element:");
        
        
        for(Integer i : freqMap.keySet()) {
        	
        	System.out.println(i+" --"+freqMap.get(i));
        
        //for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
          //  System.out.println(entry.getKey() + " occurs " + entry.getValue() + " times");
        }
    }
}
