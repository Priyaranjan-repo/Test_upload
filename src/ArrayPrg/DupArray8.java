package ArrayPrg;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class DupArray8 {

	public static void main(String[] args) {

		// duplicate ele :20
//		duplicate ele :30
//		duplicate ele :10

		int n[] = { 10, 20, 30, 40, 20, 30, 50, 10, 60 };
		dupUsingSet(n);
	}

	public static void dupUsingSet(int [] arr) {

	int b[]= Arrays.stream(arr).distinct().toArray();
	
	System.out.println(Arrays.toString(b));

		}
	
}
