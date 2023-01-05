package com.leetcode;

/**
 * Write a function to find the longest common prefix string amongst an array of strings.
 * <p>
 * If there is no common prefix, return an empty string "".
 * <p>
 * Constraints:
 * <p>
 * 1 <= strs.length <= 200
 * 0 <= strs[i].length <= 200
 * strs[i] consists of only lowercase English letters.
 */
public class LongestCommonPrefix {
	public static String longestCommonPrefix(String[] strs) {
		StringBuilder result = new StringBuilder();
		
		// Find minimum length
		int minString = Integer.MAX_VALUE;
		for (String str : strs) {
			int length = str.length();
			if (length < minString) {
				minString = length;
			}
		}
		
		int i = 0;
		int j = 0;
		while (i < minString && strs[0].charAt(i) == strs[j].charAt(i)) {
			if (j == strs.length - 1) {
				result.append(strs[0].charAt(i));
				j = 0;
				++i;
			} else {
				++j;
			}
		}
		
		return result.toString();
	}
	
}
