package com.leetcode.medium;

/**
 * Container With Most Water
 * <p>
 * You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).
 * <p>
 * Find two lines that together with the x-axis form a container, such that the container contains the most water.
 * <p>
 * Return the maximum amount of water a container can store.
 * <p>
 * Notice that you may not slant the container.
 * <p>
 * Constraints:
 * <p>
 * n == height.length
 * 2 <= n <= 105
 * 0 <= height[i] <= 104
 * <p>
 * <p>
 * https://leetcode.com/problems/container-with-most-water/
 */
public class ContainerWithMostWater {
	
	public static int maxArea_1(int[] height) {
		int max = 0;
		
		for (int i = 0; i < height.length; i++) {
			for (int j = i + 1; j < height.length; j++) {
				int sum = (j - i) * Math.min(height[i], height[j]);
				
				if (sum > max) {
					max = sum;
				}
			}
		}
		
		return max;
	}
	
	public static int maxArea(int[] height) {
		int max = 0;
		int i = 0;
		int j = height.length - 1;
		
		while (i < j) {
			int sum = (j - i) * Math.min(height[i], height[j]);
			
			if (sum > max) {
				max = sum;
			}
			
			if (height[i] <= height[j]) {
				i++;
			} else {
				j--;
			}
		}
		
		return max;
	}
}
