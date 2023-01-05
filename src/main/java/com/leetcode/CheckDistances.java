package com.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 You are given a 0-indexed string s consisting of only lowercase English letters, where each letter in s appears exactly twice. You are also given a 0-indexed integer array distance of length 26.
 
 Each letter in the alphabet is numbered from 0 to 25 (i.e. 'a' -> 0, 'b' -> 1, 'c' -> 2, ... , 'z' -> 25).
 
 In a well-spaced string, the number of letters between the two occurrences of the ith letter is distance[i]. If the ith letter does not appear in s, then distance[i] can be ignored.
 
 Return true if s is a well-spaced string, otherwise return false.
 
 Constraints:
 
 2 <= s.length <= 52
 s consists only of lowercase English letters.
 Each letter appears in s exactly twice.
 distance.length == 26
 0 <= distance[i] <= 50
 */
public class CheckDistances {
	
	public static boolean checkDistances(String s, int[] distance) {
		int a_asscii = 'a';
		
		Set<Integer> appear = new HashSet<>();
		
		for (int i = 0; i < s.length() - 1; i++) {
			int ch_ascii = s.charAt(i);
			
			if (appear.contains(ch_ascii)) {
				continue;
			} else {
				appear.add(ch_ascii);
			}
			
			int numberOfSpaces = distance[ch_ascii - a_asscii];
			
			int index = i + numberOfSpaces + 1;
			if (index > s.length() - 1 || ch_ascii != s.charAt(index)) {
				return false;
			}
		}
		
		return true;
	}
}
