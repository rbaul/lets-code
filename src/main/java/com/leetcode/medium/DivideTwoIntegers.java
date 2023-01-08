package com.leetcode.medium;

/**
 * Divide Two Integers
 * <p>
 * Given two integers dividend and divisor, divide two integers without using multiplication, division, and mod operator.
 * <p>
 * The integer division should truncate toward zero, which means losing its fractional part. For example, 8.345 would be truncated to 8, and -2.7335 would be truncated to -2.
 * <p>
 * Return the quotient after dividing dividend by divisor.
 * <p>
 * Note: Assume we are dealing with an environment that could only store integers within the 32-bit signed integer range: [−231, 231 − 1]. For this problem, if the quotient is strictly greater than 231 - 1, then return 231 - 1, and if the quotient is strictly less than -231, then return -231.
 * <p>
 * Constraints:
 * <p>
 * -231 <= dividend, divisor <= 231 - 1
 * divisor != 0
 * <p>
 * https://leetcode.com/problems/divide-two-integers/
 */
public class DivideTwoIntegers {
	
	public static int divide(int dividend, int divisor) {
		
		int k = 0;
		
		boolean minus = (dividend < 0 && divisor > 0) || (dividend > 0 && divisor < 0);
		
		int dividendNoSign = dividend == Integer.MAX_VALUE ? Integer.MIN_VALUE + 1 : dividend > 0 ? -dividend : dividend;
		int divisorNoSign = divisor == Integer.MAX_VALUE ? Integer.MIN_VALUE + 1 : divisor > 0 ? -divisor : divisor;
		
		if (divisorNoSign != -1) {
			while (dividendNoSign <= divisorNoSign) {
				k--;
				dividendNoSign -= divisorNoSign;
			}
		} else {
			k = dividendNoSign;
		}
		
		return minus ? k : k == Integer.MIN_VALUE ? Integer.MAX_VALUE : -k;
	}
}
