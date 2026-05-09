package ArrayPrg;

import java.util.HashSet;
import java.util.Set;

public class DupArrayPrint {

	public static void main(String[] args) {

//		3.	Find duplicates in an array or list

		int[] a  = { 1, 2, 5, 6, 87, 5, 87, 78, 6, 6, 7, 2 };

		Set<Integer> set = new HashSet<Integer>();

        for (int n: a){
            set.add(n);

        }

        System.out.println(set);
		
		
	}
}
