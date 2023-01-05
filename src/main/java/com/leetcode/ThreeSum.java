package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given an integer array nums, return all the triplets
 * [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
 *
 * Notice that the solution set must not contain duplicate triplets.
 *
 * Constraints:
 *
 * 3 <= nums.length <= 3000
 * -105 <= nums[i] <= 105
 */
public class ThreeSum {
	
	public static List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> threeSum = new ArrayList<>();
		int target = 0;
		
		Arrays.sort(nums); // sort
		
		int i = 0;
		while (i < nums.length - 2) {
			int j = i + 1; // start
			int k = nums.length - 1; // end
			
			while (j < k) {
				int sum = nums[i] + nums[j] + nums[k];
				
				if (target < sum) {
					--k;
				} else if (target > sum) {
					++j;
				} else { // equal
					threeSum.add(Arrays.asList(nums[i], nums[j], nums[k]));
//					while(nums[k] == nums[--k] && j < k);
					while(nums[j] == nums[++j] && j < k);
				}
			}
			
			while(nums[i] == nums[++i] && i < nums.length - 2);
		}
		
		return threeSum;
	}
	
	/**
	 * Sum of three values by indexes
	 */
	private static int sumOfThreeIndexes(int[] nums, int first, int second, int third) {
		return nums[first] + nums[second] + nums[third];
	}
}
