package com.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ThreeSumClosestTest {
	
	@Test
	void threeSumClosest_1() {
		int[] nums = new int[]{4, -1, 3, -2, 0, 6, -5};
		int threeSumClosest = ThreeSumClosest.threeSumClosest(nums, 4);
		
		Assertions.assertEquals(4, threeSumClosest);
	}
	
	@Test
	void threeSumClosest_2() {
		int[] nums = new int[]{4, -1, 30, -2, 0, 6, -5};
		int threeSumClosest = ThreeSumClosest.threeSumClosest(nums, 6);
		
		Assertions.assertEquals(5, threeSumClosest);
	}
	
	@Test
	void threeSumClosest_3() {
		int[] nums = new int[]{0, 0, 0};
		int threeSumClosest = ThreeSumClosest.threeSumClosest(nums, 4);
		
		Assertions.assertEquals(0, threeSumClosest);
	}
	
	@Test
	void threeSumClosest_4() {
		int[] nums = new int[]{0, 1, 2};
		int threeSumClosest = ThreeSumClosest.threeSumClosest(nums, 0);
		
		Assertions.assertEquals(3, threeSumClosest);
	}
}