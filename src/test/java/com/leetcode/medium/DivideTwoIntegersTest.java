package com.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DivideTwoIntegersTest {
	
	@Test
	void divide_1() {
		int result = DivideTwoIntegers.divide(10, 3);
		
		Assertions.assertEquals(3, result);
	}
	
	@Test
	void divide_2() {
		int result = DivideTwoIntegers.divide(7, -3);
		
		Assertions.assertEquals(-2, result);
	}
	
	@Test
	void divide_3() {
		int result = DivideTwoIntegers.divide(-2147483648, -1);
		
		Assertions.assertEquals(2147483647, result);
	}
	
	@Test
	void divide_4() {
		int result = DivideTwoIntegers.divide(-2147483648, 1);
		
		Assertions.assertEquals(-2147483648, result);
	}
	
	@Test
	void divide_5() {
		int result = DivideTwoIntegers.divide(-2147483648, 2);
		
		Assertions.assertEquals(-1073741824, result);
	}
}