package com.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class MoveZeroesTest {
	
	private final MoveZeroes test = new MoveZeroes();
	
	@Test
	void moveZeroes_1() {
		int[] nums = {0, 1, 0, 3, 12};
		test.moveZeroes(nums);
		assertArrayEquals(new int[]{1, 3, 12, 0, 0}, nums);
	}
	
	@Test
	void moveZeroes_2() {
		int[] nums = {0};
		test.moveZeroes(nums);
		assertArrayEquals(new int[]{0}, nums);
	}
	
	@Test
	void moveZeroes_3() {
		int[] nums = {4, 1, 5, 3, 12};
		test.moveZeroes(nums);
		assertArrayEquals(new int[]{4, 1, 5, 3, 12}, nums);
	}
}