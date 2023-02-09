package com.leetcode.easy;

/**
 * Plus One
 * <p>
 * You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.
 * <p>
 * Increment the large integer by one and return the resulting array of digits.
 * <p>
 * Constraints:
 * <p>
 * 1 <= digits.length <= 100
 * 0 <= digits[i] <= 9
 * digits does not contain any leading 0's.
 * <p>
 * <a href="https://leetcode.com/problems/plus-one/">...</a>
 */
public class PlusOne {
	public int[] plusOne(int[] digits) {
		int i = digits.length - 1;
		int forNext = 1;
		
		int[] result = new int[digits.length];
		
		do {
			int number = digits[i] + forNext;
			forNext = number / 10;
			int mod = number % 10;
			result[i] = mod;
			if (i == 0 && forNext > 0) {
				int[] result1 = new int[digits.length + 1];
				System.arraycopy(result, 0, result1, 1, result.length);
				result1[0] = forNext;
				return result1;
			}
			i--;
		} while (i >= 0);
		
		
		return result;
	}
}
