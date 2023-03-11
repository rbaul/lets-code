package com.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SqrtXTest {
	
	private final SqrtX test = new SqrtX();
	
	@Test
	void mySqrt_1() {
		assertEquals(2, test.mySqrt(4));
	}
	
	@Test
	void mySqrt_2() {
		assertEquals(2, test.mySqrt(8));
	}
	
	@Test
	void mySqrt_3() {
		assertEquals(1, test.mySqrt(2));
	}
	
	@Test
	void mySqrt_4() {
		assertEquals(0, test.mySqrt(0));
	}
	
	@Test
	void mySqrt_5() {
		assertEquals(3, test.mySqrt(15));
	}
	
	@Test
	void mySqrt_6() {
		assertEquals(4, test.mySqrt(16));
	}
	
	@Test
	void mySqrt_7() {
		assertEquals(9, test.mySqrt(99));
	}
	
	@Test
	void mySqrt_8() {
		assertEquals(46340, test.mySqrt(Integer.MAX_VALUE));
	}
}