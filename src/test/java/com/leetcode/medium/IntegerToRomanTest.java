package com.leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntegerToRomanTest {
	
	private final IntegerToRoman test = new IntegerToRoman();
	
	@Test
	void intToRoman_1() {
		assertEquals("III", test.intToRoman(3));
	}
	
	@Test
	void intToRoman_2() {
		assertEquals("LVIII", test.intToRoman(58));
	}
	
	@Test
	void intToRoman_3() {
		assertEquals("MCMXCIV", test.intToRoman(1994));
	}
	
	@Test
	void intToRoman_4() {
		assertEquals("XIX", test.intToRoman(19));
	}
}