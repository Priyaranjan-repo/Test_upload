package ArrayPrg;
public class SubarraySum17 {
    public static void main(String[] args) {
       
    	
    	int[] a = {3, -1, 5, 9};
        int target = 17;
        int count = 0;

        for (int i = 0; i < a.length; i++) {
           
        
        	int sum = 0;
            
       	for (int j = i; j < a.length; j++) {
                
        	sum += a[j];
             
        	if (sum == target) {
                    count++;
                 
                    System.out.print("Subarray: ");
                    
                    for (int k = i; k <= j; k++) {
                        System.out.print(a[k] + " ");
                    }
                    System.out.println("=> Sum: " + sum);
                }
            }
        }

        if (count == 0) {
            System.out.println("No subarray found with sum = " + target);
        } else {
            System.out.println("Total subarrays with sum 17: " + count);
        }
    }
}
