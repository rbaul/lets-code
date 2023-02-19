package com.leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SingleNumberIITest {
	
	private final SingleNumberII test = new SingleNumberII();
	
	@Test
	void singleNumber_1() {
		assertEquals(3, test.singleNumber(new int[]{2, 2, 3, 2}));
	}
	
	@Test
	void singleNumber_2() {
		assertEquals(99, test.singleNumber(new int[]{0, 1, 0, 1, 0, 1, 99}));
	}
}