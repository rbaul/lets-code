package com.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MissingNumberTest {
	
	private final MissingNumber test = new MissingNumber();
	
	@Test
	void missingNumber_1() {
		assertEquals(2, test.missingNumber(new int[]{3, 0, 1}));
	}
	
	@Test
	void missingNumber_2() {
		assertEquals(2, test.missingNumber(new int[]{0, 1}));
	}
	
	@Test
	void missingNumber_3() {
		assertEquals(8, test.missingNumber(new int[]{9, 6, 4, 2, 3, 5, 7, 0, 1}));
	}
}