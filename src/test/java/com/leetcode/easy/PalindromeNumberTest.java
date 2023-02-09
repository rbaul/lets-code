package com.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PalindromeNumberTest {
	
	private final PalindromeNumber test = new PalindromeNumber();
	
	@Test
	void isPalindrome_1() {
		Assertions.assertTrue(test.isPalindrome(121));
	}
	
	@Test
	void isPalindrome_2() {
		Assertions.assertFalse(test.isPalindrome(-121));
	}
	
	@Test
	void isPalindrome_3() {
		Assertions.assertFalse(test.isPalindrome(10));
	}
}