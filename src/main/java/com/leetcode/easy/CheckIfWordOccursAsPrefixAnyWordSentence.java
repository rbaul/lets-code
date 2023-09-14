package com.leetcode.easy;

/**
 * Check If a Word Occurs As a Prefix of Any Word in a Sentence
 * <p>
 * Given a sentence that consists of some words separated by a single space, and a searchWord, check if searchWord is a prefix of any word in sentence.
 * <p>
 * Return the index of the word in sentence (1-indexed) where searchWord is a prefix of this word. If searchWord is a prefix of more than one word, return the index of the first word (minimum index). If there is no such word return -1.
 * <p>
 * A prefix of a string s is any leading contiguous substring of s.
 * <p>
 * Constraints:
 * <p>
 * 1 <= sentence.length <= 100
 * 1 <= searchWord.length <= 10
 * sentence consists of lowercase English letters and spaces.
 * searchWord consists of lowercase English letters.
 * <p>
 * <a href="https://leetcode.com/problems/check-if-a-word-occurs-as-a-prefix-of-any-word-in-a-sentence">Check If a Word Occurs As a Prefix of Any Word in a Sentence</a>
 */
public class CheckIfWordOccursAsPrefixAnyWordSentence {
    public int isPrefixOfWord(String sentence, String searchWord) {
        int j = 0;
        int number = 1;
        for (int i = 0; i < sentence.length(); i++, number++, j = 0) {
            while (i < sentence.length() && j < searchWord.length() && sentence.charAt(i) == searchWord.charAt(j)) {
                i++;
                j++;
            }

            if (j == searchWord.length()) {
                return number;
            } else {
                while (i < sentence.length() && sentence.charAt(i) != ' ') {
                    i++;
                }
            }
        }
        return -1;
    }
}
