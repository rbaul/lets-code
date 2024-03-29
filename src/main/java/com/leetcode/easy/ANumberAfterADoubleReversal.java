package com.leetcode.easy;

/**
 * A Number After a Double Reversal
 * <p>
 * Reversing an integer means to reverse all its digits.
 * <p>
 * For example, reversing 2021 gives 1202. Reversing 12300 gives 321 as the leading zeros are not retained.
 * Given an integer num, reverse num to get reversed1, then reverse reversed1 to get reversed2. Return true if reversed2 equals num. Otherwise return false.
 * <p>
 * Constraints:
 * <p>
 * 0 <= num <= 10^6
 * <p>
 * <a href="https://leetcode.com/problems/a-number-after-a-double-reversal/">A Number After a Double Reversal</a>
 */
public class ANumberAfterADoubleReversal {
    public boolean isSameAfterReversals(int num) {
        return num == 0 || num % 10 != 0;
    }
}
