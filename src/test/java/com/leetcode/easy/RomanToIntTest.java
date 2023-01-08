package com.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanToIntTest {
	
	@Test
	void romanToInt_1() {
		int result = RomanToInt.romanToInt("III");
		
		Assertions.assertEquals(3, result);
	}
	
	@Test
	void romanToInt_2() {
		int result = RomanToInt.romanToInt("LVIII");
		
		Assertions.assertEquals(58, result);
	}
	
	@Test
	void romanToInt_3() {
		int result = RomanToInt.romanToInt("MCMXCIV");
		
		Assertions.assertEquals(1994, result);
	}
}