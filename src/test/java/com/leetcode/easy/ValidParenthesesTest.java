package com.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidParenthesesTest {
	
	private final ValidParentheses test = new ValidParentheses();
	
	@Test
	void isValid_1() {
		assertTrue(test.isValid("()"));
	}
	
	@Test
	void isValid_2() {
		assertTrue(test.isValid("()[]{}"));
	}
	
	@Test
	void isValid_3() {
		assertFalse(test.isValid("(]"));
	}
}