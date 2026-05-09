package programs;
import java.security.PublicKey;

public class BubbleSort {
	

	    public static void main(String[] args) {

	        int n[] = {9, 8, 7, 5, 6};

	        // Before sorting
	        for (int i : n) {
	            System.out.print(i + " ");
	        }

	        bubblesort(n);

	        System.out.println("\nAfter sorting");

	        // After sorting
	        for (int i : n) {
	            System.out.print(i + " ");
	        }
	    }

	    public static void bubblesort(int[] intArray) {

	        for (int i = 0; i < intArray.length - 1; i++) {

	            for (int j = 0; j < intArray.length - 1 - i; j++) {

	                // ✅ Correct comparison
	                if (intArray[j] > intArray[j + 1]) {

	                    int temp = intArray[j];
	                    intArray[j] = intArray[j + 1];
	                    intArray[j + 1] = temp;
	                }
	            }
	        }
	    }

	}
