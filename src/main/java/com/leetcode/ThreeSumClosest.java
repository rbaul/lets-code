package com.leetcode;

import java.util.Arrays;

/**
 * Given an integer array nums of length n and an integer target, find three integers in nums such that the sum is closest to target.
 *
 * Return the sum of the three integers.
 *
 * You may assume that each input would have exactly one solution.
 *
 * Constraints:
 *
 * 3 <= nums.length <= 500
 * -1000 <= nums[i] <= 1000
 * -104 <= target <= 104
 */
public class ThreeSumClosest {
	
	public static int threeSumClosest(int[] nums, int target) {
		int threeSumClosest = Integer.MIN_VALUE;
		int delta = Integer.MAX_VALUE;
		
		Arrays.sort(nums); // sort
		
		int i = 0;
		while (i < nums.length - 2) {
			int j = i + 1; // start
			int k = nums.length - 1; // end
			
			while (j < k) {
				int sum = nums[i] + nums[j] + nums[k];;
				int currentDelta = Math.abs(target - sum);
				
				if (currentDelta < delta) {
					threeSumClosest = sum;
					delta = currentDelta;
				}
				
				if (target < sum) {
					while(nums[k] == nums[--k] && j < k);
				} else if (target > sum) {
					while(nums[j] == nums[++j] && j < k);
				} else { // equal
					break;
				}

			}
			
			i++;
		}
		
		return threeSumClosest;
	}
	
	/**
	 * Sum of three values by indexes
	 */
	private static int sumOfThreeIndexes(int[] nums, int first, int second, int third) {
		return nums[first] + nums[second] + nums[third];
	}
}
