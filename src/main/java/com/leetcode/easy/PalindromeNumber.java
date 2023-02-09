package com.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Palindrome Number
 * <p>
 * Given an integer x, return true if x is a palindrome, and false otherwise.
 * <p>
 * Constraints:
 * <p>
 * -231 <= x <= 231 - 1
 * <p>
 * <p>
 * Follow up: Could you solve it without converting the integer to a string?
 * <p>
 * <a href="https://leetcode.com/problems/palindrome-number/">...</a>
 */
public class PalindromeNumber {
	
	public boolean isPalindrome(int x) {
		if (x < 0) return false; // minus can't be palindrome
		
		// Create arrayOfNumber
		int div = x;
		List<Integer> arrayOfNumber = new ArrayList<>();
		
		do {
			arrayOfNumber.add(div % 10);
			div /= 10;
		} while (div > 0);
		
		// Check palindrome
		int i = 0;
		int j = arrayOfNumber.size() - 1;
		
		while (i < j) {
			if (!arrayOfNumber.get(i).equals(arrayOfNumber.get(j))) {
				return false;
			}
			i++;
			j--;
		}
		
		return true;
	}
}
