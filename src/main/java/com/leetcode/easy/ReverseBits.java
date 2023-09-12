package com.leetcode.easy;

/**
 * Reverse Bits
 * <p>
 * Reverse bits of a given 32 bits unsigned integer.
 * <p>
 * Note:
 * <p>
 * Note that in some languages, such as Java, there is no unsigned integer type. In this case, both input and output will be given as a signed integer type. They should not affect your implementation, as the integer's internal binary representation is the same, whether it is signed or unsigned.
 * In Java, the compiler represents the signed integers using 2's complement notation. Therefore, in Example 2 above, the input represents the signed integer -3 and the output represents the signed integer -1073741825.
 * <p>
 * Constraints:
 * <p>
 * The input must be a binary string of length 32
 * <p>
 * <p>
 * Follow up: If this function is called many times, how would you optimize it?
 * <p>
 * <a href="https://leetcode.com/problems/reverse-bits/">Reverse Bits</a>
 */
public class ReverseBits {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int result = 0;

        for (int i = 0; i < 32; i++) {
            int mask = 1 << i;
            if ((n & mask) != 0) {
                result = result + (int) Math.pow(2, 31 - i);
                if (i == 0) {
                    result++;
                }
            }
        }
        return result;
    }
}
