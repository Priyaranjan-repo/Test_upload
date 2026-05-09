package ArrayPrg;

public class SubarrayWithGivenSum {
 
	public static void main(String[] args) {
       
		
		int[] arr = {1, 2, 3, 7, 5};
        
		int target = 12;
        
        
		boolean found = false;

        
		for (int i = 0; i < arr.length; i++) {
            
        	int sum = arr[i];
            
        	for (int j = i + 1; j <= arr.length; j++) {
               
        		if (sum == target) {
                
        			System.out.print("Subarray found from index " + i + " to " + (j - 1) + ": ");
                    for (int k = i; k < j; k++) {
                        System.out.print(arr[k] + " ");
                    }
                    System.out.println();
                    found = true;
                    break;
                }
                if (j < arr.length) {
                    sum += arr[j];
                }
            }
            if (found) {
				break;
			}
        }

        if (!found) {
            System.out.println("No subarray found with given sum.");
        }
    }
}
