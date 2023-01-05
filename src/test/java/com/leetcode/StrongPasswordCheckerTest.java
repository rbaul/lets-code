package com.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StrongPasswordCheckerTest {
	
	@Test
	void strongPasswordChecker_1() {
		int result = StrongPasswordChecker.strongPasswordChecker("a");
		Assertions.assertEquals(5, result);
	}
	
	@Test
	void strongPasswordChecker_2() {
		int result = StrongPasswordChecker.strongPasswordChecker("aA1");
		Assertions.assertEquals(3, result);
	}
	
	@Test
	void strongPasswordChecker_3() {
		int result = StrongPasswordChecker.strongPasswordChecker("1337C0d3");
		Assertions.assertEquals(0, result);
	}
	
	@Test
	void strongPasswordChecker_4() {
		int result = StrongPasswordChecker.strongPasswordChecker("Baaabb0");
		Assertions.assertEquals(1, result);
	}
	
	@Test
	void strongPasswordChecker_5() {
		int result = StrongPasswordChecker.strongPasswordChecker("Baaba0");
		Assertions.assertEquals(0, result);
	}
	
	@Test
	void strongPasswordChecker_6() {
		int result = StrongPasswordChecker.strongPasswordChecker("aaa123");
		Assertions.assertEquals(1, result);
	}
	
	@Test
	void strongPasswordChecker_7() {
		int result = StrongPasswordChecker.strongPasswordChecker("aaaB1");
		Assertions.assertEquals(1, result);
	}
	
	@Test
	void strongPasswordChecker_8() {
		int result = StrongPasswordChecker.strongPasswordChecker("1111111111");
		Assertions.assertEquals(3, result);
	}
}