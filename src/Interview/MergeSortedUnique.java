package Interview;

import java.util.Set;
import java.util.TreeSet;

public class MergeSortedUnique {
    public static int[] mergeUnique(int[] a, int[] b) {
      
    	
    	Set<Integer> set = new TreeSet<>();
        
    	for (int num : a) {
			set.add(num);
		}
        for (int num : b) {
			set.add(num);
		}
        return set.stream().mapToInt(i -> i).toArray();
    }
}
