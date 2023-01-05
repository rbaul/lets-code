package com.leetcode;

/**
 * Median of Two Sorted Arrays
 * <p>
 * Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
 * <p>
 * The overall run time complexity should be O(log (m+n)).
 * <p>
 * Constraints:
 * <p>
 * nums1.length == m
 * nums2.length == n
 * 0 <= m <= 1000
 * 0 <= n <= 1000
 * 1 <= m + n <= 2000
 * -106 <= nums1[i], nums2[i] <= 106
 */
public class FindMedianSortedArrays {
	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int[] mergedArray = new int[nums1.length + nums2.length];
		
		int i1 = 0;
		int i2 = 0;
		int m = 0;
		
		while (m < mergedArray.length) {
			if (i1 == nums1.length) {
				mergedArray[m] = nums2[i2];
				++i2;
			} else if (i2 == nums2.length) {
				mergedArray[m] = nums1[i1];
				++i1;
			} else {
				if (nums1[i1] < nums2[i2]) {
					mergedArray[m] = nums1[i1];
					++i1;
				} else {
					mergedArray[m] = nums2[i2];
					++i2;
				}
			}
			++m;
		}
		
		return mergedArray.length % 2 == 1 ? mergedArray[mergedArray.length / 2] : ((double) mergedArray[mergedArray.length / 2] + mergedArray[(mergedArray.length / 2) - 1]) / 2;
	}
}
