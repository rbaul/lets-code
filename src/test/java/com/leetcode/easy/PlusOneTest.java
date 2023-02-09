package com.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PlusOneTest {
	
	private final PlusOne test = new PlusOne();
	
	@Test
	void plusOne_1() {
		Assertions.assertArrayEquals(new int[]{1, 2, 4}, test.plusOne(new int[]{1, 2, 3}));
	}
	
	@Test
	void plusOne_2() {
		Assertions.assertArrayEquals(new int[]{4, 3, 2, 2}, test.plusOne(new int[]{4, 3, 2, 1}));
	}
	
	@Test
	void plusOne_3() {
		Assertions.assertArrayEquals(new int[]{1, 0}, test.plusOne(new int[]{9}));
	}
}