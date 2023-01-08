package com.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RemoveDuplicatesTest {
	
	@Test
	void removeDuplicates_1() {
		int[] nums = {1, 1, 2};
		int result = RemoveDuplicates.removeDuplicates(nums);
		
		Assertions.assertEquals(2, result);
	}
	
	@Test
	void removeDuplicates_2() {
		int result = RemoveDuplicates.removeDuplicates(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4});
		
		Assertions.assertEquals(5, result);
	}
	
	@Test
	void removeDuplicates_3() {
		int[] nums = {1};
		int result = RemoveDuplicates.removeDuplicates(nums);
		
		Assertions.assertEquals(1, result);
	}
}