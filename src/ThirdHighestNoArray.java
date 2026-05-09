import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThirdHighestNoArray {

	public static void main(String[] args) {
		int arr[]= {3,5,7,45,8,9};
		
		int thirdHighest=Arrays
				.stream(arr)
				.boxed()
				.sorted(Collections.reverseOrder())
				.skip(2)
				.findFirst()
				.orElse(null);
		
		
		System.out.println(thirdHighest);
				
				
		
		
		
		
		
	}

}
