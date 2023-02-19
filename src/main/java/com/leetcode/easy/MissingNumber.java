package com.leetcode.easy;

/**
 * Missing Number
 * <p>
 * Given an array nums containing n distinct numbers in the range [0, n],
 * return the only number in the range that is missing from the array.
 * <p>
 * Constraints:
 * <p>
 * n == nums.length
 * 1 <= n <= 10^4
 * 0 <= nums[i] <= n
 * All the numbers of nums are unique.
 * <p>
 * Follow up: Could you implement a solution using only O(1) extra space complexity and O(n) runtime complexity?
 * <p>
 * <a href="https://leetcode.com/problems/missing-number/description/">Missing Number</a>
 */
public class MissingNumber {
	public int missingNumber(int[] nums) {
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			sum += i;
			sum -= nums[i];
		}
		
		return sum + nums.length;
	}
}
