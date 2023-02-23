package com.leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MinimumRoundsToCompleteAllTasksTest {
	
	private final MinimumRoundsToCompleteAllTasks test = new MinimumRoundsToCompleteAllTasks();
	
	@Test
	void minimumRounds_1() {
		assertEquals(4, test.minimumRounds(new int[]{2, 2, 3, 3, 2, 4, 4, 4, 4, 4}));
	}
	
	@Test
	void minimumRounds_2() {
		assertEquals(-1, test.minimumRounds(new int[]{2, 3, 3}));
	}
	
	@Test
	void minimumRounds_3() {
		assertEquals(2, test.minimumRounds(new int[]{5, 5, 5, 5}));
	}
}