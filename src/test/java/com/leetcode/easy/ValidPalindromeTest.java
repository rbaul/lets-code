package com.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ValidPalindromeTest {
	
	@Test
	void isPalindrome_1() {
		Assertions.assertTrue(ValidPalindrome.isPalindrome("A man, a plan, a canal: Panama"));
	}
	
	@Test
	void isPalindrome_2() {
		Assertions.assertFalse(ValidPalindrome.isPalindrome("race a car"));
	}
	
	@Test
	void isPalindrome_3() {
		Assertions.assertTrue(ValidPalindrome.isPalindrome(" "));
	}
	
	@Test
	void isPalindrome_4() {
		Assertions.assertTrue(ValidPalindrome.isPalindrome(""));
	}
}