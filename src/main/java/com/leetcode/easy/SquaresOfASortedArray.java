package com.leetcode.easy;

/**
 * Squares of a Sorted Array
 * <p>
 * Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.
 * <p>
 * Constraints:
 * <p>
 * 1 <= nums.length <= 10^4
 * -10^4 <= nums[i] <= 10^4
 * nums is sorted in non-decreasing order.
 * <p>
 * Follow up: Squaring each element and sorting the new array is very trivial, could you find an O(n) solution using a different approach?
 * <p>
 * <a href="https://leetcode.com/problems/squares-of-a-sorted-array/">Squares of a Sorted Array</a>
 */
public class SquaresOfASortedArray {
	public int[] sortedSquares(int[] nums) {
		int[] result = new int[nums.length];
		
		// Find first
		int startIndex = nums.length - 1;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] >= 0) {
				startIndex = i;
				break;
			}
		}
		
		// Sort and Square
		int n = 0;
		int i = startIndex;
		int j = startIndex - 1;
		while (i < nums.length && j >= 0) {
			int abs = Math.abs(nums[j]);
			int num = nums[i];
			if (num < abs) {
				result[n++] = num * num;
				i++;
			} else {
				result[n++] = abs * abs;
				j--;
			}
		}
		
		while (i < nums.length) {
			int num = nums[i++];
			result[n++] = num * num;
		}
		
		while (j >= 0) {
			int num = nums[j--];
			result[n++] = num * num;
		}
		
		return result;
	}
}
