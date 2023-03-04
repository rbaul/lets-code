package com.leetcode.hard;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaxStackTest {
	
	@Test
	void maxStack_1() {
		MaxStack maxStack = new MaxStack();
		maxStack.push(-2);
		maxStack.push(-3);
		maxStack.push(0);
		assertEquals(0, maxStack.getMax()); // return 0
		maxStack.pop();
		assertEquals(-3, maxStack.top());    // return -3
		assertEquals(-2, maxStack.getMax()); // return -2
	}
}