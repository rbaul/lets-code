package com.leetcode;

import java.util.Arrays;

/**
 * Number of Sub-arrays of Size K and Average Greater than or Equal to Threshold
 * <p>
 * Given an array of integers arr and two integers k and threshold,
 * return the number of sub-arrays of size k and average greater than or equal to threshold.
 * <p>
 * Constraints:
 * <p>
 * 1 <= arr.length <= 105
 * 1 <= arr[i] <= 104
 * 1 <= k <= arr.length
 * 0 <= threshold <= 104
 *
 * <a href="https://leetcode.com/problems/number-of-sub-arrays-of-size-k-and-average-greater-than-or-equal-to-threshold/">...</a>
 */
public class NumOfSubArrays {
	
	public static int numOfSubarrays(int[] arr, int k, int threshold) {
		Integer count = 0;
		
		Arrays.sort(arr); // sort
		
		recursive(arr, k, threshold, 0, 0, 0, count);
		
		return count;
	}
	
	public static void recursive(int[] arr, int k, int threshold, int currentCount, int startIndex, int currentSum, Integer count) {
		if (currentCount == k) {
			if (threshold * k <= currentSum) {
				count++;
			}
			return;
		}
		
		for (int j = startIndex; j < arr.length; j++) {
			recursive(arr, k, threshold, currentCount + 1, j + 1, currentSum + arr[j], count);
		}
		
	}
}
