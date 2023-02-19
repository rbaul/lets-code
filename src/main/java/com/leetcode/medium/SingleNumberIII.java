package com.leetcode.medium;

import java.util.HashSet;
import java.util.Set;

/**
 * Single Number III
 * <p>
 * Given an integer array nums, in which exactly two elements appear only once and all the other elements appear exactly twice. Find the two elements that appear only once. You can return the answer in any order.
 * <p>
 * You must write an algorithm that runs in linear runtime complexity and uses only constant extra space.
 * <p>
 * Constraints:
 * <p>
 * 2 <= nums.length <= 3 * 10^4
 * -2^31 <= nums[i] <= 2^31 - 1
 * Each integer in nums will appear twice, only two integers will appear once.
 * <p>
 * <a href="https://leetcode.com/problems/single-number-iii/description/">Single Number III</a>
 */
public class SingleNumberIII {
	public int[] singleNumber(int[] nums) {
		if (nums.length == 2) return nums;
		
		Set<Integer> numSet = new HashSet<>();
		for (int num : nums) {
			if (numSet.contains(num)) {
				numSet.remove(num);
			} else {
				numSet.add(num);
			}
		}
		
		return numSet.stream()
				.mapToInt(Integer::intValue).toArray();
	}
}
