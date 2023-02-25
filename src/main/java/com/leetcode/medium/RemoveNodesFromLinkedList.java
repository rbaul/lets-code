package com.leetcode.medium;

import com.leetcode.utils.ListNode;

import java.util.Stack;

/**
 * Remove Nodes From Linked List
 * <p>
 * You are given the head of a linked list.
 * <p>
 * Remove every node which has a node with a strictly greater value anywhere to the right side of it.
 * <p>
 * Return the head of the modified linked list.
 * <p>
 * Constraints:
 * <p>
 * The number of the nodes in the given list is in the range [1, 10^5].
 * 1 <= Node.val <= 10^5
 * <p>
 * <a href="https://leetcode.com/problems/remove-nodes-from-linked-list/description/">Remove Nodes From Linked List</a>
 */
public class RemoveNodesFromLinkedList {
//	public ListNode removeNodes(ListNode head) {
//		Stack<ListNode> prevPoints = new Stack<>();
//		ListNode pointer = head;
//
//		while (pointer != null && pointer.next != null) {
//			int val = pointer.val;
//			ListNode next = pointer.next;
//			int nextVal = next.val;
//			if (val < nextVal) {
//
//				// Check points
//				ListNode lastPoint = null;
//				while (!prevPoints.isEmpty()) {
//					lastPoint = prevPoints.peek();
//					if (lastPoint.val < nextVal) {
//						prevPoints.pop();
//					} else {
//						break;
//					}
//				}
//				if (prevPoints.isEmpty()) { // must be head
//					head = next;
//				} else {
//					lastPoint.next = next;
//				}
//			} else {
//				prevPoints.push(pointer);
//			}
//			pointer = next;
//
//		}
//
//		return head;
//	}
	
	public ListNode removeNodes(ListNode head) {
		Stack<ListNode> prevPoints = new Stack<>();
		ListNode pointer = head;
		
		while (pointer != null) {
			if (!prevPoints.isEmpty()) {
				ListNode lastPoint = null;
				while (!prevPoints.isEmpty()) {
					lastPoint = prevPoints.peek();
					if (lastPoint.val < pointer.val) {
						prevPoints.pop();
					} else {
						break;
					}
				}
				
				if (prevPoints.isEmpty()) { // must be head
					head = pointer;
				} else {
					lastPoint.next = pointer;
				}
			}
			prevPoints.push(pointer);
			pointer = pointer.next;
			
		}
		
		return head;
	}
}
