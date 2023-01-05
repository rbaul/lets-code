package com.leetcode;

/**
 * Reverse Integer
 * <p>
 * Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
 * <p>
 * Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
 * <p>
 * Constraints:
 * <p>
 * -231 <= x <= 231 - 1
 */
public class ReverseInteger {
	
	public static int reverse(int x) {
		long result = 0;
		
		while (x != 0) {
			result = result * 10 + x % 10;
			x /= 10;
		}
		
		return result > Integer.MAX_VALUE ? 0 : result < Integer.MIN_VALUE ? 0 : (int) result;
	}
}
