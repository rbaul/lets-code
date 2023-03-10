package com.leetcode.easy;

/**
 * Reverse Prefix of Word
 * <p>
 * Given a 0-indexed string word and a character ch, reverse the segment of word that starts at index 0 and ends at the index of the first occurrence of ch (inclusive). If the character ch does not exist in word, do nothing.
 * <p>
 * For example, if word = "abcdefd" and ch = "d", then you should reverse the segment that starts at 0 and ends at 3 (inclusive). The resulting string will be "dcbaefd".
 * Return the resulting string.
 * <p>
 * Constraints:
 * <p>
 * 1 <= word.length <= 250
 * word consists of lowercase English letters.
 * ch is a lowercase English letter.
 * <p>
 * <a href="https://leetcode.com/problems/reverse-prefix-of-word/">Reverse Prefix of Word</a>
 */
public class ReversePrefixOfWord {
	
//	public String reversePrefix(String word, char ch) {
//		StringBuilder stringBuilder = new StringBuilder();
//		int i = 0;
//		for (; i < word.length(); i++) {
//			char c = word.charAt(i);
//			stringBuilder.append(c);
//			if (c == ch) {
//				break;
//			}
//		}
//
//		if (i < word.length()) {
//			StringBuilder reverse = stringBuilder.reverse();
//			if (i + 1 < word.length()) {
//				reverse.append(word.substring(i+1));
//			}
//			return reverse.toString();
//		} else {
//			return word;
//		}
//	}
	
	public String reversePrefix(String word, char ch) {
		int i = 0;
		for (; i < word.length(); i++) {
			char c = word.charAt(i);
			if (c == ch) {
				break;
			}
		}
		
		if (i < word.length()) {
			StringBuilder reverse = new StringBuilder();
			for (int j = i; j >= 0; j--) {
				reverse.append(word.charAt(j));
			}
			if (i + 1 < word.length()) {
				reverse.append(word.substring(i+1));
			}
			return reverse.toString();
		} else {
			return word;
		}
	}
}
