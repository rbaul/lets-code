package com.leetcode.hard;

/**
 * Max Stack
 * <p>
 * Design a stack that supports push, pop, top, and retrieving the maximum element in constant time.
 * <p>
 * <a href="https://leetcode.com/problems/max-stack/description/">Max Stack</a>
 */
public class MaxStack {
	
	private Node head;
	
	public MaxStack() {
	}
	
	public void push(int val) {
		if (head == null) {
			head = new Node(val, val, null);
		} else {
			head = new Node(val, Math.max(val, head.maxVal), head);
		}
	}
	
	public void pop() {
		head = head.next;
	}
	
	public int top() {
		return head.val;
	}
	
	public int getMax() {
		return head.maxVal;
	}
	
	private static class Node {
		int val;
		int maxVal;
		
		Node next;
		
		public Node(int val, int maxVal, Node next) {
			this.val = val;
			this.maxVal = maxVal;
			this.next = next;
		}
	}
}
