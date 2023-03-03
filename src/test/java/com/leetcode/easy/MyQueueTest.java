package com.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyQueueTest {
	
	@Test
	void myQueue_1() {
		MyQueue myQueue = new MyQueue();
		myQueue.push(1); // queue is: [1]
		myQueue.push(2); // queue is: [1, 2] (leftmost is front of the queue)
		assertEquals(1, myQueue.peek()); // return 1
		assertEquals(1, myQueue.pop()); // return 1, queue is [2]
		assertFalse(myQueue.empty()); // return false
	}
}