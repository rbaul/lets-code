package com.leetcode.hard;

import java.util.Stack;

/**
 * Longest Valid Parentheses
 * <p>
 * Given a string containing just the characters '(' and ')', return the length of the longest valid (well-formed) parentheses substring
 * <p>
 * Constraints:
 * <p>
 * 0 <= s.length <= 3 * 10^4
 * s[i] is '(', or ')'.
 * <p>
 * <a href="https://leetcode.com/problems/longest-valid-parentheses/description/">Longest Valid Parentheses</a>
 */
public class LongestValidParentheses {
	public int longestValidParentheses(String s) {
		int[] array = new int[s.length()];
		Stack<Integer> openBrackets = new Stack<>();
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch == '(') {
				openBrackets.push(i);
			} else {
				if (openBrackets.isEmpty()) {
					array[i] = -1;
				} else {
					openBrackets.pop();
				}
			}
		}
		while (!openBrackets.isEmpty()) {
			array[openBrackets.pop()] = -1;
		}
		
		int max = 0;
		int currentMax = 0;
		for (int i : array) {
			if (i == -1) {
				currentMax = 0;
			} else {
				currentMax += 1;
				max = Math.max(currentMax, max);
			}
		}
		return max;
	}
	
}
