package com.leetcode.medium;

/**
 * Find Triangular Sum of an Array
 * <p>
 * You are given a 0-indexed integer array nums, where nums[i] is a digit between 0 and 9 (inclusive).
 * <p>
 * The triangular sum of nums is the value of the only element present in nums after the following process terminates:
 * <p>
 * Let nums comprise of n elements. If n == 1, end the process. Otherwise, create a new 0-indexed integer array newNums of length n - 1.
 * For each index i, where 0 <= i < n - 1, assign the value of newNums[i] as (nums[i] + nums[i+1]) % 10, where % denotes modulo operator.
 * Replace the array nums with newNums.
 * Repeat the entire process starting from step 1.
 * Return the triangular sum of nums.
 * <p>
 * Constraints:
 * <p>
 * 1 <= nums.length <= 1000
 * 0 <= nums[i] <= 9
 * <p>
 * <a href="https://leetcode.com/problems/find-triangular-sum-of-an-array/">Find Triangular Sum of an Array</a>
 */
public class FindTriangularSumOfAnArray {
    public int triangularSum(int[] nums) {
        for (int i = nums.length - 1; i > 0; i--) {
            int prev = nums[0];
            for (int j = 1; j <= i; j++) {
                nums[j - 1] = (nums[j] + prev) % 10;
                prev = nums[j];
            }
        }
        return nums[0];
    }
}
