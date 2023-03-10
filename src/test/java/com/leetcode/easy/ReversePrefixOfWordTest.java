package com.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReversePrefixOfWordTest {
	
	private final ReversePrefixOfWord test = new ReversePrefixOfWord();
	
	@Test
	void reversePrefix_1() {
		assertEquals("dcbaefd", test.reversePrefix("abcdefd", 'd'));
	}
	
	@Test
	void reversePrefix_2() {
		assertEquals("zxyxxe", test.reversePrefix("xyxzxe", 'z'));
	}
	
	@Test
	void reversePrefix_3() {
		assertEquals("abcd", test.reversePrefix("abcd", 'z'));
	}
}