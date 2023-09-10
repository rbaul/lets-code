package com.leetcode.hard;

/**
 * Trapping Rain Water
 * <p>
 * Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.
 * <p>
 * Constraints:
 * <p>
 * n == height.length
 * 1 <= n <= 2 * 10^4
 * 0 <= height[i] <= 10^5
 * <p>
 * <a href="https://leetcode.com/problems/trapping-rain-water/">Trapping Rain Water</a>
 */
public class TrappingRainWater {
    public int trap(int[] height) {
        int result = 0;
        int i = 0;
        int prev = 0;

        while (i < height.length) {
            int currHeight = height[i];
            int maxIndex = 0;

            int startCount = i;

            if (prev > currHeight) { // Stop on down
                int max = 0;

                while (i < height.length) {
                    currHeight = height[i];

                    if (max <= currHeight) {
                        maxIndex = i;
                        max = currHeight;
                    }

                    if (height[startCount - 1] <= currHeight) {
                        break;
                    }

                    i++;
                }
            }
            prev = currHeight;
            if (maxIndex > 0 && height[maxIndex] > 0) {
                int subResult = 0;
                for (int j = startCount; j < maxIndex; j++) {
                    subResult += height[j];
                }
                result += Math.min(height[startCount - 1], height[maxIndex]) * (maxIndex - startCount) - subResult; // Calculate area
                i = maxIndex;
                prev = height[i];
            }

            i++;
        }

        return result;
    }
}
