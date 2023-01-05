package com.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LengthOfLongestSubstringTest {
	
	@Test
	void lengthOfLongestSubstring_1() {
		int result = LengthOfLongestSubstring.lengthOfLongestSubstring("abcabcbb");
		
		Assertions.assertEquals(3, result);
	}
	
	@Test
	void lengthOfLongestSubstring_2() {
		int result = LengthOfLongestSubstring.lengthOfLongestSubstring("bbbbb");
		
		Assertions.assertEquals(1, result);
	}
	
	@Test
	void lengthOfLongestSubstring_3() {
		int result = LengthOfLongestSubstring.lengthOfLongestSubstring("pwwkew");
		
		Assertions.assertEquals(3, result);
	}
	
	@Test
	void lengthOfLongestSubstring_4() {
		int result = LengthOfLongestSubstring.lengthOfLongestSubstring(" ");
		
		Assertions.assertEquals(1, result);
	}
}