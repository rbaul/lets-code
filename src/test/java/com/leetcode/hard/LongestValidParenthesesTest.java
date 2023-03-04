package com.leetcode.hard;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestValidParenthesesTest {
	
	private final LongestValidParentheses test = new LongestValidParentheses();
	
	@Test
	void longestValidParentheses_1() {
		assertEquals(2, test.longestValidParentheses("(()"));
	}
	
	@Test
	void longestValidParentheses_2() {
		assertEquals(4, test.longestValidParentheses(")()())"));
	}
	
	@Test
	void longestValidParentheses_3() {
		assertEquals(0, test.longestValidParentheses(""));
	}
	
	@Test
	void longestValidParentheses_4() {
		assertEquals(2, test.longestValidParentheses("()(()"));
	}
}