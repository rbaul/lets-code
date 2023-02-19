package com.leetcode.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * Single Number
 * <p>
 * Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
 * <p>
 * You must implement a solution with a linear runtime complexity and use only constant extra space.
 * <p>
 * Constraints:
 * <p>
 * 1 <= nums.length <= 3 * 10^4
 * -3 * 10^4 <= nums[i] <= 3 * 10^4
 * Each element in the array appears twice except for one element which appears only once.
 * <p>
 * <a href="https://leetcode.com/problems/single-number/">Single Number</a>
 */
public class SingleNumber {
	public int singleNumber(int[] nums) {
		Set<Integer> numSet = new HashSet<>();
		for (int num : nums) {
			if (numSet.contains(num)) {
				numSet.remove(num);
			} else {
				numSet.add(num);
			}
		}
		return numSet.iterator().next();
	}
}
