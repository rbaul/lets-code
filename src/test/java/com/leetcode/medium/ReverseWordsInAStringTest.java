package com.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseWordsInAStringTest {
	
	private ReverseWordsInAString test = new ReverseWordsInAString();
	
	@Test
	void reverseWords_1() {
		Assertions.assertEquals("blue is sky the", test.reverseWords("the sky is blue"));
	}
	
	@Test
	void reverseWords_2() {
		Assertions.assertEquals("world hello", test.reverseWords("  hello world  "));
	}
	
	@Test
	void reverseWords_3() {
		Assertions.assertEquals("example good a", test.reverseWords("a good   example"));
	}
}