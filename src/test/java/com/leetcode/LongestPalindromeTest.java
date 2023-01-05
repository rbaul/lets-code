package com.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LongestPalindromeTest {
	
	@Test
	void longestPalindrome_1() {
		String result = LongestPalindrome.longestPalindrome("babad");
		Assertions.assertEquals("bab", result);
	}
	
	@Test
	void longestPalindrome_2() {
		String result = LongestPalindrome.longestPalindrome("cbbd");
		Assertions.assertEquals("bb", result);
	}
	
	@Test
	void longestPalindrome_3() {
		String result = LongestPalindrome.longestPalindrome("a");
		Assertions.assertEquals("a", result);
	}
	
	@Test
	void longestPalindrome_4() {
		String result = LongestPalindrome.longestPalindrome("ac");
		Assertions.assertEquals("a", result);
	}
	
	@Test
	void longestPalindrome_5() {
		String result = LongestPalindrome.longestPalindrome("aacabdkacaa");
		Assertions.assertEquals("aca", result);
	}
}