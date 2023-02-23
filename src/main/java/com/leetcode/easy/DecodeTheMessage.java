package com.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Decode the Message
 * <p>
 * You are given the strings key and message, which represent a cipher key and a secret message, respectively. The steps to decode message are as follows:
 * <p>
 * Use the first appearance of all 26 lowercase English letters in key as the order of the substitution table.
 * Align the substitution table with the regular English alphabet.
 * Each letter in message is then substituted using the table.
 * Spaces ' ' are transformed to themselves.
 * For example, given key = "happy boy" (actual key would have at least one instance of each letter in the alphabet), we have the partial substitution table of ('h' -> 'a', 'a' -> 'b', 'p' -> 'c', 'y' -> 'd', 'b' -> 'e', 'o' -> 'f').
 * Return the decoded message.
 * <p>
 * Constraints:
 * <p>
 * 26 <= key.length <= 2000
 * key consists of lowercase English letters and ' '.
 * key contains every letter in the English alphabet ('a' to 'z') at least once.
 * 1 <= message.length <= 2000
 * message consists of lowercase English letters and ' '.
 * <p>
 * <a href="https://leetcode.com/problems/decode-the-message/description/">Decode the Message</a>
 */
public class DecodeTheMessage {
	public String decodeMessage(String key, String message) {
		Map<Character, Character> converter = new HashMap<>();
		char character = 'a';
		for (int i = 0; i < key.length(); i++) {
			char ch = key.charAt(i);
			if (!converter.containsKey(ch) && ch != ' ') {
				converter.put(ch, character++);
			}
		}
		StringBuilder stringBuilder = new StringBuilder();
		for (int i = 0; i < message.length(); i++) {
			char c = message.charAt(i);
			if (c == ' ') {
				stringBuilder.append(' ');
			} else {
				stringBuilder.append(converter.get(c));
			}
		}
		
		return stringBuilder.toString();
	}
}
