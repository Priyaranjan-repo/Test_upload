import java.util.Arrays;

public class removedupl {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 5, 66, 743, 23, 53, 1, 4, 5, 2, 4 };

		int[] b = Arrays.stream(arr).distinct().toArray();
		System.out.println(Arrays.toString(b));

	}
}

/*
 * Set<Integer> set = new HashSet<Integer>(); for (int i : arr) {
 * 
 * if (set.add(i)) { System.out.print(" " + i); }
 * 
 * }
 * 
 * } }
 */