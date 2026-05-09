package ArrayPrg;
import java.util.*;

public class MissingNumbersInArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 7, 10};
        
        
        int start= 1;
        int end =10;
        
        Set<Integer> set = new HashSet<Integer>();
             
        for(int num :arr) {
        	set.add(num);
        	
        }
        System.out.println("Missing numbers in array");
        
        for (int i = start; i <=end; i++) {
        	
        	if(!set.contains(i)) {
        		System.out.print(i+" ");
        	}
			
		}

 
        
        
    }
}
