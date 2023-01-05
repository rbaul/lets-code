package com.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ReverseIntegerTest {
	
	@Test
	void reverse_1() {
		int result = ReverseInteger.reverse(123);
		Assertions.assertEquals(321, result);
	}
	
	@Test
	void reverse_2() {
		int result = ReverseInteger.reverse(-123);
		Assertions.assertEquals(-321, result);
	}
	
	@Test
	void reverse_3() {
		int result = ReverseInteger.reverse(120);
		Assertions.assertEquals(21, result);
	}
	
	@Test
	void reverse_4() {
		int result = ReverseInteger.reverse(1000);
		Assertions.assertEquals(1, result);
	}
	
	@Test
	void reverse_5() {
		int result = ReverseInteger.reverse(1534236469);
		Assertions.assertEquals(0, result);
	}
	
	@Test
	void reverse_6() {
		int result = ReverseInteger.reverse(-2147483648);
		Assertions.assertEquals(0, result);
	}
}