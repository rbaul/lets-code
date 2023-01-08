package com.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

class ContainerWithMostWaterTest {
	
	@Test
	@Timeout(value = 5, unit = TimeUnit.MILLISECONDS)
	void maxArea_1() {
		int result = ContainerWithMostWater.maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7});
		
		Assertions.assertEquals(49, result);
	}
	
	@Test
	void maxArea_2() {
		int result = ContainerWithMostWater.maxArea(new int[]{1, 1});
		
		Assertions.assertEquals(1, result);
	}
	
}