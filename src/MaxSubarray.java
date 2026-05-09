public class MaxSubarray {
    public static void main(String[] args) {
       
    
    	int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
    	
    	
    	System.out.println("Max Subarray Sum: " + nums[0]);    	
        
    }
    	
    	public static int[] subArray(int[] nums) {
    	int max = nums[0], current = nums[0];

        for (int i = 1; i < nums.length; i++) {
            
        	current = Math.max(nums[i], current + nums[i]);
            
        	max = Math.max(max, current);
        }
        return nums;
       
}
}
