package ArrayPrg;
import java.util.*;

public class SearchElementInArray {

    public static void main(String[] args) {
        int[] arr = {1, 3, 3, 4, 5, 6, 6, 7, 8, 9, 9};

        Scanner scanner = new Scanner(System.in);
       
        System.out.print("Enter the element to search: ");
        
        int search = scanner.nextInt();

        List<Integer> indices = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            
        	if (arr[i] == search) {
                indices.add(i);
            }
        }

        if (indices.isEmpty()) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element " + search + " found at indices: " + indices);
        }

        scanner.close();
    }
}
