package interview1;
import java.util.*;
import java.util.stream.*;

public class ThirdHighestJava8 {
    public static void main(String[] args) {
    	   int arr[]={2,4,6,7,8,9,31,34};

       Integer thirdHighest =  Arrays.stream(arr)
               .boxed()                             // Convert int[] to Stream<Integer>
               .distinct()                          // Remove duplicates
               .sorted(Comparator.reverseOrder())   // Sort in descending order
               .skip(2)                              // Skip first two highest
               .findFirst()
               .orElse(null);
       
       System.out.println("3rd Highest Number: " + thirdHighest);
      
       
       // Get the 3rd highest

//     if(thirdHighest.isPresent()) {
//		System.out.println("3rd Highest Number: " + thirdHighest);
//	}
//     else {
//            System.out.println("Less than 3 unique elements.");
      
    }
    }

