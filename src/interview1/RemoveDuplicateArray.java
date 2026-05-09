package interview1;

import java.util.Arrays;

public class RemoveDuplicateArray {
	public static void main(String[] args) {

		  int arr[]={2,4,6,3,2,2,3,7,8,9,9,1,3,2,3};//[1,2,3,4,5]
		  
		  
		 int b[]= Arrays.stream(arr).distinct().toArray();
		 
		 System.out.println(Arrays.toString(b));
		  
		  
	}

}
