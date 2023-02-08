package com.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindTheIndexOfTheFirstOccurrenceInAStringTest {
	
	private FindTheIndexOfTheFirstOccurrenceInAString findTheIndexOfTheFirstOccurrenceInAString = new FindTheIndexOfTheFirstOccurrenceInAString();;
	
	@Test
	void strStr_1() {
		Assertions.assertEquals(0, findTheIndexOfTheFirstOccurrenceInAString.strStr("sadbutsad", "sad"));
	}
	
	@Test
	void strStr_2() {
		Assertions.assertEquals(-1, findTheIndexOfTheFirstOccurrenceInAString.strStr("leetcode", "leeto"));
	}
	
	@Test
	void strStr_3() {
		Assertions.assertEquals(0, findTheIndexOfTheFirstOccurrenceInAString.strStr(" ", " "));
	}
}