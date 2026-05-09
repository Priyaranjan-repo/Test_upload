package ArrayPrg;
public class SubarraySum {
	
	
	//Given an array, find the sum of all possible subarrays.

//Example:
//Input: arr = [1, 2, 3]
//Subarrays: [1], [2], [3], [1,2], [2,3], [1,2,3]
//Sum: 1 + 2 + 3 + (1+2) + (2+3) + (1+2+3) = 1 + 2 + 3 + 3 + 5 + 6 = 20
//	
	
	
    public static void main(String[] args) {
       
    	int[] arr = {1, 2, 3};
        
    	int totalSum = 0;

       
    	for (int i = 0; i < arr.length; i++) {
            
        	
    		int subArraySum = 0;
            
            
        	for (int j = i; j < arr.length; j++) {
             
            	subArraySum += arr[j];
                
            	totalSum += subArraySum;
            }
        }

        System.out.println("Sum of all subarrays: " + totalSum);
    }
}
