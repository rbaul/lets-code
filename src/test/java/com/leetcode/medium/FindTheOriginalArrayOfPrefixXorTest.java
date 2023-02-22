package com.leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class FindTheOriginalArrayOfPrefixXorTest {
	
	private final FindTheOriginalArrayOfPrefixXor test = new FindTheOriginalArrayOfPrefixXor();
	
	@Test
	void findArray_1() {
		assertArrayEquals(new int[]{5, 7, 2, 3, 2}, test.findArray(new int[]{5, 2, 0, 3, 1}));
	}
	
	@Test
	void findArray_2() {
		assertArrayEquals(new int[]{13}, test.findArray(new int[]{13}));
	}
	
	@Test
	void findArray_3() {
		assertArrayEquals(new int[]{0, 0}, test.findArray(new int[]{0, 0}));
	}
}