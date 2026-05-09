
package StringChallange;

//public class ReveseLastToFastwihoutChangeChar {

//	public static void main(String[] args) {
//
//		String s = "I Love Java";
//
//			 String a= "I Love Java";
//					// O/p Java Love I
//
//			 String word[]= a.split(" ");
//			
//			
//			 for (int i =  word.length-1;i>=0; i--) {
//				 
//				 System.out.print(word[i]+" ");
//				
//			}
//	}
//}


import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {

        int a[] = {2, 3, 5, 7, 7, 11};

        Set<Integer> set = new LinkedHashSet<>();

        for (int num : a) {
            set.add(num);
        }

        System.out.println("Array after removing duplicates: " + set);
    }
}