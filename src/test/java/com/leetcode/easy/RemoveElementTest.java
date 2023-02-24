package com.leetcode.easy;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

class RemoveElementTest {
	
	private final RemoveElement test = new RemoveElement();
	
	@Test
	void removeElement_1() {
		int[] nums = new int[]{3, 2, 2, 3}; // Input array
		int val = 3; // Value to remove
		int[] expectedNums = new int[]{2, 2}; // The expected answer with correct length.
		// It is sorted with no values equaling val.
		
		checkMethod(nums, val, expectedNums);
	}
	
	@Test
	void removeElement_2() {
		int[] nums = new int[]{0, 1, 2, 2, 3, 0, 4, 2}; // Input array
		int val = 2; // Value to remove
		int[] expectedNums = new int[]{0, 0, 1, 3, 4}; // The expected answer with correct length.
		// It is sorted with no values equaling val.
		
		checkMethod(nums, val, expectedNums);
	}
	
	@Test
	void removeElement_3() {
		int[] nums = new int[]{1}; // Input array
		int val = 1; // Value to remove
		int[] expectedNums = new int[]{}; // The expected answer with correct length.
		// It is sorted with no values equaling val.
		
		checkMethod(nums, val, expectedNums);
	}
	
	@Test
	void removeElement_4() {
		int[] nums = new int[]{2}; // Input array
		int val = 3; // Value to remove
		int[] expectedNums = new int[]{2}; // The expected answer with correct length.
		// It is sorted with no values equaling val.
		
		checkMethod(nums, val, expectedNums);
	}
	
	private void checkMethod(int[] nums, int val, int[] expectedNums) {
		int k = test.removeElement(nums, val); // Calls your implementation
		
		assert k == expectedNums.length;
		Arrays.sort(nums, 0, k); // Sort the first k elements of nums
		for (int i = 0; i < expectedNums.length; i++) {
			assert nums[i] == expectedNums[i];
		}
	}
}