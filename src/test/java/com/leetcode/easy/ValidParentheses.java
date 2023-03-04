package com.leetcode.easy;

import java.util.Stack;

/**
 * Valid Parentheses
 * <p>
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 * <p>
 * An input string is valid if:
 * <p>
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * Every close bracket has a corresponding open bracket of the same type.
 * <p>
 * Constraints:
 * <p>
 * 1 <= s.length <= 10^4
 * s consists of parentheses only '()[]{}'.
 * <p>
 * <a href="https://leetcode.com/problems/valid-parentheses/">Valid Parentheses</a>
 */
public class ValidParentheses {
	public boolean isValid(String s) {
		Stack<Character> openBrackets = new Stack<>();
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch == '{' || ch == '[' || ch == '(') {
				openBrackets.push(ch);
			} else {
				if (openBrackets.isEmpty() || openToClose(openBrackets.pop()) != ch) {
					return false;
				}
			}
		}
		return openBrackets.isEmpty();
	}
	
	private static Character openToClose(char ch) {
		return switch (ch) {
			case '{' -> '}';
			case '[' -> ']';
			case '(' -> ')';
			default -> null;
		};
	}
}
