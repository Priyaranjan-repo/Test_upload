package ArrayPrg;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SecondHighestUsingJava8 {
	public static void main(String[] args) {
		int[] arr = { 45, 53, 91, 81, 76, 72, 35 };
		//java vesrion -24(3/5/25) 
		
		
		Optional<Integer> secondMax = Arrays.stream(arr)
				.boxed()
				.sorted(Comparator.reverseOrder())
				.skip(1)
				.findFirst();
//				.orElse(null);

		

		
		
		System.out.println("Second Highest: " + secondMax);
	}
}
