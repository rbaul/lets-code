package com.leetcode.hard;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ValidNumberTest {
	
	private final ValidNumber test = new ValidNumber();
	
	@Test
	void isNumber_1() {
		Assertions.assertTrue(test.isNumber("0"));
	}
	
	@Test
	void isNumber_2() {
		Assertions.assertFalse(test.isNumber("e"));
	}
	
	@Test
	void isNumber_3() {
		Assertions.assertFalse(test.isNumber("."));
	}
	
	@Test
	void isNumber_4() {
		Assertions.assertFalse(test.isNumber("--6"));
	}
	
	@Test
	void isNumber_5() {
		Assertions.assertFalse(test.isNumber("-+3"));
	}
	
	@Test
	void isNumber_6() {
		Assertions.assertFalse(test.isNumber("99e2.5"));
	}
	
	@Test
	void isNumber_7() {
		Assertions.assertFalse(test.isNumber("e3"));
	}
	
	@Test
	void isNumber_8() {
		Assertions.assertFalse(test.isNumber("1e"));
	}
	
	@Test
	void isNumber_9() {
		Assertions.assertFalse(test.isNumber("abc"));
	}
	
	@Test
	void isNumber_10() {
		Assertions.assertFalse(test.isNumber("1a"));
	}
	
	@Test
	void isNumber_11() {
		Assertions.assertTrue(test.isNumber("0089"));
	}
	
	@Test
	void isNumber_12() {
		Assertions.assertTrue(test.isNumber("-0.1"));
	}
	
	@Test
	void isNumber_13() {
		Assertions.assertTrue(test.isNumber("+3.14"));
	}
	
	@Test
	void isNumber_14() {
		Assertions.assertTrue(test.isNumber("4."));
	}
	
	@Test
	void isNumber_15() {
		Assertions.assertTrue(test.isNumber("-.9"));
	}
	
	@Test
	void isNumber_16() {
		Assertions.assertTrue(test.isNumber("2e10"));
	}
	
	@Test
	void isNumber_17() {
		Assertions.assertTrue(test.isNumber("-.9"));
	}
	
	@Test
	void isNumber_18() {
		Assertions.assertTrue(test.isNumber("-90E3"));
	}
	
	@Test
	void isNumber_19() {
		Assertions.assertTrue(test.isNumber("3e+7"));
	}
	
	@Test
	void isNumber_20() {
		Assertions.assertTrue(test.isNumber("+6e-1"));
	}
	
	@Test
	void isNumber_21() {
		Assertions.assertTrue(test.isNumber("53.5e93"));
	}
	
	@Test
	void isNumber_22() {
		Assertions.assertTrue(test.isNumber("-123.456e789"));
	}
}