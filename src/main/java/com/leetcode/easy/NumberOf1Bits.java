package com.leetcode.easy;

/**
 * Number of 1 Bits
 * <p>
 * Write a function that takes the binary representation of an unsigned integer and returns the number of '1' bits it has (also known as the Hamming weight).
 * <p>
 * Note:
 * <p>
 * Note that in some languages, such as Java, there is no unsigned integer type. In this case, the input will be given as a signed integer type. It should not affect your implementation, as the integer's internal binary representation is the same, whether it is signed or unsigned.
 * In Java, the compiler represents the signed integers using 2's complement notation. Therefore, in Example 3, the input represents the signed integer. -3.
 * <p>
 * Constraints:
 * <p>
 * The input must be a binary string of length 32.
 * <p>
 * <p>
 * Follow up: If this function is called many times, how would you optimize it?
 * <p>
 * <a href="https://leetcode.com/problems/number-of-1-bits/">Number of 1 Bits</a>
 */
public class NumberOf1Bits {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int count = 0;
        for (int i = 31; i >= 0; i--) {
            int mask = 1 << i;
            if ((n & mask) != 0) {
                count++;
            }
        }
        return count;
    }
}
