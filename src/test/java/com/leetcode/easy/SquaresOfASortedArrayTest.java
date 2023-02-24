package com.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SquaresOfASortedArrayTest {
	
	private final SquaresOfASortedArray test = new SquaresOfASortedArray();
	
	@Test
	void sortedSquares_1() {
		assertArrayEquals(new int[]{0, 1, 9, 16, 100}, test.sortedSquares(new int[]{-4, -1, 0, 3, 10}));
	}
	
	@Test
	void sortedSquares_2() {
		assertArrayEquals(new int[]{4, 9, 9, 49, 121}, test.sortedSquares(new int[]{-7, -3, 2, 3, 11}));
	}
}