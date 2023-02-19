package com.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SingleNumberTest {
	
	private final SingleNumber test = new SingleNumber();
	
	@Test
	void singleNumber_1() {
		assertEquals(1, test.singleNumber(new int[]{2, 2, 1}));
	}
	
	@Test
	void singleNumber_2() {
		assertEquals(4, test.singleNumber(new int[]{4, 1, 2, 1, 2}));
	}
	
	@Test
	void singleNumber_3() {
		assertEquals(1, test.singleNumber(new int[]{1}));
	}
}