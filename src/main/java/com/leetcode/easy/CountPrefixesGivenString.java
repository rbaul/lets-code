package com.leetcode.easy;

/**
 * Count Prefixes of a Given String
 * <p>
 * You are given a string array words and a string s, where words[i] and s comprise only of lowercase English letters.
 * <p>
 * Return the number of strings in words that are a prefix of s.
 * <p>
 * A prefix of a string is a substring that occurs at the beginning of the string. A substring is a contiguous sequence of characters within a string.
 * <p>
 * Constraints:
 * <p>
 * 1 <= words.length <= 1000
 * 1 <= words[i].length, s.length <= 10
 * words[i] and s consist of lowercase English letters only.
 * <p>
 * <a href="https://leetcode.com/problems/count-prefixes-of-a-given-string/description/">Count Prefixes of a Given String</a>
 */
public class CountPrefixesGivenString {
    public int countPrefixes(String[] words, String s) {
        int count = 0;
        for (String word : words) {
            if (s.startsWith(word)) {
                count++;
            }
        }

        return count;
    }
}
