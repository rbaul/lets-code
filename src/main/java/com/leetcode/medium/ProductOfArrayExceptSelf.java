package com.leetcode.medium;

/**
 * Product of Array Except Self
 * <p>
 * Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
 * <p>
 * The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
 * <p>
 * You must write an algorithm that runs in O(n) time and without using the division operation.
 * <p>
 * Constraints:
 * <p>
 * 2 <= nums.length <= 105
 * -30 <= nums[i] <= 30
 * The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
 * <p>
 * <p>
 * Follow up: Can you solve the problem in O(1) extra space complexity? (The output array does not count as extra space for space complexity analysis.)
 * <p>
 * <a href="https://leetcode.com/problems/product-of-array-except-self/description/">Product of Array Except Self</a>
 */
public class ProductOfArrayExceptSelf {
	public int[] productExceptSelf(int[] nums) {
		int[] result = new int[nums.length];
		
		long productAll = 1;
		int zeroCount = 0;
		for (int num : nums) {
			if (num != 0) {
				productAll *= num;
			} else {
				zeroCount++;
			}
		}
		
		if (zeroCount > 1) {
			for (int i = 0; i < nums.length; i++) {
				result[i] = 0;
			}
		} else if (zeroCount == 1) {
			for (int i = 0; i < nums.length; i++) {
				result[i] = nums[i] == 0 ? (int) productAll : 0;
			}
		} else {
			for (int i = 0; i < nums.length; i++) {
				result[i] = (int) productAll / nums[i];
			}
		}
		
		return result;
	}
}
