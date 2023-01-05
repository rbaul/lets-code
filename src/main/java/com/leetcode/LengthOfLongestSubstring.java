package com.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * Given a string s, find the length of the longest
 * substring
 *  without repeating characters.
 *
 *  Constraints:
 *
 * 0 <= s.length <= 5 * 104
 * s consists of English letters, digits, symbols and spaces.
 *
 * https://leetcode.com/problems/longest-substring-without-repeating-characters/
 */
public class LengthOfLongestSubstring {
	
	public static int lengthOfLongestSubstring(String s) {
		int result = 0;
		Set<Integer> set = new HashSet<>();
		
		for (int i = 0; i < s.length() - result; i++) {
			int j = i;
			while (j < s.length() - 1 && !set.contains((int)s.charAt(j))) {
				set.add((int)s.charAt(j));
				++j;
			}
			
			if (j - i > result) {
				result = j - i;
			}
			set.clear();
		}
		
		return result;
	}
}
