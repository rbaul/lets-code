package com.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class ThreeSumTest {
	
	@Test
	void threeSum_1() {
		int[] nums = new int[]{-1, 0, 1, 2, -1, -4};
		List<List<Integer>> threeSum = ThreeSum.threeSum(nums);
		
		Assertions.assertEquals(2, threeSum.size());
	}
	
	@Test
	void threeSum_2() {
		int[] nums = new int[]{0, 1, 1};
		List<List<Integer>> threeSum = ThreeSum.threeSum(nums);
		
		Assertions.assertEquals(0, threeSum.size());
	}
	
	@Test
	void threeSum_3() {
		int[] nums = new int[]{0, 0, 0, 0};
		List<List<Integer>> threeSum = ThreeSum.threeSum(nums);
		
		Assertions.assertEquals(1, threeSum.size());
	}
	
	@Test
	void threeSum_4() {
		int[] nums = new int[]{0, 0, 0};
		List<List<Integer>> threeSum = ThreeSum.threeSum(nums);
		
		Assertions.assertEquals(1, threeSum.size());
	}
}