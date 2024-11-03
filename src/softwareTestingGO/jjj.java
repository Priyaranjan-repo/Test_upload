package softwareTestingGO;

public class jjj {

	public static void main(String[] args) {

		/*
		 * Input: tomorrow Output: t#m##rr###w
		 * 
		 * 
		 * String s = "tomorrow";
		 * 
		 * String ch = s.replace("o", "#");
		 * 
		 * System.out.println(ch);
		 * 
		 * }
		 * 
		 * }
		 */

		// to sort and
		int array1[] = { 1234, 456, 2035, 1899, 2014 };

		int n = array1.length;

		// Bubble sort algorithm to sort the array
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (array1[j] > array1[j + 1]) {
					// Swap array[j] and array[j + 1]
					int temp = array1[j];
					array1[j] = array1[j + 1];
					array1[j + 1] = temp;
				}
			}
		}

	}
}
