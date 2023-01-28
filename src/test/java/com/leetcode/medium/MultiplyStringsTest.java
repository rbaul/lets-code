package com.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultiplyStringsTest {
	
	@Test
	void multiply_1() {
		Assertions.assertEquals("6", MultiplyStrings.multiply("2", "3"));
	}
	
	@Test
	void multiply_2() {
		Assertions.assertEquals("56088", MultiplyStrings.multiply("123", "456"));
	}
	
	@Test
	void multiply_3() {
		Assertions.assertEquals("442", MultiplyStrings.multiply("13", "34"));
	}
	
	@Test
	void multiply_4() {
		Assertions.assertEquals("0", MultiplyStrings.multiply("9133", "0"));
	}
}