package com.leetcode.easy;

/**
 * Move Zeroes
 * <p>
 * Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 * <p>
 * Note that you must do this in-place without making a copy of the array.
 * <p>
 * Follow up: Could you minimize the total number of operations done?
 * <p>
 * Constraints:
 * <p>
 * 1 <= nums.length <= 10^4
 * -2^31 <= nums[i] <= 2^31 - 1
 * <p>
 * Follow up: Could you minimize the total number of operations done?
 * <p>
 * <a href="https://leetcode.com/problems/move-zeroes/description/">Move Zeroes</a>
 */
public class MoveZeroes {
	public void moveZeroes(int[] nums) {
		int startIndex = 0;
		
		while (startIndex < nums.length - 1) {
			if (nums[startIndex] == 0) {
				int nonZeroIndex = startIndex + 1;
				while (nonZeroIndex < nums.length && nums[nonZeroIndex] == 0) {
					nonZeroIndex++;
				}
				
				if (nonZeroIndex < nums.length) {
					nums[startIndex] = nums[nonZeroIndex];
					nums[nonZeroIndex] = 0;
				}
			}
			startIndex++;
		}
	}
}
