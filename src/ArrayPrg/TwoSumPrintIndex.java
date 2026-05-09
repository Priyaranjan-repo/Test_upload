package ArrayPrg;
import java.util.HashMap;
import java.util.Map;

public class  TwoSumPrintIndex {
	
	
    public static int[] twoSum(int[] num, int target) {
       
    	
    	Map<Integer, Integer> map = new HashMap<>();

    	for (int i = 0; i < num.length; i++) {
                   
    		int complement = target - num[i];
           
        if (map.containsKey(complement)) {
                // Return 1-based indices
                return new int[] { 
               map.get(complement) + 1, i + 1 };
            }
            map.put(num[i], i);
        }

        // If no solution is found
        return new int[] { -1, -1 };
    
    }

    public static void main(String[] args) {
        int[] numbers = {2, 7, 11, 15};
        int target = 18;

        int[] result = twoSum(numbers, target);
        System.out.println("Output: [" + result[0] + ", " + result[1] + "]");
    }
}
