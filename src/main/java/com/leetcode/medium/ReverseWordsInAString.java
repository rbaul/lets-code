package com.leetcode.medium;

/**
 * Reverse Words in a String
 * <p>
 * Given an input string s, reverse the order of the words.
 * <p>
 * A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.
 * <p>
 * Return a string of the words in reverse order concatenated by a single space.
 * <p>
 * Note that s may contain leading or trailing spaces or multiple spaces between two words. The returned string should only have a single space separating the words. Do not include any extra spaces.
 * <p>
 * Constraints:
 * <p>
 * 1 <= s.length <= 104
 * s contains English letters (upper-case and lower-case), digits, and spaces ' '.
 * There is at least one word in s.
 * <p>
 * <p>
 * Follow-up: If the string data type is mutable in your language, can you solve it in-place with O(1) extra space?
 * <p>
 * <a href="https://leetcode.com/problems/reverse-words-in-a-string/">...</a>
 */
public class ReverseWordsInAString {

//	public String reverseWords(String s) {
//		StringBuilder stringBuilder = new StringBuilder();
//
//		String[] words = s.trim().replaceAll(" +", " ").split(" ");
//
//		for (int i = words.length - 1; i >= 0; i--) {
//			stringBuilder.append(words[i]);
//			if (i != 0) {
//				stringBuilder.append(" ");
//			}
//		}
//
//		return stringBuilder.toString();
//	}
	
	public String reverseWords(String s) {
		StringBuilder stringBuilder = new StringBuilder();
		
		int lastWordIndex = -1;
		boolean isNewWord = true;
		for (int i = s.length() - 1; i >= 0; i--) {
			char ch = s.charAt(i);
			if (ch == ' ') {
				isNewWord = true;
				if (lastWordIndex > 0) {
					stringBuilder.append(s, i + 1, lastWordIndex + 1);
					lastWordIndex = -1;
				}
			} else if (isNewWord) {
				isNewWord = false;
				lastWordIndex = i;
				if (!stringBuilder.isEmpty()) {
					stringBuilder.append(' ');
				}
			}
		}
		
		if (lastWordIndex >= 0) {
			stringBuilder.append(s, 0, lastWordIndex + 1);
		}
		
		return stringBuilder.toString();
	}
}
