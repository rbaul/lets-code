package com.leetcode.easy;

/**
 * Valid Palindrome
 *
 * A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters,
 * it reads the same forward and backward. Alphanumeric characters include letters and numbers.
 *
 * Given a string s, return true if it is a palindrome, or false otherwise.
 *
 * Constraints:
 *
 * 1 <= s.length <= 2 * 105
 * s consists only of printable ASCII characters.
 *
 * https://leetcode.com/problems/valid-palindrome/
 */
public class ValidPalindrome {
	public static boolean isPalindrome(String s) {
		String lowerCase = s.toLowerCase();
		
		int startIndex = 0;
		int endIndex = lowerCase.length() - 1;
		
		while (startIndex < endIndex) {
			char startChar = lowerCase.charAt(startIndex);
			
			if (!isAlphanumericLowerCase(startChar)) {
				startIndex++;
				continue;
			}
			
			char endChar = lowerCase.charAt(endIndex);
			if (!isAlphanumericLowerCase(endChar)) {
				endIndex--;
				continue;
			}
			
			if (startChar != endChar) {
				return false;
			}
			
			startIndex++;
			endIndex--;
		}
		
		return true;
	}
	
	public static boolean isAlphanumericLowerCase(int ascii) {
		return (ascii >= '0' && ascii <= '9') || (ascii >= 'a' && ascii <= 'z');
	}
	
}
