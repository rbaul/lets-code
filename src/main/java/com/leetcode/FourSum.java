package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given an array nums of n integers, return an array of all the unique quadruplets [nums[a], nums[b], nums[c], nums[d]] such that:
 * <p>
 * 0 <= a, b, c, d < n
 * a, b, c, and d are distinct.
 * nums[a] + nums[b] + nums[c] + nums[d] == target
 * You may return the answer in any order.
 * <p>
 * Constraints:
 * <p>
 * 1 <= nums.length <= 200
 * -109 <= nums[i] <= 109
 * -109 <= target <= 109
 */
public class FourSum {
	
	public static List<List<Integer>> fourSum(int[] nums, int target) {
		List<List<Integer>> fourSum = new ArrayList<>();
		
		if (nums.length > 3) {
			
			Arrays.sort(nums); // sort
			
			int lo = 0; // start
			
			while (lo < nums.length - 3) {
				int hi = nums.length - 1; // end
				
				while (hi > lo + 2) {
					int i = lo + 1;
					int j = hi - 1;
					
					while (i < j) {
						long sum = (long) nums[lo] + nums[hi] + nums[i] + nums[j];
						
						if (target < sum) {
							--j;
						} else if (target > sum) {
							++i;
						} else { // equal
							fourSum.add(Arrays.asList(nums[lo], nums[hi], nums[i], nums[j]));
//					while(nums[k] == nums[--k] && j < k);
							while (nums[i] == nums[++i] && i < j) ;
						}
					}
					while (nums[hi] == nums[--hi] && lo + 2 < hi) ;
				}
				while (nums[lo] == nums[++lo] && lo < nums.length - 3) ;
			}
			
		}
		
		return fourSum;
	}
	
}
