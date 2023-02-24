package com.leetcode.easy;

import com.leetcode.utils.ListNode;

/**
 * Remove Linked List Elements
 * <p>
 * Given the head of a linked list and an integer val, remove all the nodes of the linked list that has Node.val == val, and return the new head.
 * <p>
 * Constraints:
 * <p>
 * The number of nodes in the list is in the range [0, 10^4].
 * 1 <= Node.val <= 50
 * 0 <= val <= 50
 * <p>
 * <a href="https://leetcode.com/problems/remove-linked-list-elements/description/">Remove Linked List Elements</a>
 */
public class RemoveLinkedListElements {
	public ListNode removeElements(ListNode head, int val) {
		while (head != null && head.val == val) {
			head = head.next;
		}
		
		if (head == null) return null;
		ListNode prev = head;
		ListNode pointer = head.next;
		while (pointer != null) {
			if (pointer.val == val) {
				prev.next = pointer.next;
				pointer = prev.next;
			} else {
				prev = pointer;
				pointer = pointer.next;
			}
		}
		
		return head;
	}
}
