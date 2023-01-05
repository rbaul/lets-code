package com.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FindMedianSortedArraysTest {
	
	@Test
	void findMedianSortedArrays_1() {
		double result = FindMedianSortedArrays.findMedianSortedArrays(new int[]{1, 3}, new int[]{2});
		Assertions.assertEquals(2.00000, result);
	}
	
	@Test
	void findMedianSortedArrays_2() {
		double result = FindMedianSortedArrays.findMedianSortedArrays(new int[]{1, 2}, new int[]{3, 4});
		Assertions.assertEquals(2.50000, result);
	}
}