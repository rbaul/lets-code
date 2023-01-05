package com.leetcode;

/**
 * Longest Palindromic Substring
 * <p>
 * Given a string s, return the longest palindromic substring in s.
 * <p>
 * A string is palindromic if it reads the same forward and backward.
 * <p>
 * Constraints:
 * <p>
 * 1 <= s.length <= 1000
 * s consist of only digits and English letters.
 */
public class LongestPalindrome {
	
	public static String longestPalindrome(String s) {
		int longest = 0;
		String result = "";
		
		int i = 0;
		int j = s.length() - 1;
		
		while (i <= j) {
			
			if (j - i + 1 <= longest) {
				++i;
				j = s.length() - 1;
				continue;
			}
			
			int k = i;
			int l = j;
			while (k <= l && s.charAt(k) == s.charAt(l)) {
				--l;
				++k;
			}
			
			if (k > l) {
				result = s.substring(i, j + 1);
				longest = j - i + 1;
			}
			
			if (i == j) {
				++i;
				j = s.length() - 1;
			} else {
				--j;
			}
		}
		
		return result;
	}
}
