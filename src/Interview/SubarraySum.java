package Interview;
public class SubarraySum {
    public static void main(String[] args) {
        int[] a = {3, -1, 5, 9};
        int totalSum = 0;

        for (int i = 0; i < a.length; i++) {
            int currentSum = 0;
            for (int j = i; j < a.length; j++) {
                currentSum += a[j];      // Add current element to sum
                totalSum += currentSum;  // Add current subarray sum to total
            }
        }

        System.out.println("Total sum of all subarrays: " + totalSum);
    }
}
