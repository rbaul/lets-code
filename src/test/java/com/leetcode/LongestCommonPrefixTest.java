package com.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LongestCommonPrefixTest {
	
	@Test
	void longestCommonPrefix_1() {
		String result = LongestCommonPrefix.longestCommonPrefix(new String[]{"flower", "flow", "flight"});
		
		Assertions.assertEquals("fl", result);
	}
	
	@Test
	void longestCommonPrefix_2() {
		String result = LongestCommonPrefix.longestCommonPrefix(new String[]{"dog", "racecar", "car"});
		
		Assertions.assertEquals("", result);
	}
}