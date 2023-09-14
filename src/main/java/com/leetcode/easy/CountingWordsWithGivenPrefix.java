package com.leetcode.easy;

/**
 * Counting Words With a Given Prefix
 * <p>
 * You are given an array of strings words and a string pref.
 * <p>
 * Return the number of strings in words that contain pref as a prefix.
 * <p>
 * A prefix of a string s is any leading contiguous substring of s.
 * <p>
 * Constraints:
 * <p>
 * 1 <= words.length <= 100
 * 1 <= words[i].length, pref.length <= 100
 * words[i] and pref consist of lowercase English letters.
 * <p>
 * <a href="https://leetcode.com/problems/counting-words-with-a-given-prefix">Counting Words With a Given Prefix</a>
 */
public class CountingWordsWithGivenPrefix {
    public int prefixCount(String[] words, String pref) {
        int count = 0;

        for (String word : words) {
            if (word.startsWith(pref)) {
                count++;
            }
        }

        return count;
    }
}
