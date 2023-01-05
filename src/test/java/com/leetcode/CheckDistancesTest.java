package com.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CheckDistancesTest {
	
	@Test
	void checkDistances_1() {
		boolean wellSpaces = CheckDistances.checkDistances("abaccb", new int[]{1, 3, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0});
		Assertions.assertTrue(wellSpaces);
	}
	
	@Test
	void checkDistances_2() {
		boolean wellSpaces = CheckDistances.checkDistances("aa", new int[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0});
		Assertions.assertFalse(wellSpaces);
	}
}