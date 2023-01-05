package com.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class FourSumTest {
	
	@Test
	void fourSum_1() {
		int[] nums = new int[]{1,0,-1,0,-2,2};
		List<List<Integer>> fourSum = FourSum.fourSum(nums, 0);
		
		Assertions.assertEquals(3, fourSum.size());
	}
	
	@Test
	void fourSum_2() {
		int[] nums = new int[]{2,2,2,2,2};
		List<List<Integer>> fourSum = FourSum.fourSum(nums, 8);
		
		Assertions.assertEquals(1, fourSum.size());
	}
	
	@Test
	void fourSum_3() {
		int[] nums = new int[]{2};
		List<List<Integer>> fourSum = FourSum.fourSum(nums, 2);
		
		Assertions.assertEquals(0, fourSum.size());
	}
	
	@Test
	void fourSum_4() {
		int[] nums = new int[]{2, 2};
		List<List<Integer>> fourSum = FourSum.fourSum(nums, 4);
		
		Assertions.assertEquals(0, fourSum.size());
	}
	
	@Test
	void fourSum_5() {
		int[] nums = new int[]{5,0,2,-5,-5,4,-5,1,-1};
		List<List<Integer>> fourSum = FourSum.fourSum(nums, 5);
		
		Assertions.assertEquals(3, fourSum.size());
	}
	
	@Test
	void fourSum_6() {
		int[] nums = new int[]{1_000_000_000,1_000_000_000,1_000_000_000,1_000_000_000};
		List<List<Integer>> fourSum = FourSum.fourSum(nums, -294967296);
		
		Assertions.assertEquals(0, fourSum.size());
	}
}