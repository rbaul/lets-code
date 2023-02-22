package com.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class DecodeXORedArrayTest {
	
	private final DecodeXORedArray test = new DecodeXORedArray();
	
	@Test
	void decode_1() {
		assertArrayEquals(new int[]{1, 0, 2, 1}, test.decode(new int[]{1, 2, 3}, 1));
	}
	
	@Test
	void decode_2() {
		assertArrayEquals(new int[]{4, 2, 0, 7, 4}, test.decode(new int[]{6, 2, 7, 3}, 4));
	}
}