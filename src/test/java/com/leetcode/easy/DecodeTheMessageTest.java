package com.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DecodeTheMessageTest {
	
	private final DecodeTheMessage test = new DecodeTheMessage();
	
	@Test
	void decodeMessage_1() {
		assertEquals("this is a secret", test.decodeMessage("the quick brown fox jumps over the lazy dog", "vkbs bs t suepuv"));
	}
	
	@Test
	void decodeMessage_2() {
		assertEquals("the five boxing wizards jump quickly", test.decodeMessage("eljuxhpwnyrdgtqkviszcfmabo", "zwx hnfx lqantp mnoeius ycgk vcnjrdb"));
	}
}