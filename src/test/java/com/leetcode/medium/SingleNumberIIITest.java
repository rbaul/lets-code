package com.leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SingleNumberIIITest {
	
	private final SingleNumberIII test = new SingleNumberIII();
	
	@Test
	void singleNumber_1() {
		assertArrayEquals(new int[]{3, 5}, test.singleNumber(new int[]{1, 2, 1, 3, 2, 5}));
	}
	
	@Test
	void singleNumber_2() {
		assertArrayEquals(new int[]{-1, 0}, test.singleNumber(new int[]{-1, 0}));
	}
	
	@Test
	void singleNumber_3() {
		assertArrayEquals(new int[]{0, 1}, test.singleNumber(new int[]{0, 1}));
	}
}