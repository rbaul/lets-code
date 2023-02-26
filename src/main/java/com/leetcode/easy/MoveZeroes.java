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
		int pointer = 0;
		
		while (pointer < nums.length) {
			if (nums[pointer] != 0) {
				if (startIndex != pointer) {
					nums[startIndex] = nums[pointer];
					nums[pointer] = 0;
				}
				startIndex++;
			}
			pointer++;
		}
	}
}
