package com.leetcode.easy;

import java.util.LinkedList;

/**
 * Implement Stack using Queues
 * <p>
 * Implement a last-in-first-out (LIFO) stack using only two queues. The implemented stack should support all the functions of a normal stack (push, top, pop, and empty).
 * <p>
 * Implement the MyStack class:
 * <p>
 * void push(int x) Pushes element x to the top of the stack.
 * int pop() Removes the element on the top of the stack and returns it.
 * int top() Returns the element on the top of the stack.
 * boolean empty() Returns true if the stack is empty, false otherwise.
 * Notes:
 * <p>
 * You must use only standard operations of a queue, which means that only push to back, peek/pop from front, size and is empty operations are valid.
 * Depending on your language, the queue may not be supported natively. You may simulate a queue using a list or deque (double-ended queue) as long as you use only a queue's standard operations.
 * <p>
 * Constraints:
 * <p>
 * 1 <= x <= 9
 * At most 100 calls will be made to push, pop, top, and empty.
 * All the calls to pop and top are valid.
 * <p>
 * <p>
 * Follow-up: Can you implement the stack using only one queue?
 * <p>
 * <a href="https://leetcode.com/problems/implement-stack-using-queues/">Implement Stack using Queues</a>
 */
public class MyStack {
	
	private final LinkedList<Integer> queue;
	public MyStack() {
		this.queue = new LinkedList<>();
	}
	
	public void push(int x) {
		this.queue.add(0, x);
	}
	
	public int pop() {
		return this.queue.poll();
	}
	
	public int top() {
		return this.queue.peek();
	}
	
	public boolean empty() {
		return this.queue.isEmpty();
	}
}
