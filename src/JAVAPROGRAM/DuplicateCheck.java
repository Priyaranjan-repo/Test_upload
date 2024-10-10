package JAVAPROGRAM;

import java.util.HashSet;
import java.util.Set;

public class DuplicateCheck {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 2 };
		// int[] nums = { 1, 2, 3, 5 };

		boolean hasDuplicates = containsDuplicate(nums);

		System.out.println("Output: " + hasDuplicates);
	}

	public static boolean containsDuplicate(int[] nums) {

		Set<Integer> set = new HashSet<>();

		for (int num : nums) {
			if (!set.add(num)) {
				// If the element is already present in the set, it's a duplicate
				return true;
			}
		}
		// No duplicates found
		return false;
	}
}

/*
 * public boolean containsDuplicate(int[] nums) {
 * 
 * for(int i = 0; i < nums.length; i++) { for(int j = i + 1; j < nums.length;
 * j++) { if(nums[i] == nums[j]) { return true; } } }
 * 
 * return false; }
 * 
 * public static void main (String[] args) {
 * 
 * Solution sol = new Solution();
 * 
 * int nums[]= {1, 2, 3, 1};
 * 
 * boolean res = sol.containsDuplicate(nums);
 * 
 * // printing the result System.out.println(res); } } Output: true
 * 
 * 
 */