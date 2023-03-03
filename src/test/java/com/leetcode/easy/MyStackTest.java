package com.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MyStackTest {
	
	@Test
	void myTaskTest_1() {
		MyStack myStack = new MyStack();
		myStack.push(1);
		myStack.push(2);
		Assertions.assertEquals(2, myStack.top()); // return 2
		Assertions.assertEquals(2, myStack.pop()); // return 2
		Assertions.assertFalse(myStack.empty()); // return False
	}
}