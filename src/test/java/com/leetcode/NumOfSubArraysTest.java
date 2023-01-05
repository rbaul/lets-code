package com.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class NumOfSubArraysTest {
	
	@Test
	void numOfSubarrays_1() {
		int[] arr = new int[]{2, 2, 2, 2, 5, 5, 5, 8};
		int k = 3;
		int threshold = 4;
		
		int count = NumOfSubArrays.numOfSubarrays(arr, k, threshold);
		
		Assertions.assertEquals(3, count);
	}
	
	@Test
	void numOfSubarrays_2() {
		int[] arr = new int[]{11, 13, 17, 23, 29, 31, 7, 5, 2, 3};
		int k = 3;
		int threshold = 5;
		
		int count = NumOfSubArrays.numOfSubarrays(arr, k, threshold);
		
		Assertions.assertEquals(6, count);
	}
}