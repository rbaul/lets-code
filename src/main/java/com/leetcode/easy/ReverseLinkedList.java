package com.leetcode.easy;

import com.leetcode.utils.ListNode;

/**
 * Reverse Linked List
 * <p>
 * Given the head of a singly linked list, reverse the list, and return the reversed list.
 * <p>
 * Constraints:
 * <p>
 * The number of nodes in the list is the range [0, 5000].
 * -5000 <= Node.val <= 5000
 * <p>
 * <p>
 * Follow up: A linked list can be reversed either iteratively or recursively. Could you implement both?
 * <p>
 * * Definition for singly-linked list.
 * * public class ListNode {
 * *     int val;
 * *     ListNode next;
 * *     ListNode() {}
 * *     ListNode(int val) { this.val = val; }
 * *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * * }
 * <p>
 * <a href="https://leetcode.com/problems/reverse-linked-list/description/">Reverse Linked List</a>
 */
public class ReverseLinkedList {
//	public ListNode reverseList2(ListNode head) {
//		if (head == null) return null;
//
//		Stack<ListNode> stack = new Stack<>();
//		ListNode pointer = head;
//		while (pointer != null) {
//			stack.push(pointer);
//			pointer = pointer.next;
//		}
//
//		ListNode last = stack.pop();
//		ListNode prev = last;
//		while (!stack.isEmpty()) {
//			ListNode listNodeNext = stack.pop();
//			prev.next = listNodeNext;
//			prev = listNodeNext;
//		}
//		prev.next = null;
//
//		return last;
//	}
	
	public ListNode reverseList(ListNode head) {
		return reverseList(head, null);
	}
	
	public ListNode reverseList(ListNode head, ListNode newHead) {
		if (head == null) {
			return newHead;
		}
		ListNode next = head.next;
		head.next = newHead;
		return reverseList(next, head);
	}
}
