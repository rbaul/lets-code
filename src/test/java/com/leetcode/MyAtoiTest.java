package com.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MyAtoiTest {
	
	@Test
	void myAtoi_1() {
		int result = MyAtoi.myAtoi("42");
		Assertions.assertEquals(42, result);
	}
	
	@Test
	void myAtoi_2() {
		int result = MyAtoi.myAtoi("   -42");
		Assertions.assertEquals(-42, result);
	}
	
	@Test
	void myAtoi_3() {
		int result = MyAtoi.myAtoi("4193 with words");
		Assertions.assertEquals(4193, result);
	}
	
	@Test
	void myAtoi_4() {
		int result = MyAtoi.myAtoi("0032");
		Assertions.assertEquals(32, result);
	}
	
	@Test
	void myAtoi_5() {
		int result = MyAtoi.myAtoi("no digits");
		Assertions.assertEquals(0, result);
	}
	
	@Test
	void myAtoi_6() {
		int result = MyAtoi.myAtoi("words and 987");
		Assertions.assertEquals(0, result);
	}
	
	@Test
	void myAtoi_7() {
		int result = MyAtoi.myAtoi("-91283472332");
		Assertions.assertEquals(-2147483648, result);
	}
	
	@Test
	void myAtoi_8() {
		int result = MyAtoi.myAtoi("+-12");
		Assertions.assertEquals(0, result);
	}
}