package com.leetcode;

/**
 Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 
 You may assume that each input would have exactly one solution, and you may not use the same element twice.
 
 Constraints:
 
 2 <= nums.length <= 104
 -109 <= nums[i] <= 109
 -109 <= target <= 109
 Only one valid answer exists.
 */
public class TwoSum {
	
	public int[] twoSum(int[] nums, int target) {
		for (int i = 0; i < nums.length - 1; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					return new int[] {i, j};
				}
			}
		}
		
		return new int[0];
	}
	
	public int[] twoSum_2(int[] nums, int target) {
		
		int[] loc = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			loc[i] = i;
		}
		
		sortArray(nums, loc);
		
		int i = 0;
		int j = nums.length - 1;
		
		while (i < j) {
			
			int sum = nums[i] + nums[j];
			if (sum == target) {
				return new int[] {loc[i], loc[j]};
			}
			
			if (sum > target) {
				--j;
			} else {
				++i;
			}
		}
		
		return new int[0];
	}
	
	
	private static void sortArray(int[] array, int[] loc) {
		for (int i = 1; i < array.length; i++)
		{
			int j = i;
			int a = array[i];
			int l = loc[i];
			while ((j > 0) && (array[j-1] > a))   //returns true when both conditions are true
			{
				array[j] = array[j-1];
				loc[j] = loc[j-1];
				j--;
			}
			array[j] = a;
			loc[j] = l;
		}
	}
}
