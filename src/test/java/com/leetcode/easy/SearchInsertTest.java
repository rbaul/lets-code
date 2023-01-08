package com.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SearchInsertTest {
	
	@Test
	void searchInsert_1() {
		int result = SearchInsert.searchInsert(new int[]{1, 3, 5, 6}, 5);
		
		Assertions.assertEquals(2, result);
	}
	
	@Test
	void searchInsert_2() {
		int result = SearchInsert.searchInsert(new int[]{1, 3, 5, 6}, 2);
		
		Assertions.assertEquals(1, result);
	}
	
	@Test
	void searchInsert_3() {
		int result = SearchInsert.searchInsert(new int[]{1, 3, 5, 6}, 7);
		
		Assertions.assertEquals(4, result);
	}
}