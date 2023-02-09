package com.leetcode.hard;

/**
 * Valid Number
 * <p>
 * A valid number can be split up into these components (in order):
 * <p>
 * A decimal number or an integer.
 * (Optional) An 'e' or 'E', followed by an integer.
 * A decimal number can be split up into these components (in order):
 * <p>
 * (Optional) A sign character (either '+' or '-').
 * One of the following formats:
 * One or more digits, followed by a dot '.'.
 * One or more digits, followed by a dot '.', followed by one or more digits.
 * A dot '.', followed by one or more digits.
 * An integer can be split up into these components (in order):
 * <p>
 * (Optional) A sign character (either '+' or '-').
 * One or more digits.
 * For example, all the following are valid numbers: ["2", "0089", "-0.1", "+3.14", "4.", "-.9", "2e10", "-90E3", "3e+7", "+6e-1", "53.5e93", "-123.456e789"], while the following are not valid numbers: ["abc", "1a", "1e", "e3", "99e2.5", "--6", "-+3", "95a54e53"].
 * <p>
 * Given a string s, return true if s is a valid number.
 * <p>
 * Constraints:
 * <p>
 * 1 <= s.length <= 20
 * s consists of only English letters (both uppercase and lowercase), digits (0-9), plus '+', minus '-', or dot '.'.
 * <p>
 * <a href="https://leetcode.com/problems/valid-number/">...</a>
 */
public class ValidNumber {
	public boolean isNumber(String s) {
		return checkNumber(s, 0, true, true);
	}
	
	private boolean checkNumber(String s, int i, boolean includeDots, boolean canBeE) {
		if (s.length() == 0 || i >= s.length()) return false;
		char ch = s.charAt(i);
		if (ch == '-' || ch == '+') {
			i++;
		}
		
		int countDots = 0;
		int countNumbers = 0;
		
		while (i < s.length()) {
			ch = s.charAt(i);
			if (ch >= '0' && ch <= '9') {
				countNumbers++;
			} else if (ch == '.' && includeDots) {
				countDots++;
				if (countDots > 1) {
					return false;
				}
			} else if ((ch == 'E' || ch == 'e') && canBeE) {
				return countNumbers > 0 && checkNumber(s, i + 1, false, false);
			} else {
				return false;
			}
			i++;
		}
		
		return countNumbers > 0;
	}
	
}
