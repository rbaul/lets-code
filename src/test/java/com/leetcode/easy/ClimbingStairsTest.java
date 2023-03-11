package com.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClimbingStairsTest {
	
	private final ClimbingStairs test = new ClimbingStairs();
	
	@Test
	void climbStairs_0() {
		assertEquals(1, test.climbStairs(1));
	}
	
	@Test
	void climbStairs_1() {
		assertEquals(2, test.climbStairs(2));
	}
	
	@Test
	void climbStairs_2() {
		assertEquals(3, test.climbStairs(3));
	}
	
	@Test
	void climbStairs_3() {
		assertEquals(5, test.climbStairs(4));
	}
	
	@Test
	void climbStairs_4() {
		assertEquals(8, test.climbStairs(5));
	}
}