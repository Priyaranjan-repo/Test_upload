package JAVAPROGRAM;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {

        int[] arr = {1, 3, 5, 7};
        int target = 12;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {

            int complement = target - arr[i];

            if (map.containsKey(complement)) {
               
            	System.out.println("Output: {" + map.get(complement) + ", " + i + "}");
                
            	return;
            }

            map.put(arr[i], i);
        }
    }
}