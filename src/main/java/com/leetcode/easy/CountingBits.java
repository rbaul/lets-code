package com.leetcode.easy;

/**
 * Counting Bits
 * <p>
 * Given an integer n, return an array ans of length n + 1 such that for each i (0 <= i <= n),
 * ans[i] is the number of 1's in the binary representation of i.
 * <p>
 * Constraints:
 * <p>
 * 0 <= n <= 10^5
 * <p>
 * Follow up:
 * <p>
 * It is very easy to come up with a solution with a runtime of O(n log n). Can you do it in linear time O(n) and possibly in a single pass?
 * Can you do it without using any built-in function (i.e., like __builtin_popcount in C++)?
 * <p>
 * <a href="https://leetcode.com/problems/counting-bits/">Counting Bits</a>
 */
public class CountingBits {
    public int[] countBits(int n) {
        int[] result = new int[n + 1];

        if (n > 0) {
            int index = 0;
            int start = 1;
            for (int i = start; i <= n; i++) {
                result[i] = result[index++] + 1;
                if (index == start) {
                    index = 0;
                    start = i + 1;
                }
            }
        }

        return result;
    }
}
