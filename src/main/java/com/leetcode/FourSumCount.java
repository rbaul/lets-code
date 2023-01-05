package com.leetcode;

import java.util.Arrays;

/**
 * Given four integer arrays nums1, nums2, nums3, and nums4 all of length n, return the number of tuples (i, j, k, l) such that:
 * <p>
 * 0 <= i, j, k, l < n
 * nums1[i] + nums2[j] + nums3[k] + nums4[l] == 0
 * <p>
 * n == nums1.length
 * n == nums2.length
 * n == nums3.length
 * n == nums4.length
 * 1 <= n <= 200
 * -228 <= nums1[i], nums2[i], nums3[i], nums4[i] <= 228
 */
public class FourSumCount {
	
	public static int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
		int count = 0;
		
		if (nums1.length > 0 && nums2.length > 0 && nums3.length > 0 && nums4.length > 0) {
			// Sort
			Arrays.sort(nums1); Arrays.sort(nums2); Arrays.sort(nums3); Arrays.sort(nums4);
			
			for (int i = 0; i < nums1.length; i++) {
//				if (i != 0 && nums1[i] == nums1[i - 1]) continue;
				
				for (int j = 0; j < nums2.length; j++) {
//					if (j != 0 && nums2[j] == nums2[j - 1]) continue;
					
					for (int k = 0; k < nums3.length; k++) {
//						if (k != 0 && nums3[k] == nums3[k - 1]) continue;
						
//						int l = nums4.length - 1;
//						while (l >= 0) {
//							int sum = nums1[i] + nums2[j] + nums3[k] + nums4[l];
//
//							if (sum > 0) {
//								--l;
//							} else if (sum == 0) {
//								count++;
//								break;
//							} else {
//								break;
//							}
//						}
						
						for (int l = 0; l < nums4.length; l++) {
//							if (l != 0 && nums4[l] == nums4[l - 1]) continue;

							int sum = nums1[i] + nums2[j] + nums3[k] + nums4[l];

							if (sum > 0) {
								break;
							} else if (sum == 0) {
								count++;
//								break;
							}
						}
					}
					
				}
				
			}
		}
		
		return count;
	}
	
}
