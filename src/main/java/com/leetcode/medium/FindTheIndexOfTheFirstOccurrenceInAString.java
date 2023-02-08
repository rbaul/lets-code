package com.leetcode.medium;

/**
 * Find the Index of the First Occurrence in a String
 * <p>
 * Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
 * <p>
 * Constraints:
 * <p>
 * 1 <= haystack.length, needle.length <= 104
 * haystack and needle consist of only lowercase English characters.
 * <p>
 * https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/
 */
public class FindTheIndexOfTheFirstOccurrenceInAString {
	public int strStr(String haystack, String needle) {
		char firstChar = needle.charAt(0);
		int needleLength = needle.length();
		int lastRelevantIndex = haystack.length() - needleLength;
		
		for (int i = 0; i <= lastRelevantIndex; i++) {
			char charAt = haystack.charAt(i);
			
			if (charAt == firstChar) {
				boolean isSame = true;
				for (int j = 1; j < needleLength; j++) {
					if (haystack.charAt(i + j) != needle.charAt(j)) {
						isSame = false;
						break;
					}
				}
				if (isSame) {
					return i;
				}
			}
		}
		
		return -1;
	}
}
