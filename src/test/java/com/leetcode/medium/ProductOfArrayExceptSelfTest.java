package com.leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ProductOfArrayExceptSelfTest {
	
	private final ProductOfArrayExceptSelf test = new ProductOfArrayExceptSelf();
	
	@Test
	void productExceptSelf_1() {
		assertArrayEquals(new int[]{24, 12, 8, 6}, test.productExceptSelf(new int[]{1, 2, 3, 4}));
	}
	
	@Test
	void productExceptSelf_2() {
		assertArrayEquals(new int[]{0, 0, 9, 0, 0}, test.productExceptSelf(new int[]{-1, 1, 0, -3, 3}));
	}
}