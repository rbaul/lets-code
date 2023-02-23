package com.leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CountTripletsThatCanFormTwoArraysOfEqualXORTest {
	
	private final CountTripletsThatCanFormTwoArraysOfEqualXOR test = new CountTripletsThatCanFormTwoArraysOfEqualXOR();
	
	@Test
	void countTriplets_1() {
		assertEquals(4, test.countTriplets(new int[]{2, 3, 1, 6, 7}));
	}
	
	@Test
	void countTriplets_2() {
		assertEquals(10, test.countTriplets(new int[]{1, 1, 1, 1, 1}));
	}
}