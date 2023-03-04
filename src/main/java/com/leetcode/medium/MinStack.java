package com.leetcode.medium;

import java.util.Stack;

/**
 * Min Stack
 * <p>
 * Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
 * <p>
 * Implement the MinStack class:
 * <p>
 * MinStack() initializes the stack object.
 * void push(int val) pushes the element val onto the stack.
 * void pop() removes the element on the top of the stack.
 * int top() gets the top element of the stack.
 * int getMin() retrieves the minimum element in the stack.
 * You must implement a solution with O(1) time complexity for each function.
 * <p>
 * Constraints:
 * <p>
 * -2^31 <= val <= 2^31 - 1
 * Methods pop, top and getMin operations will always be called on non-empty stacks.
 * At most 3 * 104 calls will be made to push, pop, top, and getMin.
 * <p>
 * <a href="https://leetcode.com/problems/min-stack/">Min Stack</a>
 */
public class MinStack {
	
	private final Stack<LinkedNode> stack;
	
	private final LinkedNodeList nodeListSortMin;
	
	public MinStack() {
		this.stack = new Stack<>();
		this.nodeListSortMin = new LinkedNodeList();
	}
	
	public void push(int val) {
		LinkedNode node = new LinkedNode(val);
		stack.push(node);
		nodeListSortMin.add(node);
	}
	
	public void pop() {
		LinkedNode linkedNode = stack.pop();
		nodeListSortMin.remove(linkedNode);
	}
	
	public int top() {
		return stack.peek().value;
	}
	
	public int getMin() {
		return nodeListSortMin.getMin().value;
	}
	
	private static class LinkedNode {
		public int value;
		public LinkedNode prev;
		public LinkedNode next;
		
		public LinkedNode() {
		}
		
		public LinkedNode(int value) {
			this.value = value;
		}
	}
	
	private static class LinkedNodeList {
		public LinkedNode maxPointer;
		public LinkedNode minPointer;
		
		public LinkedNodeList() {
			maxPointer = new LinkedNode();
			minPointer = new LinkedNode();
			
			maxPointer.next = minPointer;
			minPointer.prev = maxPointer;
		}
		
		public LinkedNode getMin() {
			return minPointer.prev != maxPointer ? minPointer.prev : null;
		}
		
		public void add(LinkedNode linkedNode) {
			if (maxPointer.next == minPointer) {
				addAfter(linkedNode, maxPointer);
			} else {
				LinkedNode maxNode = maxPointer.next;
				LinkedNode minNode = minPointer.prev;
				
				while (minNode.value < linkedNode.value && maxPointer != minNode) {
					minNode = minNode.prev;
				}
				addAfter(linkedNode, minNode);
			}
		}
		
		public void addAfter(LinkedNode nodeToAdd, LinkedNode nodeBefore) {
			if (nodeBefore == null) {
				nodeBefore = maxPointer;
			}
			LinkedNode nodeAfter = nodeBefore.next;
			nodeAfter.prev = nodeToAdd;
			nodeToAdd.next = nodeAfter;
			
			nodeBefore.next = nodeToAdd;
			nodeToAdd.prev = nodeBefore;
		}
		
		private void remove(LinkedNode nodeToRemove) {
			LinkedNode nodeAfter = nodeToRemove.next;
			LinkedNode nodeBefore = nodeToRemove.prev;
			
			nodeBefore.next = nodeAfter;
			nodeAfter.prev = nodeBefore;
			
			nodeToRemove.next = null;
			nodeToRemove.prev = null;
			
		}
		
		@Override
		public String toString() {
			StringBuilder stringBuilder = new StringBuilder();
			LinkedNode starter = maxPointer.next;
			while (starter != minPointer) {
				stringBuilder.append(starter.toString());
				starter = starter.next;
			}
			return stringBuilder.toString();
		}
	}
}
